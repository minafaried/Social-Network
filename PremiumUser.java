import java.sql.Date;
import java.util.ArrayList;


public class PremiumUser {

	private String userId;
	private String name;
	private String email;
	private String password;
	private String gender ;
	private String country;
	private Date birthdate;
	private ArrayList<Group> listOfGroup;
	private ArrayList<Page> listOfPage;
	private ArrayList<Post> listOfPost;
	private ArrayList<GroupMessage> listOfChat;
	private ArrayList<String> friendsids;
	private String profilePicture;
	private ArrayList<String> addRequestIdList;

	public PremiumUser() {
		addRequestIdList = new ArrayList<String>();
		email = "";
		friendsids = new ArrayList<String>();
		listOfChat = new ArrayList<GroupMessage>();
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

	public ArrayList<GroupMessage> getListOfChat() {
		return listOfChat;
	}

	public void setListOfChat(GroupMessage Chat) {
		this.listOfChat.add(Chat);
	}

	public ArrayList<String> getFriends() {
		return friendsids;
	}

	public void setFriends(String friendid) {
		this.friendsids.add(friendid);
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public ArrayList<String> getAddRequestList() {
		return addRequestIdList;
	}

	public void setAddRequestList(String userid) {
		this.addRequestIdList.add(userid);
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
	public void display() {
		System.out.print("id: "+this.userId+" \nname:"+this.name+"\nfriendsid: ");
		for (int i = 0; i < friendsids.size(); i++) {
			System.out.print(friendsids.get(i)+" ");
		}
		System.out.print("\naddRequestListids: ");
	
		for (int i = 0; i < addRequestIdList.size(); i++) {
			System.out.print(addRequestIdList.get(i)+" ");
		}
		System.out.println();
	}
}
