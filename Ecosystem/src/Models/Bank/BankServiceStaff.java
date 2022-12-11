/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Bank;

/**
 *
 * @author liuyanzi
 */
public class BankServiceStaff {
    
     public String name;
     public String title;
     public Integer years;

    public BankServiceStaff(String name, String title, Integer years) {
    this.name = name;
    this.title = title;

    this.years = years;
}
    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

  

    public Integer getYears() {
        return years;
    }
   
    
}
