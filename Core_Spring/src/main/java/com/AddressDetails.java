package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/AddressDetails.properties")
public class AddressDetails {
	@Value("${pin}")
	private int pin;
	@Value("${name}")
	private String name;
	@Value("${city}")
	private String city;
	@Override
	public String toString() {
		return "AddressDetails [pin=" + pin + ", name=" + name + ", city=" + city + "]";
	}
	public void displayAddressDetails()
	{
		System.out.println("City : HYD");
	}

}
