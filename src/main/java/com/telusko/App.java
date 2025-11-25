package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // Object is created with this line not below. bean tagged object will create
        Alien obj1 = (Alien) context.getBean("alien1");
//        obj.code();
        System.out.println(obj1.getAge());
        obj1.code();
    }
}
