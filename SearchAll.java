
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
    
     private Search s; 
     public SearchAll() {
	}
     public ArrayList<String> SearchAboutPage(String name,AllUsers a){
         s = new PageSearch();
         return   s.search(name,a);
     }         
     public ArrayList<String> SearchAboutGroup(String name,AllUsers a){
          s = new GroupSearch();
          
         return s.search(name,a);
     }
     public ArrayList<String> SearchAboutHashTag(String name, AllUsers a){
         s = new HashTagSearch();
         
         return  s.search(name,a);
     }
     public ArrayList<String> SearchAboutFriend(String name,AllUsers a){
         s = new FriendSearch();
         return   s.search(name,a);
     }
    
}
