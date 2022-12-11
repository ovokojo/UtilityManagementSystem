/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.UtilityMaintenanceOrganization;
import javax.swing.JPanel;
import Business.User.User;

/**
 *
 * @author liuyanzi
 */
public class UtilityMaintenanceRole extends RoleType {
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new UtilityMaintenanceWorkAreaJPanel(userProcessContainer, account, (UtilityMaintenanceOrganization)organization, enterprise, business);
    }
    /// Assign maintenance requests
    /// Mark requests as complete
    
}
