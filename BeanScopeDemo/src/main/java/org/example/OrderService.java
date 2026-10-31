package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("singleton")  Eager Initialization // Default Scope to change a scope use prototype scope

//@Scope("prototype")    // Lazy initialization

@Scope("singleton")
public class OrderService {


    public  OrderService(){
        System.out.println("Order Service Created");
    }

    public void plcaeOrder(){
        System.out.println("Order Placed");

   }
}
