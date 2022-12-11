/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.User;

/**
 *
 * @author thomaskojoaddaquay
 */
public class StaffUser extends User {
    private String name;
    private String title;
    private String phone;
    
    public StaffUser(String name, String title, String phone,  String username, String password, String role) {
        super(username, password, role);
        this.name = name;
        this.title = title;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
