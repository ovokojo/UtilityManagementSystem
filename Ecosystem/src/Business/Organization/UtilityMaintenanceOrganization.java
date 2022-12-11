/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.RoleType;
import Business.Role.UtilityMaintenanceRole;

/**
 *
 * @author liuyanzi
 */
public class UtilityMaintenanceOrganization  extends Organization{
    
     public UtilityMaintenanceOrganization() {
        super(Organization.OrganizationType.UtilityMaintenance.getValue());
    }
    
    @Override
    public ArrayList<RoleType> getSupportedRole() {
        ArrayList<RoleType> roles = new ArrayList();
        roles.add(new UtilityMaintenanceRole());
        return roles;
    }
    
}
