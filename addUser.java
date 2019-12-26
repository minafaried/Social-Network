import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class addUser implements SignUp{
    public String signUp(String userName, String email, String password, String gender, String country, Date birthdate){
        User user = new User();
        user.setName(userName);
        user.setEmail(email);
        user.setPassword(password);
        user.setGender(gender);
        user.setCountry(country);
        user.setBirthdate(birthdate);
       
        databasehandler db = new databasehandler();
        user = db.adduser(user);    
	    String newId = user.getUserId();
        return newId;
    }
}
