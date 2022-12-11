/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.User;
import java.util.ArrayList;

/**
 *
 * @author thomaskojoaddaquay
 */
public class UserDirectory {
   private User activeUser;
   public ArrayList<User> allUsers  = new ArrayList();
   
    public UserDirectory() {
        // sys admin
    initializeSysAdmin();
    initializeMunicipalityAdmin();
     initializeUtilityAdmin();
    }
    

    public User getActiveUser() {
        return activeUser;
    }
    public ArrayList<User> getAllUsers() {
        return allUsers;
    }
    
    public void addUser(User u) {
        allUsers.add(u);
    }
   
     public User createNewUser(String username, String password, String role){
        User userAccount = new User(username, password, role);
        allUsers.add(userAccount);
        return userAccount;
    }
    
    public User removeUserAccount(User useraccount){
        allUsers.remove(useraccount);
        return useraccount;
    }
    
    public boolean doesUsernameExist(String username){
        for (User ua : allUsers){
            if (ua.getUsername().equals(username))
                return true;
        }
        return false;
    }
    
    public boolean loginUser(String username, String password){
        boolean isValid = false;
        for (User user : allUsers)
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                isValid = true;
                activeUser = user;
                return isValid;
            }
        return isValid;
    }
    
    public void logoutUser() {
        activeUser = null;
    }
    
    /// Create mock users 
        private void initializeSysAdmin() {
        String username = "sys";
        String password = "sys";
        String role = RoleType.SystemAdminRole;
        User sys = createNewUser(username, password, role);
        allUsers.add(sys);
    }
     private void initializeMunicipalityAdmin() {
        String username = "govt";
        String password = "govt";
        String role = RoleType.CitizenServiceRole;
        User gov = createNewUser(username, password, role);
        allUsers.add(gov);
    }
     private void initializeUtilityAdmin() {
        String username = "util";
        String password = "util";
        String role = RoleType.UtilityBillingRole;
        User util = createNewUser(username, password, role);
        allUsers.add(util);
    }
}
