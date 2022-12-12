/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.User;
import Database.Database;
//import Models.muncipality.CitizenInfo;
//import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author thomaskojoaddaquay
 */
public class UserDirectory {
   private User activeUser;
   public ArrayList<User> allUsers  = Database.getUsers();
   
    public UserDirectory() {
        /// sys admin
//    initializeSysAdmin();
//    initializeMunicipalityAdmin();
//     initializeUtilityAdmin();
//     initializeMunicipalityCitizenMgr();
//     initializeMunicipalityHousingMgr();
//     initializeBankAdmin();
//     initializeBankMgr();
//     initializeCustomerMgr();
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
    
       public boolean isUsernameUpdateValid(User currentUser, String username) {
             boolean isValid = true;
             if (currentUser.getUsername().equals(username)) {
                    return isValid;
                }
             for (User user : allUsers) {
                if (user.getUsername().equals(username)) {
                    isValid = false;
                    return isValid;
                }
            }
            return isValid;
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
//        private void initializeSysAdmin() {
//        String username = "sys";
//        String password = "sys";
//        String role = RoleType.SystemAdmin;
//        User sys = createNewUser(username, password, role);
//        allUsers.add(sys);
//    }
//     private void initializeMunicipalityAdmin() {
//        String username = "govta";
//        String password = "govta";
//        String role = RoleType.MunicipalityAdmin;
//        User gov = createNewUser(username, password, role);
//        allUsers.add(gov);
//    }
//       private void initializeMunicipalityCitizenMgr() {
//        String username = "citi";
//        String password = "citi";
//        String role = RoleType.MunicipalityCitizenManager;
//        User gov = createNewUser(username, password, role);
//        allUsers.add(gov);
//    }
//      private void initializeMunicipalityHousingMgr() {
//        String username = "hous";
//        String password = "hous";
//        String role = RoleType.MunicipalityHousingManager;
//        User gov = createNewUser(username, password, role);
//        allUsers.add(gov);
//    }
//     private void initializeUtilityAdmin() {
//        String username = "util";
//        String password = "util";
//        String role = RoleType.UtilityAdmin;
//        User util = createNewUser(username, password, role);
//        allUsers.add(util);
//    }
//     private void initializeBankAdmin() {
//        String username = "banka";
//        String password = "banka";
//        String role = RoleType.BankAdmin;
//        User bankAdmin = createNewUser(username, password, role);
//        allUsers.add(bankAdmin);
//    }
//      private void initializeBankMgr() {
//        String username = "bank";
//        String password = "bank";
//        String role = RoleType.BankManager;
//        User bankmgr = createNewUser(username, password, role);
//        allUsers.add(bankmgr);
//    }
//    private void initializeCustomerMgr() {
//        String username = "cus";
//        String password = "cus";
//        String name = "Janet Jackson";
//        String ssn = "8474647463";
//        String phone = "453-454-5958";
//        LocalDate dob =  LocalDate.of(1990, 10, 9);
//        CitizenInfo data = new CitizenInfo(name, ssn, dob,  phone);
//        User customer = createNewUser(username, password, RoleType.Customer);
//        customer.setCitizenInfo(data);
//        allUsers.add(customer);
//    }
}
