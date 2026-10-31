package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @Autowired
  OrderService orderService;

  /*
  public PaymentService(OrderService orderService){
      this.orderService=orderService;
  }
  */
    public void pay(){
        System.out.println("Payment Done");

        // Not its responsibility it can handle by OrdeService to resolve Circular dependency
       // orderService.getOrderDetails();
    }
}
