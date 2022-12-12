/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.muncipality;

import Models.User.RoleType;
import Models.User.StaffUser;
import Models.User.UserDirectory;
import java.util.ArrayList;

/**
 *
 * @author vatsalkapadia
 */
public class muncipalityStaffDirectory extends UserDirectory {
    private ArrayList<StaffUser> allStaff = new ArrayList();
    
    
    public muncipalityStaffDirectory(){
        StaffUser staff1 = new StaffUser("Jane Doe", "Admin", "329-485-5958", "jdoe", "jdoe", RoleType.MunicipalityAdmin);
        StaffUser staff2 = new StaffUser("Brian Lee", "Citizen Manager", "339-415-5458", "blee", "blee", RoleType.MunicipalityCitizenManager);
        StaffUser staff3 = new StaffUser("Chris Rock", "Housing Manager", "434-415-5763", "crock", "crock", RoleType.MunicipalityHousingManager);
        StaffUser staff4 = new StaffUser("BrianJane ", "Citizen Manager", "329-485-5958", "bjane", "bjane", RoleType.MunicipalityCitizenManager);
        StaffUser staff5 = new StaffUser("DoeyLEE", "Citizen Manager", "339-415-5458", "dlee", "dlee", RoleType.MunicipalityCitizenManager);
        StaffUser staff6 = new StaffUser("ChrisJane", "Housing Manager", "434-415-5763", "cjane", "cjane", RoleType.MunicipalityHousingManager);
        allStaff.add(staff1);
        allStaff.add(staff2);
        allStaff.add(staff3);
        allStaff.add(staff4);
        allStaff.add(staff5);
        allStaff.add(staff6);
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
    
  
