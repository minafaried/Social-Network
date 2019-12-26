
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahmed
 */
public class GroupController {
    private static final GroupController INSTANCE = new GroupController();
    private GroupController(){}

    public static GroupController getInstance() {
        return INSTANCE;
    }

    public ArrayList<Post> postlist(String groupid) {
		return null;

    }

    public void editstate(String groupid, String type) {

    }

    public void postornot(String groupid, boolean pornp) {

    }

    public void inviteuser(String userid) {

    }

    public void acceptuser(String userid) {

    }

    public void addadmin(User user, Group group) {

    }

    public void leavegroup(String userid) {

    }

    public void deletegroup(String groupid) {

    }
}
