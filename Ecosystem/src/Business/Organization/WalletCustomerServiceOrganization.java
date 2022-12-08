/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.Role;
import Business.Role.BankAdvisor;

/**
 *
 * @author liuyanzi
 */
public class WalletCustomerServiceOrganization extends Organization{
 
     public WalletCustomerServiceOrganization() {
        super(Organization.OrganizationType.WalletCustomerService.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BankAdvisor());
        return roles;
    }
    
}
