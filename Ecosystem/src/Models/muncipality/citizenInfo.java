/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.muncipality;
import Business.User.User;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author vatsalkapadia
 */
public class citizenInfo extends User {
    private static HashMap<citizenInfo, ArrayList<House>> encounters = new HashMap<citizenInfo,ArrayList<House>>();
    private static ArrayList<House> infoArray = new ArrayList<House>();

    public static HashMap<citizenInfo, ArrayList<House>> getEncounters() {
        return encounters;
    }
    
    public static void setEncounters(HashMap<citizenInfo, ArrayList<House>> encounters) {
        citizenInfo.encounters = encounters;
    }
    

    public static ArrayList<House> getVsArray() {
        return infoArray;
    }

    public static void setVsArray(ArrayList<House> vsArray) {
        citizenInfo.infoArray = vsArray;
    }
    
    public static void addVitalsigns(House House)
    {
        infoArray.add(House);
    }
    
}
   
