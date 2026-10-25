package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
        PaymentService paymentService = new PaymentService();
        OrderService order = new OrderService(paymentService);
        order.Order();
         */


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.Order();

//        PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();

    }
}