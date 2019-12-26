import java.sql.Date;
import java.util.ArrayList;

public class Main {

	
	public static void main(String[] args) {
		AllUsers allusers=new AllUsers();
		databasehandler d=new databasehandler();
		allusers=d.getalluser();
		
		String name="naglaa";
		String password="123";
		@SuppressWarnings("deprecation")
		Date birth = new Date(2000, 11, 21);
		String g="f";
		String country="giza";
		String email="email";
//		Authentication auth=new Authentication();
//		 String userid=auth.logIn(name, password,allusers);
//		 System.out.println(userid);
//		 SignUp sign=new addPremiumUser();
//		
//		String id=sign.signUp(name,email,password,g,country,birth);
//		 System.out.println(id);
//		
//		
//		Search s=new FriendSearch();
//		ArrayList<String> Searchids=s.search(name, allusers);
//		System.out.println(Searchids);
//		
		UserController uc=new UserController();
		
		//uc.sendFriendRequest(allusers.getuserbyid("1"), allusers.getuserbyid("5"));
		//allusers=d.getalluser();
		
		//uc.acceptFriend(allusers.getuserbyid("5"), allusers.getuserbyid("1"));
		//allusers=d.getalluser();
		allusers.Display();
		
	}

}
