/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Bank;

//import Business.Role.BankAdvisor;
import Models.User.StaffUser;
import java.util.Date;
import Models.User.User;

/**
 *
 * @author liuyanzi
 */
public class BankServiceRequest {
    
    public String accountNumber;
    public String date;
    public String description;
    public StaffUser assignedTo;
    public String status;
     public BankServiceRequest(String accountNumber, String date,String description, StaffUser assignedTo, String status) {
        this.accountNumber = accountNumber;
        this.date = date;
        this.description = description;
        this.assignedTo = assignedTo;
        this.status = status;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StaffUser getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(StaffUser assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
     return accountNumber;
    }

}
