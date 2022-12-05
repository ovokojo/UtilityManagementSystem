/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author thomaskojoaddaquay
 */
public class Admin extends User {
  public Admin(String username, String password, String enterprise, String role) {
    super(username, password, enterprise, Role.admin);
  }
  /// Can only create staff within the same enterprise
  public Staff createStaff(String username, String password) {
    return new Staff(username, password, this.enterprise, Role.staff);
  }
}