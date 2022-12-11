/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import Models.User.RoleType;
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
    public ArrayList<RoleType> getSupportedRole() {
        ArrayList<RoleType> roles = new ArrayList();
        roles.add(new BankAdvisor());
        return roles;
    }
    
}
