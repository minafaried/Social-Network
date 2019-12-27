
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
    public void Display() {
    	for (int i = 0; i < allUsers.size(); i++) {
			allUsers.get(i).display();
		}
    	for (int i = 0; i < allPremiumUser.size(); i++) {
			allPremiumUser.get(i).display();
		}
    }
    public void Displaybyid(String id) {
		PremiumUser p= getpremiumuserbyid(id);
		User u=getuserbyid(id);
		if(p!=null)
		{
			p.display();
		}
		if(u!=null)
		{
			u.display();
		}
    }
    public User getuserbyid(String userid)
    {
    	   
        for (int i=0 ; i<allUsers.size() ; i++){
            if (allUsers.get(i).getUserId().equals(userid)){
            	return allUsers.get(i);
            }
        }
        
		return null;
    }
    public PremiumUser getpremiumuserbyid(String userid)
    {
    	   
        for (int i=0 ; i<allPremiumUser.size() ; i++){
            if (allPremiumUser.get(i).getUserId().equals(userid)){
            	return allPremiumUser.get(i);
            }
        }
        
		return null;
    }
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
