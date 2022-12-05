/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author thomaskojoaddaquay
 */
public class Staff extends User {
  public Staff(String username, String password, String enterprise, String role) {
    super(username, password, enterprise, Role.staff);
  }
}
