package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    /*
    3. Field Injection

    @Autowired
    private PaymentService payment;
     */


    /*
    1. Constructor Injection (Recommended)

    @Autowired
    public OrderService(PaymentService payment){
        this.payment=payment;
    }
    */


    /*
    2. Setter Injection

    @Autowired
    public void setPayment(PaymentService payment) {
        this.payment = payment;
    }
    */

    private final PaymentService payment;

    @Autowired
    public OrderService(PaymentService payment){
        this.payment=payment;
    }

    public void Order(){

         payment.pay();

        System.out.println("Order Placed");
    }
}
