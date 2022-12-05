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
  Integer role;

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
    
    public Integer getRole() {
        return role;
    }

  public User(String username, String password, String enterprise, Integer role) {
    this.username = username;
    this.password = password;
    this.enterprise = enterprise;
    this.role = role;
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

class Admin extends User {
  public Admin(String username, String password, String enterprise, Integer role) {
    super(username, password, enterprise, Role.admin);
  }
  /// Can only create staff within the same enterprise
  public Staff createStaff(String username, String password) {
    return new Staff(username, password, this.enterprise, Role.staff);
  }
}

class Staff extends User {
  public Staff(String username, String password, String enterprise, Integer role) {
    super(username, password, enterprise, Role.staff);
  }
}

