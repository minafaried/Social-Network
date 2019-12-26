
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
public class FriendSearch implements Search{
   
    @Override
    public ArrayList<String> search(String name ,AllUsers alluser) {

        ArrayList<String> matchIds = new ArrayList<String>();
        
        for (int i=0 ; i<alluser.getNUser().size() ; i++){
            if (alluser.getNUser().get(i).getName().equals(name)){
                matchIds.add(alluser.getNUser().get(i).getUserId());
            }
        }
        
        for (int i=0 ; i<alluser.getPUser().size() ; i++){
            if (alluser.getPUser().get(i).getName().equals(name)){
                matchIds.add(alluser.getPUser().get(i).getUserId());
            }
        }
        
        return matchIds;
    }
    
}
