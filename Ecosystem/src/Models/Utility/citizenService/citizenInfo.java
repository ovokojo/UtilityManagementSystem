/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Utility.citizenService;

/**
 *
 * @author vatsalkapadia
 */
public class citizenInfo {
    private String secreteKey;
    private String username;
    private String housingArea;
    private String addlone;
    private String addltwo;
    
public citizenInfo(String name, String key , String area, String aone, String atwo) {
    this.username = name;
    this.secreteKey = key;
    this.housingArea = area;
    this.addlone = aone ;
    this.addltwo = atwo ;
}

    public String getSecreteKey() {
        return secreteKey;
    }

    public void setSecreteKey(String secreteKey) {
        this.secreteKey = secreteKey;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHousingArea() {
        return housingArea;
    }

    public void setHousingArea(String housingArea) {
        this.housingArea = housingArea;
    }

    public String getAddlone() {
        return addlone;
    }

    public void setAddlone(String addlone) {
        this.addlone = addlone;
    }

    public String getAddltwo() {
        return addltwo;
    }

    public void setAddltwo(String addltwo) {
        this.addltwo = addltwo;
    }
    
}
   
