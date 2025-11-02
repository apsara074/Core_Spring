package com.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
	
	
  public static void main(String[] args) {
	  ApplicationContext contex=new AnnotationConfigApplicationContext(User.class);
	  User user=contex.getBean(User.class);
	  user.transferAmount();
  }
}
