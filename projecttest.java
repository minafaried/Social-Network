import org.testng.annotations.Test;

import java.sql.Date;

import org.junit.Assert;
import org.testng.annotations.DataProvider;

public class projecttest {

	@SuppressWarnings("deprecation")
	@DataProvider(name = "signup")
	public Object[][] Signup() {

		 Date birth = new Date(2020,5, 5);
		return new Object[][] { { "", "mayada", "mayada@gmail.com", "123", "f", "giza",birth },
				{ "", "m", "m@gmail.com", "123", "m", "giza",birth} };
	}

	@Test(dataProvider = "signup")
	public void signuptest(String res, String name, String email, String pass, String g, String c, Date d) {
		SignUp s = new addUser();
		Assert.assertNotEquals(s.signUp(name, email, pass, g, c, d), res);
	}
	
	@DataProvider(name = "sendrequest")
	public Object[][] sendrequest() {
		return new Object[][] {{true,"1","2"},{true,"5","2"},{true,"20","22"}};
	}
	
	@Test(dataProvider = "sendrequest")
	public void sendfriendtest(boolean res,String id1,String id2) {
		UserController uc=new UserController();			
		Assert.assertEquals(uc.sendFriendRequest(id1, id2), res);
	}
	
	@DataProvider(name = "acceptfriend")
	public Object[][] accreptfriend() {
		return new Object[][] {{true,"2","1"},{true,"2","5"},{true,"22","20"}};
	}
	
	@Test(dataProvider = "acceptfriend")
	public void accreptfriendtest(boolean res,String id1,String id2) {
		UserController uc=new UserController();			
		Assert.assertEquals(uc.acceptFriend(id1, id2), res);
	}
}
