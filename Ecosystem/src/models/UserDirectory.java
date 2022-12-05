/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.text.MessageFormat;
import java.util.ArrayList;

/**
 *
 * @author thomaskojoaddaquay
 */
public class UserDirectory {
    private static User activeUser;
    private static ArrayList<User> users  =  new ArrayList<User>();
    public UserDirectory() {
        // Initialize System admin & admin users
        SystemAdmin sys = new SystemAdmin("sys", "admin");
        Admin bankAdmin = new Admin("bank", "admin", Enterprise.Bank, Role.admin);
        Admin walletAdmin = new Admin("wallet", "admin", Enterprise.Wallet, Role.admin);
        Admin utilityAdmin = new Admin("utility", "admin", Enterprise.Utility, Role.admin);
        Admin govtAdmin = new Admin("govt", "admin", Enterprise.Government, Role.admin);
        users.add(sys);
        users.add(bankAdmin);
        users.add(walletAdmin);
        users.add(utilityAdmin);
        users.add(govtAdmin);
  }
     public static ArrayList<User> getUsers() {
             for (User user:  users) {
                String _name = user.username;
                System.out.println(MessageFormat.format("{0} Successfully Created!", _name));
        }
        return users;
    }
        public static Boolean checkUsername(String username) {
        Boolean userExists = false;
        for (User user:  users) {
            if ( username.equals(user.getUsername())) {
             System.out.println("Username valid");
             userExists = true;
             return userExists;
            }
        }
        return userExists;
    } 
    
     public static Boolean checkPassword(String username, String password) {
        Boolean userExists = false;
        for (User user:  users) {
            if (password.equals(user.getPassword()) && username.equals(user.getUsername())) {
                 System.out.println("Password valid");
             userExists = true;
             return userExists;
            }
        }
        return userExists;
    } 
    
    public static Boolean login(String username, String password) {
        Boolean userLoggedIn = false;
        for (User user:  users) {
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
             userLoggedIn = true;
            }
        }
        return userLoggedIn;
    }
    
    public static void addUser(User user) {
        users.add(user);
    }
}
