package com.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class ICICI implements PhonePay
{
	@Override
	public void addBank() {
		System.out.println("ICICI Bank is added with in amount of 5000");
//		given implementation to abstract method
	}
  
}
