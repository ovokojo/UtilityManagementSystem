/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.BankAccountManager;
import java.util.ArrayList;
import Models.User.RoleType;

/**
 *
 * @author liuyanzi
 */
public class BankAccountOrganization extends Organization{
 
     public BankAccountOrganization() {
        super(Organization.OrganizationType.BankAccount.getValue());
    }
    
    @Override
    public ArrayList<RoleType> getSupportedRole() {
        ArrayList<RoleType> roles = new ArrayList();
        roles.add(new BankAccountManager());
        return roles;
    }
    
}
