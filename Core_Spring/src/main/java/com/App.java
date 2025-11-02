package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
    	ApplicationContext context = new AnnotationConfigApplicationContext(CustomerDetails.class);
//    	for(String string:context.getBeanDefinitionNames())
//		System.out.println(string);
//    	CustomerDetails customerDetails=context.getBean(CustomerDetails.class);
//    	customerDetails.displayCustomerDetails();
    	/* getBean() is Us+ed to get the bean from the IOC Container
    	 * IT is the non-static method present in the BeanFactory
    	 * It is an argument method which can take class file as an argument
    	 * It is the return type method which can return Class Object*/
//    	System.out.println("----------------------------------------------------");
//    	AddressDetails addressDetails=context.getBean(AddressDetails.class);
//    	addressDetails.displayAddressDetails();
    	CustomerDetails customerDetails=context.getBean(CustomerDetails.class);
    	System.out.println(customerDetails);
    	AddressDetails addressDetails=context.getBean(AddressDetails.class);
    	System.out.println(addressDetails);

    }
}