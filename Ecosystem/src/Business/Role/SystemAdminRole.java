/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.System.EcoSystem;
import Business.User.User;
import javax.swing.JPanel;

/**
 *
 * @author liuyanzi
 */
public class SystemAdminRole extends Role {

  @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    
    
}
