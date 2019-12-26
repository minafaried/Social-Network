
//naglaa
public class form {

	 public User Signupform()
	{
             User user1 = null;
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
             
             System.out.println("Enter The Date");
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
             Date date1 = null ;
             date1.setYear(Birthday.get(0));
             date1.setMonth(Birthday.get(1));
             date1.setDate(Birthday.get(2));
             user1.setBirthdate(date1);
             
		return user1;
	}
	public User loginform()
	{
             User user1 = null;
             System.out.println("Enter The name of User");
             Scanner sn1 = new Scanner(System.in);
             String name = sn1.nextLine();
             user1.setName(name);
             
             System.out.println("Enter The Password");
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
