
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
	
    private ArrayList<User> allUsers =new ArrayList<User>();
    private ArrayList<PremiumUser> allPremiumUser = new ArrayList<PremiumUser>();
    
    public void addPUser(){
        
    }
    
    public void addNUser(){
        
    }
    
    public void setNUsers(User nUser){
            this.allUsers.add(nUser);
    }
    
    public void setPUsers(PremiumUser pUser){
            this.allPremiumUser.add(pUser);
    }
    
    public ArrayList<User> getNUser(){
        return allUsers;
    }
    
    public ArrayList<PremiumUser> getPUser(){
        return allPremiumUser;
    }
}
