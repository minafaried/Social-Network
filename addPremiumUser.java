/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class addPremiumUser implements SignUp{
    public String signUp(String userName, String email, String password, String gender, String country, Date birthdate){
	PremiumUser pUser = new PremiumUser();
        pUser.setName(userName);
        pUser.setEmail(email);
        pUser.setPassword(password);
        pUser.setGender(gender);
        pUser.setCountry(country);
        pUser.setBirthdate(birthdate);
        
        databasehandler db = new databasehandler();
        pUser = db.addpremiumuser(pUser);
        
        String newId = pUser.getUserId();
        
        return newId;
    }
}
