/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.CitizenServiceOrganization;
import Business.Organization.Organization;
import javax.swing.JPanel;
import Business.User.User;

/**
 *
 * @author liuyanzi
 */
public class CitizenServiceRole extends Role {
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ShelterWorkAreaJPanel(userProcessContainer, account, (CitizenServiceOrganization)organization, enterprise, business);
    }
    
    
}
