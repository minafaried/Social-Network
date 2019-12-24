
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
public class HashTag {
    private String name;
    private ArrayList<Post>posts = new ArrayList<Post>();
    
    public void setName(String n)
    {
        name = n;
        
    }
    public String getName()
    {
        return name;
    }
    public void setPost(ArrayList<Post>p)
    {
        posts = p;
    }
    public ArrayList<Post> getPost()
    {
        return posts;
    }
    
    
    
}
