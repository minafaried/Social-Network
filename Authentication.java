import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Authentication {
    public String logIn(String userName , String password,AllUsers allusers) {

    	String id="";

        for (int i = 0; i < allusers.getNUser().size(); i++) {
            if ( allusers.getNUser().get(i).getName().equals(userName) && allusers.getNUser().get(i).getPassword().equals(password)) {
                id =allusers.getNUser().get(i).getUserId() ;
                
                //System.out.println("Login Successfully...");
            }
        }

        if (id.equals("")) {
            for (int i = 0; i < allusers.getPUser().size(); i++) {
                if ( allusers.getPUser().get(i).getName().equals(userName) &&  allusers.getPUser().get(i).getPassword().equals(password)) {
                	 id=allusers.getPUser().get(i).getUserId() ;
                    //System.out.println("Login Successfully...");
                }
            }
        }
        
        return id;
    }
    
    public boolean logOut(){
		return false;
        //return true;
    }
}
