import java.util.ArrayList;

public class UserController {

	private Leave leave;
	private CreatePost createpost;
	
	public void sendFriendRequest(User mainuser, User user) {
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

	public void acceptFriend(User mainuser, User friend) {

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
		createpost.createPost(mainuser,group.id , p);

	}

	
	public void createGroupPost(User mainuser, Page page, Post p) {
		this.createpost=new GroupPost();
		createpost.createPost(mainuser,page.id , p);

	}


	public void leaveFromGroup(User mainuser, Group group) {
		this.leave=new LeaveFromGroup();
		leave.leave(mainuser, group.id);

	}

	public void leaveFromPage(User mainuser, Page page) {
		this.leave=new LeaveFromPage();
		leave.leave(mainuser, page.id);

	}
}
