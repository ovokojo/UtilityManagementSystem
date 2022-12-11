/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.muncipality;
import java.util.UUID;

// Generate a random UUID

/**
 *
 * @author thomaskojoaddaquay
 */
public class House {

    public House(String addressOne, String addressTwo, String cityArea, String houseId) {
        UUID uuid = UUID.randomUUID();
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
        this.cityArea = cityArea;
        this.houseId = uuid.toString();
    }
    public String addressOne;
    public String addressTwo;
    public String cityArea;
    public String houseId;

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public String getCityArea() {
        return cityArea;
    }

    public void setCityArea(String cityArea) {
        this.cityArea = cityArea;
    }
    
    
}
