/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author thomaskojoaddaquay
 */
public class UserDirectory {
    static ArrayList<User> users;
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
}
