/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.BankAccountOrganization;
import Business.Organization.Organization;
import javax.swing.JPanel;
import Business.User.User;

/**
 *
 * @author liuyanzi
 */
public class BankAccountManager extends Role {
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new BankAccountManagerAreaJPanel(userProcessContainer, account, (BankAccountOrganization)organization, enterprise, business);
    }
    /// BankAccountManagerAreaJPanel 
    // Can see list of account requests in a table
    // Can approve / reject request
    
}
