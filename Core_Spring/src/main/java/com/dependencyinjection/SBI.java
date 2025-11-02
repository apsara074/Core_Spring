package com.dependencyinjection;


//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
//to which bean should inject by ioc will choose by this annotation to set priority
public class SBI implements PhonePay{

	@Override
	public void addBank() {
		System.out.println("SBI Bank is added with in amount of 10000");
		
	}

}
