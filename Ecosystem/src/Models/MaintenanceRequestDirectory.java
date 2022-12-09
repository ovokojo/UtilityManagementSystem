/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author thomaskojoaddaquay
 */
public class MaintenanceRequestDirectory {
    public ArrayList<MaintenanceRequest> allRequests = new ArrayList();
    public MaintenanceStaffDirectory staffDirectory = new MaintenanceStaffDirectory();
    
    public MaintenanceRequestDirectory() {
        allRequests.add(new MaintenanceRequest("0004321746", "11/29/2022", "Electrical", "Faulty transformer cable", _getStaff().get(0), "Complete"));
        allRequests.add(new MaintenanceRequest("0004328391", "11/30/2022", "Plumbing", "Broken sewage pipe", _getStaff().get(1), "Complete"));
        allRequests.add(new MaintenanceRequest("0004324528", "11/30/2022", "Heating", "Smoke coming out of vents", _getStaff().get(5), "In Progress"));
        allRequests.add(new MaintenanceRequest("0004320294", "12/02/2022", "Electrical", "Faulty wall plugs", _getStaff().get(3), "In Progress"));
        allRequests.add(new MaintenanceRequest("0004326136", "12/04/2022", "Electrical", "Worn out wires", _getStaff().get(0), "Unassigned"));
        allRequests.add(new MaintenanceRequest("0004321992", "12/05/2022", "Heating", "Broken ventilator", _getStaff().get(4), "Unassigned"));
    }
    
    public ArrayList<MaintenanceRequest> getRequests() {
    return allRequests;
    }
    
    private ArrayList<MaintenanceStaff> _getStaff() {
     return staffDirectory.getStaff();
    }
}
