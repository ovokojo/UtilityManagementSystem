/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.User;

import Business.Role.RoleType;
import Business.Enterprise.Enterprise;
import Business.Staff.Staff;
import java.text.MessageFormat;
import java.util.ArrayList;

/**
 *
 * @author thomaskojoaddaquay
 */
public class UserDirectory {
    
    private ArrayList<User> userAccountList;

    public UserDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<User> getUserAccountList() {
        return userAccountList;
    }
   
     public User createNewUser(String username, String password, Staff staff, RoleType role){
        User userAccount = new User();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setStaff(staff);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public User removeUserAccount(User useraccount){
        userAccountList.remove(useraccount);
        return useraccount;
    }
    
    public boolean IsUsernameUnique(String username){
        for (User ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public User validUser(String username, String password){
        for (User ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
   
   
}
