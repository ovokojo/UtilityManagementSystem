/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.User;
import java.util.ArrayList;

/**
 *
 * @author thomaskojoaddaquay
 */
public  class RoleType { 
    static public String SystemAdmin = "System Admin";
    static public String BankAdmin = "Bank Admin";
    static public String BankManager = "Bank Manager";
    static public String BankCustomerService = "Bank Customer Service";
    static public String WalletAdmin = "Wallet Admin";
    static public String WalletManager = "Wallet Manager";
    static public String MunicipalityAdmin = "Municipality Admin";
    static public String MunicipalityCitizenManager = "Citizen Services Manager";
    static public String MunicipalityHousingManager = "Housing Services Manager";
    static public String UtilityAdmin = "Utilities Admin";
    static public String UtilityManager= "Utilities Manager";
    static public String Customer = "Customer";
    
    // Enterprises
    static public String BankEnterprise = "BBE Bank";
    static public String UtilityEnterprise = "Charles Utilities";
    static public String HousingEnterprise = "Boston Housing";
    static public String CitizenEnterprise = "Boston Citizen Services";
    
    
    public static String[] getAllEnterpriseTypes() {
        ArrayList<String> allEnts = new ArrayList();
        allEnts.add("BBE Bank");
        allEnts.add("Charles Utilities");
        allEnts.add("Boston Housing");
        allEnts.add("Boston Citizen Services");   
        String[] ents = allEnts.toArray(new String[allEnts.size()]);
        return ents;
    }
    
    public static String[] getBankRoleTypes() {
        ArrayList<String> allRoles = new ArrayList();
        allRoles.add(RoleType.BankAdmin);
        allRoles.add(RoleType.BankManager);
        allRoles.add(RoleType.BankCustomerService);
        String[] roles = allRoles.toArray(new String[allRoles.size()]);
        return roles;
    }
    
       public static String[] getUtilityRoleTypes() {
        ArrayList<String> allRoles = new ArrayList();
        allRoles.add(RoleType.UtilityAdmin);
        allRoles.add(RoleType.UtilityManager);
        String[] roles = allRoles.toArray(new String[allRoles.size()]);
        return roles;
    }
    
    public static String[] getHousingRoleTypes() {
        ArrayList<String> allRoles = new ArrayList();
        allRoles.add(RoleType.MunicipalityHousingManager);
        allRoles.add(RoleType.MunicipalityAdmin);
        String[] roles = allRoles.toArray(new String[allRoles.size()]);
        return roles;
    }
    
     public static String[] getCitizenRoleTypes() {
        ArrayList<String> allRoles = new ArrayList();
        allRoles.add(RoleType.MunicipalityCitizenManager);
        allRoles.add(RoleType.MunicipalityAdmin);
        String[] roles = allRoles.toArray(new String[allRoles.size()]);
        return roles;
    }
     
    public static String[] getAllRoleTypes() {
        ArrayList<String> allRoles = new ArrayList();
        allRoles.add(RoleType.BankAdmin);
        allRoles.add(RoleType.BankManager);
        allRoles.add(RoleType.BankCustomerService);
        allRoles.add(RoleType.MunicipalityAdmin);
        allRoles.add(RoleType.MunicipalityCitizenManager);
        allRoles.add(RoleType.MunicipalityHousingManager);
        allRoles.add(RoleType.UtilityAdmin);
        allRoles.add(RoleType.UtilityManager);
        allRoles.add(RoleType.Customer);

        String[] roles = allRoles.toArray(new String[allRoles.size()]);
        return roles;
    }
}