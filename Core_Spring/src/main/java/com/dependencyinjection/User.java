package com.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages="com.dependencyinjection")

//remain classes to create bean we use this mean overall package(com) it create bean
public class User {
	@Autowired
	@Qualifier("SBI")
//	inject the bean(object)automatically into the non primitive data type
//	if we create object{ User user=new ICICI();} it is do by jvm if we use ioc we use @Autowired
	PhonePay pay;
   public void transferAmount() {
	   pay.addBank();
   }
}
