/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author thomaskojoaddaquay
 */
public class User {
  String username;
  String password;
  String enterprise;
  String role;

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
    
    public String getEnterprise() {
        return enterprise;
    }

  public User(String username, String password, String enterprise, String role) {
    this.username = username;
    this.password = password;
    this.enterprise = enterprise;
    this.role = role;
  }
  
 @Override
  public String toString() {
      return username;
  }
}

class SystemAdmin extends User {
  public SystemAdmin(String username, String password) {
    super(username, password, Enterprise.None, Role.systemAdmin);
  }

  public Admin createAdmin(String username, String password,  String enterprise) {
    return new Admin(username, password, enterprise, Role.admin);
  }
}
