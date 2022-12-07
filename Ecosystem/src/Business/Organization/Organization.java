/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Queue.WorkQueue;
import Business.Staff.StaffDirectory;
import java.util.ArrayList;
import Business.Role.Role;
import Business.User.UserDirectory;

/**
 *
 * @author liuyanzi
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private StaffDirectory staffDirectory;
    private UserDirectory userDirectory;
    private int organizationID;
    private static int counter = 0;
    

    public enum OrganizationType {
        Admin("Admin Organization"),
        BankAccount("Bank Account Organization"),
        Electric("Utility Electirc Organization"),
        Billing("Utility Billing Organization"),
        UtilityMaintenance("Utility Maintenance Organization"),
        CitizenService("Citizen Service Organization"),
        HouseService("Housing Service Organization"),
        WalletAccount("Wallet Account Organization"),
        WalletServiceUpdate("Wallet Service Update Organization"),
        WalletCustomerService("Wallet Customer Service Organization");
        
        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        staffDirectory = new StaffDirectory();
        userDirectory = new UserDirectory();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public StaffDirectory getStaffDirectory() {
        return staffDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}
