import java.util.ArrayList;

public class User {

	private String userId;
	private String name;
	private String email;
	private String password;
	private ArrayList<Group> listOfGroup;
	private ArrayList<Page> listOfPage;
	private ArrayList<Post> listOfPost;
	private ArrayList<Messages> listOfChat;
	private ArrayList<User> friends;
	private String profilePicture;
	private ArrayList<User> addRequestList;

	public User() {
		addRequestList = new ArrayList<User>();
		email = "";
		friends = new ArrayList<User>();
		listOfChat = new ArrayList<Messages>();
		listOfGroup = new ArrayList<Group>();
		listOfPage = new ArrayList<Page>();
		listOfPost = new ArrayList<Post>();
		name = "";
		password = "";
		profilePicture = "";
		userId = "";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Group> getListOfGroup() {
		return listOfGroup;
	}

	public void setListOfGroup(Group group) {
		this.listOfGroup.add(group);
	}

	public ArrayList<Post> getListOfPost() {
		return listOfPost;
	}

	public void setListOfPost(Post post) {
		this.listOfPost.add(post);
	}

	public ArrayList<Page> getListOfPage() {
		return listOfPage;
	}

	public void setListOfPage(Page page) {
		this.listOfPage.add(page);
	}

	public ArrayList<Messages> getListOfChat() {
		return listOfChat;
	}

	public void setListOfChat(Messages Chat) {
		this.listOfChat.add(Chat);
	}

	public ArrayList<User> getFriends() {
		return friends;
	}

	public void setFriends(User friend) {
		this.friends.add(friend);
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public ArrayList<User> getAddRequestList() {
		return addRequestList;
	}

	public void setAddRequestList(User user) {
		this.addRequestList.add(user);
	}
}
