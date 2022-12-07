/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Staff;

import java.util.ArrayList;

/**
 *
 * @author liuyanzi
 */
public class StaffDirectory {


    private ArrayList<Staff> staffList;

    public StaffDirectory() {
        staffList = new ArrayList();
    }

    public ArrayList<Staff> getStaffList() {
        return staffList;
    }

    public Staff createStaff(String name) {
        Staff staff = new Staff();
        staff.setName(name);
        staffList.add(staff);
        return staff;
    }
    
    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }

    public Staff isStaffExist(String name) {
        for (Staff x : staffList) {
            if (x.getName().equals(name)) {
                return x;
            }
        }
        return null;
    }
}


