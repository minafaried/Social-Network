
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class AllUsers {
    private ArrayList<User> allUSers new ArrayList<User>;
    private ArrayList<PremiumUser> allPremiumUser = new ArrayList<PremiumUser>;
    
    public void addPUser(){
        
    }
    
    public void addNUser(){
        
    }
    
    public void setNUsers(ArrayList<User> nUser){
        for (int i=0 ; i<nUser.size() ; i++){
            allUSers.add(nUser.get(i));
        }
    }
    
    public void setPUsers(ArrayList<PremiumUser> pUser){
        for (int i=0 ; i<pUser.size() ; i++){
            allPremiumUser.add(pUser.get(i));
        }
    }
    
    public ArrayList<User> getNUser(){
        return allUSers;
    }
    
    public ArrayList<PremiumUser> getPUser(){
        return allPremiumUser;
    }
}
