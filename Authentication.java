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
    public boolean logIn(String userName , String password) {
        databasehandler db = new databasehandler();
        AllUsers all = db.getalluser();

        ArrayList<User> nUsers = all.getNUser();
        ArrayList<PremiumUser> pUsers = all.getPUser();

        boolean normal = false;
        boolean premium = false;
        for (int i = 0; i < nUsers.size(); i++) {
            if (nUsers.get(i).getName().equals(userName) && nUsers.get(i).getPassword().equals(password)) {
                normal = true;
                //System.out.println("Login Successfully...");
            }
        }

        if (normal == false) {
            for (int i = 0; i < pUsers.size(); i++) {
                if (pUsers.get(i).getName().equals(userName) && pUsers.get(i).getPassword().equals(password)) {
                    premium = true;
                    //System.out.println("Login Successfully...");
                }
            }
        }

        if (normal = false && premium == false) {
            //System.out.println("Login Failed...");
            return false;
        }
        
        return true;
    }
    
    public boolean logOut(){
		return false;
        //return true;
    }
}
