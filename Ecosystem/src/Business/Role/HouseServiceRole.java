/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Models.User.RoleType;
import Business.Enterprise.Enterprise;
import Business.Organization.HouseServiceOrganization;
import Business.Organization.Organization;
import javax.swing.JPanel;
import Models.User.User;

/**
 *
 * @author liuyanzi
 */
public class HouseServiceRole extends RoleType {
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new HousingServiceWorkAreaJPanel(userProcessContainer, account, (HouseServiceOrganization)organization, enterprise, business);
    }
    // View list of homes
    // View homes on map
    // Register new home
    // Update home
}
