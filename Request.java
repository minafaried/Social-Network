/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Request implements Notification{
    private static Request object;
    
    private Request(){
        
    }
    
    public Request getObject(){
        if (object == null){
            object = new Request();
        }
        
        return object;
    }
    public void sendNotification(String userId){
        
    }
}
