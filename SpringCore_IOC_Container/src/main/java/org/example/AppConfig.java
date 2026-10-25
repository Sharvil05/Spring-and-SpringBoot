package org.example;
import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.example.payment.UPIPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@Configuration // IT tells this class is a Configuration class
@ComponentScan("org.example")  // It searches the all class there Written @Component in all top of class
public class AppConfig {

    @Bean // We say that IOC this object is created by us adn Spring IOC can Manage it
    public User createUser(){
        return new User("Sharvil",21);
    }

    @Bean
    public CartService cartService(){  // THis is an external class
        return new CartService();
    }

    /*
    @Bean
    public PaymentService createdPayment(){
        return  new CardPayment();
    }
    */


    /*
    @Bean
    public OrderService createOrderService(PaymentService paymentService){
        /*
        PaymentService payment = createdPayment();
        OrderService order = new OrderService(payment);
        order.setPayment(payment);
         */

//        return new OrderService();
/*
        return  new OrderService(paymentService);
    }
    */

    //Here also Problem of Same bean
    // Solution is below

    @Bean
   // @Primary
    @Qualifier
    public PaymentService createdPayment(){
        return  new CardPayment();
    }

    @Bean
    @Qualifier
    public PaymentService createUpiPayment(){
        return  new UPIPayment();
    }

    @Bean
    public OrderService createOrderService(@Qualifier("createUpiPayment") PaymentService paymentService){
        return  new OrderService(paymentService);
    }
}
