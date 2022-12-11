/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.UtilityBillingOrganization;
import javax.swing.JPanel;
import Business.User.User;

/**
 *
 * @author liuyanzi
 */
public class BankAdvisor extends RoleType {
    
       @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new BankAdvisorWorkAreaJPanel(userProcessContainer, account, (UtilityBillingOrganization)organization, enterprise, business);
    }
     /// BankAdvisorWorkAreaJPanel 
    // Takes appointments with customers
}
