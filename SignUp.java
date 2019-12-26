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
public interface SignUp {
    public String signUp(String userName, String email, String password, String gender, String country, Date birthdate);
}
