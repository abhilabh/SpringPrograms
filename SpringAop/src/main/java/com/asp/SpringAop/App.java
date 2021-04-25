package com.asp.SpringAop;

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
        System.out.println( "Hello World!" );
        ApplicationContext  context = new ClassPathXmlApplicationContext("AsopTest.xml");
        CustomerService client = context.getBean("customerServiceProxy", CustomerService.class);
        client.printName();
        client.printUrl();
        try {
        	client.printThrowException();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
}
