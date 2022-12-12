/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Muncipality;
import java.util.Random;
/**
 *
 * @author vatsalkapadia
 */
public class CitizenInfo {
    private String name;
    private String ssn;
    private String birthDate;
    private String phone;
    private House house;
    private int bankAccount;
    private int bankBalance;

    public CitizenInfo(String name, String ssn, String birthDate, String phone) {
        this.name = name;
        this.ssn = ssn;
        this.birthDate = birthDate;
        this.phone = phone;
        
      Random random = new Random();
      int rand = random.nextInt(100000)+999999;
      this.bankAccount = rand;
      this.bankBalance = 0;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
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
    
        public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
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
   
