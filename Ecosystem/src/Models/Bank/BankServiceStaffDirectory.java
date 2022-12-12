/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Bank;

import Models.User.RoleType;
import Models.User.StaffUser;
import Models.User.UserDirectory;
import java.util.ArrayList;

/**
 *
 * @author liuyanzi
 */

    public class  BankServiceStaffDirectory extends UserDirectory {
    private ArrayList<StaffUser> allStaff = new ArrayList();
    public BankServiceStaffDirectory() {
        StaffUser staff1 = new StaffUser("Jane Doe", "Advisor", "329-485-5958", "jdoe", "jdoe", RoleType.BankCustomerService);
        StaffUser staff2 = new StaffUser("Brian Lee", "Advisor", "339-415-5458", "blee", "blee", RoleType.BankCustomerService);
        StaffUser staff3 = new StaffUser("Chris Rock", "Manager", "434-415-5763", "crock", "crock", RoleType.BankManager);
        allStaff.add(staff1);
        allStaff.add(staff2);
        allStaff.add(staff3);
    }
        public ArrayList<StaffUser> getAllStaff() {
        return allStaff;
    }
        
        public boolean isUsernameUnique(String username) {
            for (StaffUser user : allStaff) {
                if (user.getUsername().equals(username)) {
                    return false;
                }
            }
            return true;
        }
         public boolean isUsernameUpdateValid(StaffUser currentUser, String username) {
             boolean isValid = true;
             if (currentUser.getUsername().equals(username)) {
                    return isValid;
                }
             for (StaffUser user : allStaff) {
                if (user.getUsername().equals(username)) {
                    isValid = false;
                    return isValid;
                }
            }
            return isValid;
        }
}


