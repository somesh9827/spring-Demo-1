package com.somworld.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by somesh.shrivastava on 15/01/15.
 */
public class App {

    public static void main(String a[]) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        HelloWorld obj = (HelloWorld)context.getBean("helloBean");
        obj.printHello();
    }
}
