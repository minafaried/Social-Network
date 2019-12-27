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
    public String logIn(String email , String password,AllUsers allusers) {

    	String id="";
    	//System.out.println(email+" "+ password);

        for (int i = 0; i < allusers.getNUser().size(); i++) {
            if ( allusers.getNUser().get(i).getEmail().equals(email) && allusers.getNUser().get(i).getPassword().equals(password)) {
                id =allusers.getNUser().get(i).getUserId() ;
                
                //System.out.println("Login Successfully...");
            }
        }

        if (id.equals("")) {
            for (int i = 0; i < allusers.getPUser().size(); i++) {
                if ( allusers.getPUser().get(i).getEmail().equals(email) &&  allusers.getPUser().get(i).getPassword().equals(password)) {
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
