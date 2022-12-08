/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.WalletServiceUpdateOrganization;
import Business.User.User;
import javax.swing.JPanel;

/**
 *
 * @author thomaskojoaddaquay
 */
public class CustomerRole {
           @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CustomerRoleWorkAreaJPanel(userProcessContainer, account, (WalletServiceUpdateOrganization)organization, enterprise, business);
    }
}
/// CustomerRoleWorkAreaJPanel
// Bank
// Request bank account
// View bank account details
// schedule appointment with Bank
// Wallet
// Request wallet account
// View wallet service updates
// view wallet details
// Utility
// view utility bills
// pay utility bills