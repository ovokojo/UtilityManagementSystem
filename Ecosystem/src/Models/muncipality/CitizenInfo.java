/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.muncipality;
import Models.User.User;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author vatsalkapadia
 */
public class CitizenInfo {
    private String name;
    private String ssn;
    private LocalDate birthDate;
    private String phone;
    private House house;

    public CitizenInfo(String name, String ssn, LocalDate birthDate, String phone) {
        this.name = name;
        this.ssn = ssn;
        this.birthDate = birthDate;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
     @Override
  public String toString() {
      return name;
  }
    
//    private static HashMap<citizenInfo, ArrayList<House>> encounters = new HashMap<citizenInfo,ArrayList<House>>();
//    private static ArrayList<House> infoArray = new ArrayList<House>();
//
//    public static HashMap<citizenInfo, ArrayList<House>> getEncounters() {
//        return encounters;
//    }
//    
//    public static void setEncounters(HashMap<citizenInfo, ArrayList<House>> encounters) {
//        citizenInfo.encounters = encounters;
//    }
//    
//
//    public static ArrayList<House> getVsArray() {
//        return infoArray;
//    }
//
//    public static void setVsArray(ArrayList<House> vsArray) {
//        citizenInfo.infoArray = vsArray;
//    }
//    
//    public static void addVitalsigns(House House)
//    {
//        infoArray.add(House);
//    }
    
}
   
