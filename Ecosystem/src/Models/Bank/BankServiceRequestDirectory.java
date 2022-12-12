/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Bank;

import Models.User.StaffUser;
import java.util.ArrayList;

/**
 *
 * @author liuyanzi
 */
public class BankServiceRequestDirectory {

    public BankServiceRequestDirectory() {
        allRequests.add(new BankServiceRequest("0004321746", "11/29/2022", "Fraudulent transaction", _getStaff().get(0), "Complete"));
    }
    public ArrayList<BankServiceRequest> allRequests = new ArrayList();
    public BankServiceStaffDirectory staffDirectory = new BankServiceStaffDirectory();
    
     public ArrayList<BankServiceRequest> getRequests() {
        return allRequests;
    }
    
    private ArrayList<StaffUser> _getStaff() {
        return staffDirectory.getAllStaff();
    }
}
