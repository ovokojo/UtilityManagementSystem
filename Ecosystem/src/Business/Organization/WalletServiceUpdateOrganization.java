/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Models.User.RoleType;
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
    public ArrayList<RoleType> getSupportedRole() {
        ArrayList<RoleType> roles = new ArrayList();
        roles.add(new WalletServiceUpdateRole());
        return roles;
    }
    
}