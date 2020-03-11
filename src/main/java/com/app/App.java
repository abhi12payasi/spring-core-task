package com.app;

import com.app.bean.Employee;
import com.app.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        AbstractApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
        //ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = (Employee)ac.getBean("employee");
        System.out.println(employee);
        ac.registerShutdownHook();
    }
}
