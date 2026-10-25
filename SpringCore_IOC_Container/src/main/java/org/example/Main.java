package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.Order();

        /*
        CartService cs = new CartService(); // This is an external class added using dependency
        cs.addTOCart();
         */

        /*
        User user = context.getBean(User.class);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        */


        /*
        CartService cartService = context.getBean(CartService.class);
        cartService.addTOCart();
        */
    }
}