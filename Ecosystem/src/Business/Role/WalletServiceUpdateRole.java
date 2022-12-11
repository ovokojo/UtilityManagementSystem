/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Models.User.RoleType;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WalletServiceUpdateOrganization;
import javax.swing.JPanel;
import Models.User.User;

/**
 *
 * @author liuyanzi
 */
public class WalletServiceUpdateRole extends RoleType {
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new WalletServiceUpdateWorkAreaJPanel(userProcessContainer, account, (WalletServiceUpdateOrganization)organization, enterprise, business);
    }
    /// WalletServiceUpdateWorkAreaJPanel 
    // Creates system status updates
    // Maybe sends email to customers
    
}
