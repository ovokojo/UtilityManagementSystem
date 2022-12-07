/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.Role;
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
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new UtilityBillingRole());
        return roles;
    }
    
}
