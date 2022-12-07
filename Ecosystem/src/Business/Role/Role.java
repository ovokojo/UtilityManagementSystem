/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.System.EcoSystem;
import javax.swing.JPanel;
import Business.User.User;

/**
 *
 * @author thomaskojoaddaquay
 */
public abstract class Role {
    
    public enum RoleType{
    
    AdminRole("AdminRole"),
    BankAccountManager("BankAccountManager"),
    CitizenServiceRole("CitizenServiceRole"),
    HouseServiceRole("HouseServiceRole"),
    UtilityElectricRole("UtilityElectricRole"),
    UtilityMaintenanceRole("UtilityMaintenanceRole"),
    UtilityBillingRole("UtilityBillingRole"),
    WalletAccountManager("WalletAccountManager"),
    WalletCustomerAdviosr("WalletCustomerAdviosr"),
    WalletServiceUpdateRole("WalletServiceUpdateRole");
    

     private String value;
     
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            User account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
