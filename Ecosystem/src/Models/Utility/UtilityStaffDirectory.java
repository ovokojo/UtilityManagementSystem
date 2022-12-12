/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Utility;

import Models.User.RoleType;
import Models.User.StaffUser;
import Models.User.UserDirectory;
import java.util.ArrayList;

/**
 *
 * @author thomaskojoaddaquay
 */
public class UtilityStaffDirectory extends UserDirectory {
    private ArrayList<StaffUser> allStaff = new ArrayList();
    public UtilityStaffDirectory() {
        StaffUser staff1 = new StaffUser("Jane Doe", "Engineer", "329-485-5958", "jdoe", "jdoe", RoleType.UtilityManager);
        StaffUser staff2 = new StaffUser("Brian Lee", "Engineer", "339-415-5458", "blee", "blee", RoleType.UtilityManager);
        StaffUser staff3 = new StaffUser("Chris Rock", "Manager", "434-415-5763", "crock", "crock", RoleType.UtilityManager);
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