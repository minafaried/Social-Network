
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nagla Essam
 */
public class Post {
    private ArrayList<String > comment;
    private int like;
    private String text;
    private String picture;
    private String postId;
    private String userId;
    
 public void setComment(ArrayList<String> c)
    {
        comment = c;
        
    }
    public ArrayList<String> getComment()
    {
        return comment;
    }
    
     public void setLike(int l)
    {
        like = l;
        
    }
    public int getLike()
    {
        return like;
    }
    
    public void setText(String txt)
    {
        text = txt;
        
    }
    public String getText()
    {
        return text;
    }
     public void setPicture(String p)
    {
        picture = p;
        
    }
    public String getPicture()
    {
        return picture;
    }
     public void setPostId(String ID)
    {
        postId = ID;
        
    }
    public String getPostId()
    {
        return postId;
    }
     public void setUserId(String userID)
    {
        userId = userID;
        
    }
    public String getUserId()
    {
        return userId;
    }
    
    
    
    
    
}
