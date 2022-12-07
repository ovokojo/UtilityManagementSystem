/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.WalletServiceUpdateRole;
import java.util.ArrayList;

/**
 *
 * @author liuyanzi
 */
public class WalletServiceUpdateOrganization extends Organization{
    
     public WalletServiceUpdateOrganization() {
        super(Organization.OrganizationType.WalletServiceUpdate.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new WalletServiceUpdateRole());
        return roles;
    }
    
}