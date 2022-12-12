/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import Models.Muncipality.CitizenInfo;
import Models.User.RoleType;
import Models.User.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author thomaskojoaddaquay
 */
public class Database {
    private static String url = "jdbc:sqlite:/Users/thomaskojoaddaquay/Desktop/UtilityManagementSystem/Ecosystem/src/Database/localdb.db";
       /**
     * Query types
     */
    private static String GET_USERS = "SELECT * FROM User";
    private static String START_INSERT_USER = "INSERT INTO User (username, password, role) VALUES (";
    private static String START_INSERT_CUSTOMER = "INSERT INTO User (username, password, role, name, ssn, phone, birthDate) VALUES (";
    private static String END_INSERT_USER = ")";
    
    public static ArrayList<User> getUsers() {
        Connection conn = null;
        ArrayList<User> users = new ArrayList();
        try {
            // Connect to db
            conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            System.out.println("Connected!");
            try {
                ResultSet _result =  statement.executeQuery(GET_USERS);
                // Extract data from result set
                while (_result.next()) {
                    // Create user
                    String username = _result.getString("username");
                    String password = _result.getString("password");
                    String role = _result.getString("role");
                    User user = new User(username, password, role);
                    users.add(user);
                   if (role.equals(RoleType.Customer)) {
                        String name = _result.getString("name");
                         String ssn = _result.getString("ssn");
                         String birthDate = _result.getString("birthDate");
                         String phone = _result.getString("phone");
                        CitizenInfo data = new CitizenInfo(name, ssn, birthDate, phone);
                        user.setCitizenInfo(data);
                    }
                } 
                conn.close();
            } catch (SQLException ex) {
                conn.close();
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
              System.out.println("Exception");
        }   
        return users;
    }   
        public static boolean createUser(User user, CitizenInfo info) {
            boolean isComplete = false;
            Connection conn = null;
            // Create insert statement
           String username = user.getUsername();
           String password = user.getPassword();
           String role = user.getRole();
           String insertStatement = START_INSERT_USER + "'" + username + "', '" + password + "', '" + role + "'" + END_INSERT_USER;
            if (role.equals(RoleType.Customer)) {
                String name = info.getName();
                String ssn = info.getSsn();
                String phone = info.getPhone();
                String birthDate = info.getBirthDate();
                insertStatement = START_INSERT_CUSTOMER + "'" + username + "', '" + password + "', '" + role +  "', '" + name +  "', '" + ssn + "', '" +  birthDate + "', '" + phone + "'" + END_INSERT_USER;
            }
           System.out.println(insertStatement);
        try {
            // Connect to db
            conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            System.out.println("Connected!");
               try {
                statement.executeUpdate(insertStatement);
                  System.out.println("Success!");
                conn.close();
            } catch (SQLException ex) {
                conn.close();
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
              System.out.println("Exception");
        }   
                  
         return isComplete;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createUser(new User("cus", "cus", "Customer"), new CitizenInfo("Tom Smith", "8787587563", "0987564758", "10-10-1990"));
        // getUsers();
    }
}
