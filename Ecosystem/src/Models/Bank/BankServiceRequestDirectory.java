/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Bank;

import java.util.ArrayList;

/**
 *
 * @author liuyanzi
 */
public class BankServiceRequestDirectory {
    public ArrayList<BankServiceRequest> allRequests = new ArrayList();
    public BankServiceStaffDirectory staffDirectory = new BankServiceStaffDirectory();
    
     public ArrayList<BankServiceRequest> getRequests() {
    return allRequests;
    }
    
    private ArrayList<BankServiceStaff> _getStaff() {
     return staffDirectory.getStaff();
    }
}
