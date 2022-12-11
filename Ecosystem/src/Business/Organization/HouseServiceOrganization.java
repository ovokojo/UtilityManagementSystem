/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HouseServiceRole;
import java.util.ArrayList;
import Models.User.RoleType;

/**
 *
 * @author liuyanzi
 */
public class HouseServiceOrganization extends Organization{
    
     public HouseServiceOrganization() {
        super(Organization.OrganizationType.HouseService.getValue());
    }
    
    @Override
    public ArrayList<RoleType> getSupportedRole() {
        ArrayList<RoleType> roles = new ArrayList();
        roles.add(new HouseServiceRole());
        return roles;
    }
    
    
}
