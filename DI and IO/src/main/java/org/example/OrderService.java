package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpNotificationService;
import org.example.notification.SMSService;

public class OrderService {


//    NotificationService notificationService = new EmailService();
//    NotificationService notificationService = new SMSService();
// NotificationService notificationService = new PopUpNotificationService();


    NotificationService notification;
 public OrderService(NotificationService notification){
     this.notification=notification;
 }

 public OrderService(){

 }

    public void orderPlaced(){
        System.out.println("Order PLaced");
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
