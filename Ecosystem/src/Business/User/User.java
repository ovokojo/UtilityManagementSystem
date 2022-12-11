/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.User;

import Business.Role.RoleType;
import Business.Enterprise.Enterprise;
import Business.Queue.WorkQueue;
import Models.muncipality.CitizenInfo;

/**
 *
 * @author thomaskojoaddaquay
 */
public class User {
  private String username;
    private String password;
    private String role;
    private CitizenInfo citizenInfo;

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public CitizenInfo getCitizenInfo() {
        return citizenInfo;
    }

    public void setCitizenInfo(CitizenInfo citizenInfo) {
        this.citizenInfo = citizenInfo;
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

    public String getRole() {
        return role;
    }    

    public void setRole(String role) {
        this.role = role;
    }  
  
 @Override
  public String toString() {
      return username;
  }
}


