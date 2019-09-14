package com.liang.firstspring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User)applicationContext.getBean("User");
        AllCollections allCollections = (AllCollections)applicationContext.getBean("collectionsDemo");
        System.out.println(user);
        System.out.println(allCollections);
        user.sayHello();
    }
}
