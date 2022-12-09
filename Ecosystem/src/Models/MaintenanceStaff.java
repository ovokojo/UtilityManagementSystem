/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author thomaskojoaddaquay
 */
public class MaintenanceStaff {
public MaintenanceStaff(String name, String title, String phone, Integer years) {
    this.name = name;
    this.title = title;
    this.phone = phone;
    this.years = years;
}
    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getYears() {
        return years;
    }
    public String name;
     public String title;
    public String phone;
     public Integer years;
}
