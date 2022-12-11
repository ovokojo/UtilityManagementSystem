/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import java.util.ArrayList;
import Models.User.RoleType;

/**
 *
 * @author liuyanzi
 */
public class CityEnterprise extends Enterprise {
    
      public CityEnterprise(String name){
        super(name,Enterprise.EnterpriseType.City);
    }
    
    @Override
    public ArrayList<RoleType> getSupportedRole() {
        return null;
    }
}
