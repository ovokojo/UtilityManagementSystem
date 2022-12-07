/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author liuyanzi
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Organization.OrganizationType type) {
        Organization organization = null;
        if (type.getValue().equals(Organization.OrganizationType.BankAccount.getValue())) {
            organization = new BankAccountOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.Electric.getValue())) {
            organization = new UtilityElectricOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.Billing.getValue())) {
            organization = new UtilityBillingOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.UtilityMaintenance.getValue())) {
            organization = new UtilityMaintenanceOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.CitizenService.getValue())) {
            organization = new CitizenServiceOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.HouseService.getValue())) {
            organization = new HouseServiceOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Organization.OrganizationType.WalletAccount.getValue())) {
            organization = new WalletAccountOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.OrganizationType.WalletCustomerService.getValue())) {
            organization = new WalletCustomerServiceOrganization();
            organizationList.add(organization);
         }
        else if (type.getValue().equals(Organization.OrganizationType. WalletServiceUpdate.getValue())) {
            organization = new WalletServiceUpdateOrganization();
            organizationList.add(organization);
         }
        else if (type.getValue().equals(Organization.OrganizationType.Admin.getValue())){
            organization = new AdminOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
    
    public void removeOrganization(Organization organization) {
        organizationList.remove(organization);
    }
}