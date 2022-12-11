/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Utility;
import Models.User.StaffUser;

/**
 *
 * @author thomaskojoaddaquay
 */
public class MaintenanceRequest {
    public MaintenanceRequest(String meterNumber, String date, String type, String description, StaffUser assignedTo, String status) {
        this.meterNumber = meterNumber;
        this.date = date;
        this.type = type;
        this.description = description;
        this.assignedTo = assignedTo;
        this.status = status;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public void setMeterNumber(String meterNumber) {
        this.meterNumber = meterNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
     return meterNumber;
    }
    
    public String meterNumber;
    public String date;
    public String type;
    public String description;
    public StaffUser assignedTo;
    public String status;
}
