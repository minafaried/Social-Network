import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

//naglaa
public class form {
	 @SuppressWarnings("deprecation")
	public User Signupform()
	{
             User user1 = new User();
             System.out.println("Enter The name of User");
             Scanner sn1 = new Scanner(System.in);
             String name = sn1.nextLine();
             user1.setName(name);
             
             System.out.println("Enter Email of User");
             sn1 = new Scanner(System.in);
             String email = sn1.nextLine();
             user1.setEmail(email);
             
             System.out.println("Enter The Password");
              sn1 = new Scanner(System.in);
             String password = sn1.nextLine();
             user1.setPassword(password);
             
             System.out.println("Enter The Gender");
              sn1 = new Scanner(System.in);
             String gender = sn1.nextLine();
             user1.setGender(gender);
             
             System.out.println("Enter The Country");
              sn1 = new Scanner(System.in);
             String country = sn1.nextLine();
             user1.setCountry(country);
              
             System.out.println("Enter The birth date");
             sn1 = new Scanner(System.in);
             String date = sn1.nextLine();
             String []splitted = date.split("-");
             ArrayList<Integer>Birthday = new ArrayList<Integer>();
             int i = 0;
             for(String a : splitted)
             {
                 Birthday.add(i, Integer.parseInt(a));
                 i++;
             }
             Date birth = new Date(Birthday.get(0),Birthday.get(1), Birthday.get(2));
             user1.setBirthdate(birth);
             
		return user1;
	}
	public User loginform()
	{
             User user1 = new User();
             System.out.println("Enter your Email ");
             Scanner sn1 = new Scanner(System.in);
             String name = sn1.nextLine();
             user1.setName(name);
             
             System.out.println("Enter your Password");
             sn1 = new Scanner(System.in);
             String password = sn1.nextLine();
             user1.setPassword(password);
             
		return user1;
		
	}
	public String name()
	{
             System.out.println("Enter The name of User that you want to search about");
             Scanner sn1 = new Scanner(System.in);
             String name = sn1.nextLine();
		
            return name;
		
	}
}
