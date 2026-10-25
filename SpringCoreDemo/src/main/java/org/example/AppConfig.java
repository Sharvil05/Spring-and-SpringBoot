package org.example;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // IT tells this class is a Configuration class
@ComponentScan("org.example")  // It searches the all class there Written @Component in all top of class
public class AppConfig {
}
