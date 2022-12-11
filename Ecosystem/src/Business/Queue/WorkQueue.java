/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Queue;

import Models.Bank.BankServiceRequest;
import java.util.ArrayList;

/**
 *
 * @author liuyanzi
 */
public class WorkQueue {
     private ArrayList<BankServiceRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<BankServiceRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    
}
