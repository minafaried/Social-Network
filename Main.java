import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static void manu() {
		System.out.println("\n1-Search for user by his name");
		System.out.println("2-send friend request to user");
		System.out.println("3-accept friend request");
		System.out.println("4-update the state");
		System.out.println("5-see my notifications");
		System.out.println("0-logout\n");

	}

	public static String auth(AllUsers all) {
		Scanner input = new Scanner(System.in);
		System.out.println("1-login\n2-Sign_up");

		String choose = input.nextLine();
		if (choose.equals("1")) {
			form f = new form();
			User user = f.loginform();
			Authentication a = new Authentication();
			return a.logIn(user.getName(), user.getPassword(), all);
		} else {
			form f = new form();
			User user = f.Signupform();
			Scanner scanner = new Scanner(System.in);
			System.out.println("if you want to be a premium user enter 1");
			String ispremium = scanner.nextLine();
			SignUp s = null;
			if (ispremium.equals("1")) {
				s = new addPremiumUser();
			} else {
				s = new addUser();
			}

			return s.signUp(user.getName(), user.getEmail(), user.getPassword(), user.getGender(), user.getCountry(),
					user.getBirthdate());
		}
	}

	public static void main(String[] args) {
		AllUsers allusers = new AllUsers();
		databasehandler d = new databasehandler();
		allusers = d.getalluser();
		Scanner in=new Scanner(System.in);
		do  {
			
			String currentuserid = "";
			currentuserid = auth(allusers);
			if(currentuserid.equals(""))
			{
				System.out.println("invaled input");
			}
			else
			{
				System.out.println("your id is : "+currentuserid);
			}
			allusers = d.getalluser();
			//System.out.println(currentuserid);
			Scanner input = new Scanner(System.in);
			UserController uc = new UserController();
			while (!currentuserid.equals("")) {
				manu();

				String choose = input.nextLine();

				if (choose.equals("1")) {
					Search s = new FriendSearch();
					form f = new form();
					ArrayList<String> Searchids = s.search(f.name(), allusers);
					System.out.println("the Search result is : ");
					for (int i = 0; i < Searchids.size(); i++) {
						allusers.Displaybyid(Searchids.get(i));
					}
				} else if (choose.equals("2")) {
					System.out.print("enter the id of user that you want to send friend request to him: ");
					String friendid = input.nextLine();
					uc.sendFriendRequest(currentuserid, friendid);
					allusers = d.getalluser();
				} else if (choose.equals("3")) {
					System.out.println("your send friend request list is: ");
					PremiumUser p = allusers.getpremiumuserbyid(currentuserid);
					User u = allusers.getuserbyid(currentuserid);
					if (p != null) {
						for (int i = 0; i < p.getAddRequestList().size(); i++) {
							allusers.Displaybyid(p.getAddRequestList().get(i));
						}
					}
					if (u != null) {
						for (int i = 0; i < u.getAddRequestList().size(); i++) {
							allusers.Displaybyid(u.getAddRequestList().get(i));
						}
					}
					System.out.print("enter the id of the friend that you want to accept him: ");
					String friend = input.nextLine();
					uc.acceptFriend(currentuserid, friend);
					allusers = d.getalluser();
				} else if (choose.equals("4")) {
					uc.updatestate(currentuserid);
				} else if (choose.equals("5")) {
					uc.seeAllNotifications(currentuserid);
				} else {
					currentuserid = "";
				}
			}
			System.out.println("if you want to login or Sign up enter 1 else exit from the system");
			String exit=in.nextLine();
			if(!exit.equals("1"))
			{
				break;
			}
		}while(true);

	}

}
