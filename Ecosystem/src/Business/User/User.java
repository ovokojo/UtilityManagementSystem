/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.User;

import Business.Role.Role;
import Business.Staff.Staff;
import Business.Enterprise.Enterprise;
import Business.Queue.WorkQueue;

/**
 *
 * @author thomaskojoaddaquay
 */
public class User {
  private String username;
    private String password;
    private Staff staff;
    private Role role;
    private WorkQueue workQueue;
    
    public User() {
        workQueue = new WorkQueue();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    

    public void setRole(Role role) {
        this.role = role;
    }

   

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
  
 @Override
  public String toString() {
      return username;
  }
}


