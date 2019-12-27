import java.util.ArrayList;
import java.util.Scanner;

public class UserController {

	private Leave leave;
	private CreatePost createpost;
	
	public void sendFriendRequest(String mainuserid, String userid) {
		databasehandler d=new databasehandler();
		d.sendfriendrequest(userid, mainuserid);
	}
	public void acceptFriend(String mainuserid, String friendid) {
		databasehandler d=new databasehandler();
		d.acceptfriendrequest(mainuserid, friendid);
	}
	
	public void seeAllNotifications(String userid){
            ArrayList<String> userNotifications = new ArrayList<String>();
            databasehandler d = new databasehandler();
            userNotifications = d.getAllNotifications(userid);
            
            for (int i=0 ; i<userNotifications.size() ; i++){
                System.out.println("notification " + (i+1) + " : ");
                System.out.println(userNotifications.get(i));
            }
        }
	public void updatestate(String id)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("place enter your paypal or credit card :");
		System.out.print("paypal : ");
		String paypal=s.nextLine();
		System.out.print("credit card : ");
		String credit=s.nextLine();
		databasehandler d=new databasehandler();
		d.updateUserState(id, paypal, credit);
	}
	public void sendGroupRequest(User mainuser, Group group) {
	}

	public ArrayList<Post> View(User mainuser) {
		return null;
	}

	public void setProfilePicture(User mainuser, String picture) {

	}

	public void createPage(User mainuser, Page p) {

	}

	public void createGroup(User mainuser, Group g) {

	}



	public void rejectFriend(User mainuser, User notfriend) {
	}

	public int getNumOfGroups() {
		return 0;

	}

	public boolean uploadPicture(User mainuser, String picture) {
		return false;
	}

	public void deleteFriend(User mainuser, String userid) {
	}

	public void deleteGroup(User mainuser, String groupid) {

	}

	public void deletePage(User mainuser, String pageid) {

	}

	public void createProfilePost(User mainuser, Post p) {
		this.createpost=new ProfilePost();
		createpost.createPost(mainuser, "", p);

	}

	public void createPagePost(User mainuser, Group group, Post p) {
		this.createpost=new PagePost();
		createpost.createPost(mainuser,group.getId() , p);

	}

	
	public void createGroupPost(User mainuser, Page page, Post p) {
		this.createpost=new GroupPost();
		createpost.createPost(mainuser,page.getPageId() , p);

	}


	public void leaveFromGroup(User mainuser, Group group) {
		this.leave=new LeaveFromGroup();
		leave.leave(mainuser, group.getId());

	}

	public void leaveFromPage(User mainuser, Page page) {
		this.leave=new LeaveFromPage();
		leave.leave(mainuser, page.getPageId());

	}
}
