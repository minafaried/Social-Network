/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Link implements Notification{
    private static Link object;
    
    private Link(){
        
    }
    
    public Link getObject(){
        if (object == null){
            object = new Link();
        }
        
        return object;
    }
    
    public void sendNotification(String userId){
        
    }
}
