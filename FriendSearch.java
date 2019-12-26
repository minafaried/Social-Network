
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nagla Essam
 */
public class FriendSearch iimplements Search{
   
    @Override
    public ArrayList<String> search(String name) {
        databasehandler db = new databasehandler();
        AllUsers all = db.getalluser();
        
        ArrayList<User> nUsers = all.getNUser();
        ArrayList<PremiumUser> pUsers = all.getPUser();
        
        ArrayList<String> matchIds = new ArrayList<String>();
        
        for (int i=0 ; i<nUsers.size() ; i++){
            if (nUsers.get(i).getName().equals(name)){
                matchIds.add(nUsers.get(i).getUserId());
            }
        }
        
        for (int i=0 ; i<pUsers.size() ; i++){
            if (pUsers.get(i).getName().equals(name)){
                matchIds.add(pUsers.get(i).getUserId());
            }
        }
        
        return matchIds;
    }
    
}
