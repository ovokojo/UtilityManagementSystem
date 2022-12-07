/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;


/**
 *
 * @author thomaskojoaddaquay
 */

    public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;


    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        Bank("Bank"),
        Utility("Utility"),
        City("City/Municipality"),
        WalletService("Digital Wallet");

        private String value;

        private EnterpriseType(String value) {
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
    
     public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
  
        
        public enum EnumType1{
        Bank("Bank"),BankAccount("Bank Account Organization");
        private String value;
        private EnumType1(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType2{
       Utility("Utility"),Electric("Utility Electirc Organization"),
       Billing("Utiliy Billing Organization"),UtilityMaintenance("Utility Maintenance Organization");
        private String value;
        private EnumType2(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType3{
       City("City/Municipality"), HouseService("Housing Service Organization"),
       CitizenService("Citizen Service Organization");
        private String value;
        private EnumType3(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public enum EnumType4{
       WalletService("Digital Wallet"),WalletAccount("Wallet Account Organization"),
       WalletServiceUpdate("Wallet Service Update Organization"),
       WalletCustomerService("Wallet Customer Service Organization");
        private String value;
        private EnumType4(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
      @Override
        public String toString() {
            return this.getName();
        }
}

