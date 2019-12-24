import java.util.ArrayList;

public class UserController implements LeaveFromPagre, LeaveFromGroup, PagePost, GroupPost, ProfilePost {

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

	@Override
	public void createProfilePost(User mainuser, Post p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createGroupPost(User mainuser, String groupid, Post p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void createPagePost(User mainuser, String pageid, Post p) {
		// TODO Auto-generated method stub

	}

	@Override
	public void leaveFromGroub(User mainuser, String pageid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void leaveFromPage(User mainuser, String pageid) {
		// TODO Auto-generated method stub

	}
}
