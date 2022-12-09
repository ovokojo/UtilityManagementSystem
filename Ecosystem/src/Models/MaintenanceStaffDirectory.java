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
public class MaintenanceStaffDirectory {
    public ArrayList<MaintenanceStaff> allStaff = new ArrayList();
    public MaintenanceStaffDirectory() {
        allStaff.add(new MaintenanceStaff("Bishop Smith", "Electrician", "(357) 345-6574", 1));
        allStaff.add(new MaintenanceStaff("Janet Peague", "Plumber", "(465) 293-7458", 3));
        allStaff.add(new MaintenanceStaff("Jerome Mali", "Plumber", "(958) 293-1235", 5));
        allStaff.add(new MaintenanceStaff("Hannah Wile", "Electrician", "(465) 121-2232", 5));
        allStaff.add(new MaintenanceStaff("Hannah Wile", "Engineer", "(425) 324-1298", 10));
        allStaff.add(new MaintenanceStaff("Greg Chase", "Engineer", "(123) 344-1495", 12));
    }
}
