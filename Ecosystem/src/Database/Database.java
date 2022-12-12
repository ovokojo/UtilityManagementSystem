/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author thomaskojoaddaquay
 */
public class Database {
       /**
     * Connect to a sample database
     */
    private static String QUERY = "SELECT * FROM User";
    private static String INSERTQUERY = "INSERT INTO User (username, password, role) VALUES ('Sean Doe', 'sdoe', 'Manager')";
    public static void connect() {
        Connection conn = null;
        try {
            // db parameters
            // Note: change filepath to run locally
            String url = "jdbc:sqlite:/Users/thomaskojoaddaquay/Desktop/UtilityManagementSystem/Ecosystem/src/Database/localdb.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            System.out.println("Connection to SQLite has been established.");
            // insertUser(statement);
            getUsers(statement);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
              System.out.println("Exception");
        }   
    }
    
    public static void getUsers(Statement statement) {
                try {
                ResultSet rs =  statement.executeQuery(QUERY);
                // Extract data from result set
                while (rs.next()) {
                    // Retrieve by column name
                    System.out.println("username: " + rs.getString("username"));
                    System.out.println("password: " + rs.getString("password"));
                    System.out.println("role:" + rs.getString("role"));
                } 
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    
        public static void insertUser(Statement statement) {
                try {
                statement.executeUpdate(INSERTQUERY);
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connect();
    }
}
