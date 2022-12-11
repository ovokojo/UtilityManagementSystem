/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Models.User.RoleType;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WalletAccountOrganization;
import javax.swing.JPanel;
import Models.User.User;

/**
 *
 * @author liuyanzi
 */
public class WalletAccountManager extends RoleType {
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new WalletAccountManagerAreaJPanel(userProcessContainer, account, (WalletAccountOrganization)organization, enterprise, business);
    }
    /// WalletAccountManagerAreaJPanel 
    // Can see list of account requests in a table
    // Can approve / reject request
}
