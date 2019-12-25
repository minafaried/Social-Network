
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
public class Group {

    private String name;
    private String type;
    private String profilePicture ;
    private ArrayList<User> members;
    private ArrayList<User> admins;
    private String id;
    private ArrayList<Post> waitPosts;
    private ArrayList<Post> allPost;
    private boolean postOrNot;
    
    
    
     public void setName(String n){
        name=n;
    }
    public void settype(String n){
        type=n;
    }
    public void setId(String n){
        id=n;
    }
    public void setProfilePicture(String n){
        profilePicture=n;
    }
    public void setProfilePicture(boolean n){
        postOrNot=n;
    }
    public void setMember(ArrayList<User> m){
        members=m;
    }
    public void setAdmins(ArrayList<User> m){
        admins=m;
    }
    public void setWaitPost(ArrayList<Post> p){
        waitPosts=p;
    }
    public void setAllPost(ArrayList<Post> p){
        allPost=p;
    }
    public String getName(){
        return name;
    }
    public String getProfilePicture(){
       return profilePicture;
    }
    public String getType(){
        return type;
    }
    public String getId(){
        return id;
    }
    public boolean getPostOrNot(){
        return postOrNot;
    }
    public ArrayList<User> getMember( ){
       return members;
    }
    public ArrayList<User> getAdmins(){
        return admins;
    }
    public ArrayList<Post> getWaitPost(){
       return waitPosts;
    }
    public ArrayList<Post> getAllPost(){
        return allPost;
    }
}
