/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Models.User.RoleType;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.System.EcoSystem;
import Models.User.User;
import javax.swing.JPanel;

/**
 *
 * @author liuyanzi
 */
public class SystemAdminRole extends RoleType {

  @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem system) {
        
         
//        return(); //new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
    // CRUD  All Users
}
