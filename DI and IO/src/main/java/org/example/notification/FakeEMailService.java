package org.example.notification;

public class FakeEMailService implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("Dummy email Sent");
    }
}
