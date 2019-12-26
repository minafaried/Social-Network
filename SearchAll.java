
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
public class SearchAll {
    
     Search s;   
     public ArrayList<String> SearchAboutPage(String name){
         s = new PageSearch();
         s.search(name);
         return  null;
     }         
     public ArrayList<String> SearchAboutGroup(String name){
          s = new GroupSearch();
          s.search(name);
         return  null;
     }
     public ArrayList<String> SearchAboutHashTag(String name){
         s = new HashTagSearch();
         s.search(name);
         return  null;
     }
     public ArrayList<String> SearchAboutFriend(String name){
         s = new FriendSearch();
         s.search(name);
         return  null;
     }
    
}
