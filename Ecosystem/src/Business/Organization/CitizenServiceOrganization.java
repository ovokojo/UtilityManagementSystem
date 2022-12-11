/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.CitizenServiceRole;
import java.util.ArrayList;
import Models.User.RoleType;

/**
 *
 * @author liuyanzi
 */
public class CitizenServiceOrganization  extends Organization{
    
     public CitizenServiceOrganization() {
        super(Organization.OrganizationType.CitizenService.getValue());
    }
    
    @Override
    public ArrayList<RoleType> getSupportedRole() {
        ArrayList<RoleType> roles = new ArrayList();
        roles.add(new CitizenServiceRole());
        return roles;
    }
    
}
