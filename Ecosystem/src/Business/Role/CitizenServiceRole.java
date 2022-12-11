/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Models.User.RoleType;
import Business.Enterprise.Enterprise;
import Business.Organization.CitizenServiceOrganization;
import Business.Organization.Organization;
import javax.swing.JPanel;
import Models.User.User;

/**
 *
 * @author liuyanzi
 */
public class CitizenServiceRole extends RoleType {
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CitizenServiceWorkAreaJPanel(userProcessContainer, account, (CitizenServiceOrganization)organization, enterprise, business);
    }
    // View list of citizens
    // Register new citizen
    // Update citizen
}
