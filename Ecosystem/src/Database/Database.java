/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
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
    public static String GETUSERS = "SELECT * FROM User";
   //  public static String INSERTUSER = "INSERT INTO User (username, password, role) VALUES ('Sean Doe', 'sdoe', 'Manager')";
    public static ArrayList<User> getUsers() {
        Connection conn = null;
        ArrayList<User> users = new ArrayList();
        try {
            // Connect to db
            conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            System.out.println("Connected!");
            try {
                ResultSet _result =  statement.executeQuery(GETUSERS);
                // Extract data from result set
                while (_result.next()) {
                    // Create user
                    String username = _result.getString("username");
                    String password = _result.getString("password");
                    String role = _result.getString("role");
                    User user = new User(username, password, role);
                    users.add(user);
                } 
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
              System.out.println("Exception");
        }   
        return users;
    }   
//        public static void insertUser(Statement statement) {
//                try {
//                statement.executeUpdate(INSERTQUERY);
//            } catch (SQLException ex) {
//                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//                }
//    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        getUsers();
    }
}
