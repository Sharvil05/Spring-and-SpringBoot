package org.example.notification;

public class SMSService implements NotificationService{
    @Override

    public void sendNotification(){

        System.out.println("SMS notification send");
    }
}
