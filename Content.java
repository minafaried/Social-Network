/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmed
 */
public class Content {
 Content text;
 User user;
 public void setText(Content t){
     text=t;
 } 
 public void setUser(User u){
     user=u;
 }
 public Content setText(){
     return text;
 } 
 public User setUser(){
     return user;
 }
}
