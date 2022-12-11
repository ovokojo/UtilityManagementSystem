/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.RoleType;
import Business.Role.UtilityBillingRole;

/**
 *
 * @author liuyanzi
 */
public class UtilityBillingOrganization extends Organization{
    
     public UtilityBillingOrganization() {
        super(Organization.OrganizationType.Billing.getValue());
    }
    
    @Override
    public ArrayList<RoleType> getSupportedRole() {
        ArrayList<RoleType> roles = new ArrayList();
        roles.add(new UtilityBillingRole());
        return roles;
    }
    
}
