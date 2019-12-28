import java.sql.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class addPremiumUser implements SignUp {
	public String signUp(String userName, String email, String password, String gender, String country,
			Date birthdate) {
		PremiumUser pUser = new PremiumUser();
		int num;
		String credit = "";
		String paypal = "";
		System.out.println("what is the method that you want to pay by it 1 - credit 2 - paypal");
		Scanner sn = new Scanner(System.in);
		num = sn.nextInt();
		sn.nextLine();
		if (num == 1) {
			Scanner input = new Scanner(System.in);
			credit = input.nextLine();
			pUser.setcredit_Card(credit);
			pUser.setPaypal(null);
		} else {
			Scanner input = new Scanner(System.in);
			paypal = input.nextLine();
			pUser.setcredit_Card(null);
			pUser.setPaypal(paypal);
		} 
		pUser.setName(userName);
		pUser.setEmail(email);
		pUser.setPassword(password);
		pUser.setGender(gender);
		pUser.setCountry(country);
		pUser.setBirthdate(birthdate);

		databasehandler db = new databasehandler();
		pUser = db.addpremiumuser(pUser);
	       if(pUser==null)
	        {
	        	return "";
	        }
		String newId = pUser.getUserId();

		return newId;
	}
}
