/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.System;

import Business.Organization.Organization;
import Business.Role.RoleType;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author liuyanzi
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
    public void removeNetwork(Network network) {
        networkList.remove(network);
    }
    
    public void updateNetwork(Network network,String name){
        for(Network n:networkList){
            if(n.equals(network)){
                n.setName(name);
            }
        }
    }

    @Override
    public ArrayList<RoleType> getSupportedRole() {
        ArrayList<RoleType> roleList = new ArrayList<RoleType>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

   public boolean IsUserUnique(String userName){
        if(!this.getUserDirectory().IsUsernameUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
   
}
