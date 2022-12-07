/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.Role;
import Business.Role.UtilityElectricRole;

/**
 *
 * @author liuyanzi
 */
public class UtilityElectricOrganization extends Organization{
    
     public UtilityElectricOrganization() {
        super(Organization.OrganizationType.Electric.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new UtilityElectricRole());
        return roles;
    }
    
}
