import java.sql.*;
import java.util.ArrayList;


class Ids {
	String id1;
	String id2;
}
//mona

public class databasehandler {
	private String databaseIP = "DESKTOP-R87PDJN";

	private int searchinpremiumbyid(ArrayList<PremiumUser> p, String id) {

		for (int i = 0; i < p.size(); i++) {
			if (p.get(i).getUserId().equals(id)) {
				return i;
			}
		}
		return -1;

	}

	private int searchinuserbyid(ArrayList<User> u, String id) {
		for (int i = 0; i < u.size(); i++) {
			if (u.get(i).getUserId().equals(id)) {
				return i;
			}
		}
		return -1;
	}

	public AllUsers getalluser() // mina
	{
		AllUsers allusers = new AllUsers();

		ArrayList<Ids> friends = new ArrayList<Ids>();
		ArrayList<Ids> addrequest = new ArrayList<Ids>();

		String connectionUrl = "jdbc:sqlserver://" + databaseIP + ";databaseName=SN_db;integratedsecurity=true;";
		try (Connection con = DriverManager.getConnection(connectionUrl, "root", "root");
				Statement stmt1 = con.createStatement();
				Statement stmt2 = con.createStatement();
				Statement stmt3 = con.createStatement();) {
			String SQL = "SELECT  * FROM users;";
			String SQL1 = "Select*from FRINDES;";
			String SQL2 = "select*from addrequestlist;";
			ResultSet users = stmt1.executeQuery(SQL);
			ResultSet f = stmt2.executeQuery(SQL1);
			ResultSet a = stmt3.executeQuery(SQL2);
			while (f.next()) {
				Ids fr = new Ids();
				fr.id1 = f.getString("UserId");
				fr.id2 = f.getString("friendid");
				friends.add(fr);
				// System.out.println(f.getString("UserId")+" "+f.getString("friendid"));

			}
			// f.close();

			while (a.next()) {
				Ids ar = new Ids();
				ar.id1 = a.getString("UserId");
				ar.id2 = a.getString("friendrequestid");
				addrequest.add(ar);
			}
			// a.close();
			while (users.next()) {
				if (users.getInt("is_Premium_Users") == 1) {
					PremiumUser puser = new PremiumUser();
					puser.setUserId(users.getString("UserId"));
					puser.setName(users.getString("name"));
					puser.setPassword(users.getString("password"));
					puser.setEmail(users.getString("email"));
					puser.setGender(users.getString("gender"));
					puser.setCountry(users.getString("country"));
					puser.setBirthdate(users.getDate("birthdate"));
					// System.out.println("puser "+puser.getName());
					allusers.setPUsers(puser);
				} else {
					User user = new User();
					user.setUserId(users.getString("UserId"));
					user.setName(users.getString("name"));
					user.setPassword(users.getString("password"));
					user.setEmail(users.getString("email"));
					user.setGender(users.getString("gender"));
					user.setCountry(users.getString("country"));
					user.setBirthdate(users.getDate("birthdate"));
					// System.out.println("user "+user.getName());
					allusers.setNUsers(user);
				}

			}
			// users.close();
			con.close();
		}
		// Handle any errors that may have occurred.
		catch (SQLException e) {
			System.err.println(e);
		}

		for (int i = 0; i < friends.size(); i++) {
			int userindex = searchinuserbyid(allusers.getNUser(), friends.get(i).id1);
			int premiumindex = searchinpremiumbyid(allusers.getPUser(), friends.get(i).id1);
			int userindexvalue = searchinuserbyid(allusers.getNUser(), friends.get(i).id2);
			int premiumindexvalue = searchinpremiumbyid(allusers.getPUser(), friends.get(i).id2);
			// System.out.println(userindex+" "+userindexvalue+" "+premiumindex+"
			// "+premiumindexvalue);
			if (userindex != -1 && userindexvalue != -1) {
				allusers.getNUser().get(userindex).setFriends(allusers.getNUser().get(userindexvalue).getUserId());
			} else if (premiumindex != -1 && premiumindexvalue != -1) {
				allusers.getPUser().get(premiumindex)
						.setFriends(allusers.getPUser().get(premiumindexvalue).getUserId());
			} else if (userindex != -1 && premiumindexvalue != -1) {
				allusers.getNUser().get(userindex).setFriends(allusers.getPUser().get(premiumindexvalue).getUserId());
			} else {
				allusers.getPUser().get(premiumindex).setFriends(allusers.getNUser().get(userindexvalue).getUserId());
			}

		}
		for (int i = 0; i < addrequest.size(); i++) {
			int userindex = searchinuserbyid(allusers.getNUser(), addrequest.get(i).id1);
			int premiumindex = searchinpremiumbyid(allusers.getPUser(), addrequest.get(i).id1);
			int userindexvalue = searchinuserbyid(allusers.getNUser(), addrequest.get(i).id2);
			int premiumindexvalue = searchinpremiumbyid(allusers.getPUser(), addrequest.get(i).id2);
			// System.out.println(userindex+" "+userindexvalue+" "+premiumindex+"
			// "+premiumindexvalue);
			if (userindex != -1 && userindexvalue != -1) {
				allusers.getNUser().get(userindex)
						.setAddRequestList(allusers.getNUser().get(userindexvalue).getUserId());
			} else if (premiumindex != -1 && premiumindexvalue != -1) {
				allusers.getPUser().get(premiumindex)
						.setAddRequestList(allusers.getPUser().get(premiumindexvalue).getUserId());
			} else if (userindex != -1 && premiumindexvalue != -1) {
				allusers.getNUser().get(userindex)
						.setAddRequestList(allusers.getPUser().get(premiumindexvalue).getUserId());
			} else {
				allusers.getPUser().get(premiumindex)
						.setAddRequestList(allusers.getNUser().get(userindexvalue).getUserId());
			}

		}
		return allusers;

	}

	public User adduser(User user)// miada
    {
        String name = user.getName();
        String password = user.getPassword();
        String email = user.getEmail();
        String gender = user.getGender();
        String country = user.getCountry();
        Date birthdate = user.getBirthdate();
        int is_premium = 0;
        // String PayPal = "";
        // String creditCard = "";
        //System.out.println(birthdate.getYear()+" "+birthdate.getMonth()+" "+birthdate.getDay());
        String connectionUrl = "jdbc:sqlserver://" + databaseIP + ";databaseName=SN_db;integratedsecurity=true;";
        try (Connection con = DriverManager.getConnection(connectionUrl , "root" , "root");
                Statement stmt1 = con.createStatement(); Statement stmt2 = con.createStatement(); Statement stmt3 = con.createStatement();) {

            String SQL = "Select email from Users";
            ResultSet emails = stmt1.executeQuery(SQL);
            while (emails.next()) {
                if (emails.getString("email").equals(email)) {
                    System.out.println("The Email already exists!!");
                    return null;
                }
            }

            String SQL1 = "insert into Users(name, password, email, gender, country, birthdate, is_Premium_Users)"
                    + "values ('" + name + "' , '" + password + "' , '" + email + "' , '" + gender + "' , '" + country
                    + "' , '" + birthdate.getYear() + "-" + birthdate.getMonth() + "-" + birthdate.getDay() + "' , '" + is_premium + "') ;";

            stmt2.executeUpdate(SQL1);

            String SQL2 = "select * from Users where name = '" + name + "' and password = '" + password
                    + "' and email = '" + email + "'" + " and gender = '" + gender + "' and country = '" + country
                    + "' and is_Premium_Users = '" + is_premium + "';";

            ResultSet newID = stmt3.executeQuery(SQL2);
            newID.next();
            user.setUserId(newID.getString("UserId"));
            //System.out.println(newID.getDate("birthdate"));

            con.close();
        }

        // Handle any errors that may have occurred.
        catch (SQLException e) {
            System.err.println(e);
        }
        return user;

    }

    public PremiumUser addpremiumuser(PremiumUser user)// miada
    {
        String name = user.getName();
        String password = user.getPassword();
        String email = user.getEmail();
        String gender = user.getGender();
        String country = user.getCountry();
        Date birthdate = user.getBirthdate();
        int is_premium = 1;
        String payPal = user.getPaypal();
        String creditCard = user.getcreditCard();

        String connectionUrl = "jdbc:sqlserver://" + databaseIP + ";databaseName=SN_db;integratedsecurity=true;";
        try (Connection con = DriverManager.getConnection(connectionUrl , "root" , "root");
                Statement stmt1 = con.createStatement(); Statement stmt2 = con.createStatement(); Statement stmt3 = con.createStatement();) {

            String SQL = "Select email from Users";
            ResultSet emails = stmt1.executeQuery(SQL);
            while (emails.next()) {
                if (emails.getString("email").equals(email)) {
                    System.out.println("The Email already exists!!");
                    return null;
                }
            }

            String SQL1 = "insert into [Users](name,password,email,gender,country,birthdate,is_Premium_Users,PayPal,credit_card)"
                    + "values ('" + name + "' , '" + password + "' , '" + email + "' , '" + gender + "' , '" + country
                    + "' , '" + birthdate.getYear() + "-" + birthdate.getMonth() + "-" + birthdate.getDay() + "' , '" + is_premium + "', '" + payPal + "' , '" + creditCard + "') ;";

            int x = stmt2.executeUpdate(SQL1);

            if (x > 0) {
                System.out.println("User successfully added into System...");
            }
            else {
                System.out.println("ERROR OCCURED WHEN INSERTING!!");
            }

            String SQL2 = "select UserId from Users where name = '" + name + "' and password = '" + password
                    + "' and email = '" + email + "'" + " and gender = '" + gender + "' and country = '" + country
                    + "' and is_Premium_Users = '" + is_premium + "';";

            ResultSet newID = stmt3.executeQuery(SQL2);
            newID.next();
            user.setUserId(newID.getString("UserId"));

            con.close();
        }

        // Handle any errors that may have occurred.
        catch (SQLException e) {
            System.err.println(e);
        }
        return user;

    }

    /*
     * we check if friend request Id is valid then we add userId and friend request
     * Id into table addrequestlist by this i send a request to a friend
     */
    public boolean sendfriendrequest(String userid , String friendrequestid)// naglaa
    {
        String connectionUrl = "jdbc:sqlserver://" + databaseIP + ";databaseName=SN_db;integratedsecurity=true;";
        try (Connection con = DriverManager.getConnection(connectionUrl , "root" , "root");
                Statement stmt1 = con.createStatement();) {

            String SQL = "insert into addrequestlist values ('" + Integer.parseInt(userid) + "' , '"
                    + Integer.parseInt(friendrequestid) + "') ;";
           int x= stmt1.executeUpdate(SQL);
            con.close();

            String message = "Firend Request from " + friendrequestid;
            sendingNotification(userid , message);
            if(x==0)
            {
            	return false;
            }
            else
            {
            	return true;
            }
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }

    }

    /*
     * when the user accept friend request, we must delete the user that sent friend
     * request from (add request list) and add him to (friend list) of the user.
     */
    public boolean acceptfriendrequest(String userid , String friendid)// mona
    {

        String connectionUrl = "jdbc:sqlserver://" + databaseIP + ";databaseName=SN_db;integratedsecurity=true;";
        try (Connection con = DriverManager.getConnection(connectionUrl , "root" , "root");
                Statement stmt1 = con.createStatement(); Statement stmt2 = con.createStatement();) {

            String SQL1 = "delete from addrequestlist where UserId = '" + Integer.parseInt(userid) + "' ;";
            String SQL2 = "insert into FRINDES values ('" + Integer.parseInt(userid) + "' , '"
                    + Integer.parseInt(friendid) + "') ;"
                    + "insert into FRINDES values ('" + Integer.parseInt(friendid) + "' , '"
                    + Integer.parseInt(userid) + "') ;";

            stmt1.executeUpdate(SQL1);
           int x= stmt2.executeUpdate(SQL2);

            con.close();

            String message = "Accept Firend Requset from " + userid;
            sendingNotification(friendid , message);

            String tempMessage = "Firend Request from " + friendid;
            clearNotification(userid , tempMessage);
            if(x==0)
            {
            	return false;
            }
            else
            {
            	return true;
            }
        }

        // Handle any errors that may have occurred.
        catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    /*upgrade the normal user to premium user*/
    public void updateUserState(String userid , String paypal , String credit_card) {
        String connectionUrl = "jdbc:sqlserver://" + databaseIP + ";databaseName=SN_db;integratedsecurity=true;";
        try (Connection con = DriverManager.getConnection(connectionUrl , "root" , "root");
                Statement stmt1 = con.createStatement();) {

            String SQL1 = "update Users set is_Premium_Users = '" + 1 + "' , PayPal = '" + paypal + "' , credit_card = '" + credit_card + "'"
                    + "where UserId = '" + Integer.parseInt(userid) + "';";
            stmt1.executeUpdate(SQL1);
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e);
        }
    } 

    /*when user send friend requset to another user, the another user 
    should receive notification*/
    public void sendingNotification(String toId , String content) {
        String connectionUrl = "jdbc:sqlserver://" + databaseIP + ";databaseName=SN_db;integratedsecurity=true;";
        try (Connection con = DriverManager.getConnection(connectionUrl , "root" , "root");
                Statement stmt1 = con.createStatement();) {

            String SQL1 = "insert into Notifications values('" + Integer.parseInt(toId) + "' , '" + content + "');";
            stmt1.executeUpdate(SQL1);
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e);
        }
    }

    /*user can see his all notifications*/
    public ArrayList<String> getAllNotifications(String userId) {
        ArrayList<String> notifications = new ArrayList<String>();

        String connectionUrl = "jdbc:sqlserver://" + databaseIP + ";databaseName=SN_db;integratedsecurity=true;";
        try (Connection con = DriverManager.getConnection(connectionUrl , "root" , "root");
                Statement stmt1 = con.createStatement();) {

            String SQL1 = "select content from Notifications where userid = '" + Integer.parseInt(userId) + "';";
            ResultSet messages = stmt1.executeQuery(SQL1);

            while (messages.next()) {
                notifications.add(messages.getString("content"));
            }

            con.close();
        }
        catch (SQLException e) {
            System.err.println(e);
        }

        return notifications;
    }

    /*when user accept friend requset, we should clear friend request notification from his notifications*/
    public void clearNotification(String userId , String content) {
        String connectionUrl = "jdbc:sqlserver://" + databaseIP + ";databaseName=SN_db;integratedsecurity=true;";
        try (Connection con = DriverManager.getConnection(connectionUrl , "root" , "root");
                Statement stmt1 = con.createStatement();) {

            String SQL1 = "delete from Notifications where userid = '" + Integer.parseInt(userId) + "' and content = '" + content + "' ;";
            stmt1.executeUpdate(SQL1);
            con.close();
        }
        catch (SQLException e) {
            System.err.println(e);
        }
    }
}
