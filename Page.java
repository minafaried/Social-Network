
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
public class Page {
    private  String name;
    private String profilePicture;
    private String pageId;
    private ArrayList<User> member = new ArrayList<User>(); 
    private ArrayList<User> admins = new ArrayList<User>(); 
    private ArrayList<Post> waitPost = new ArrayList<Post>(); 
    private ArrayList<Post> allPost = new ArrayList<Post>(); 
    
    public void setName(String n){
        name=n;
    }
    public void setProfilePicture(String n){
        profilePicture=n;
    }
    public void setPageId(String n){
        pageId=n;
    }
    public void setMember(ArrayList<User> m){
        member=m;
    }
    public void setAdmins(ArrayList<User> m){
        admins=m;
    }
    public void setWaitPost(ArrayList<Post> p){
        waitPost=p;
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
    public String getPageId(){
        return pageId;
    }
    public ArrayList<User> getMember( ){
       return member;
    }
    public ArrayList<User> getAdmins(){
        return admins;
    }
    public ArrayList<Post> getWaitPost(){
       return waitPost;
    }
    public ArrayList<Post> getAllPost(){
        return allPost;
    }
    
}
