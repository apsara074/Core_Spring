package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@ComponentScan(basePackages="com")
@Component
@PropertySource("com/CustomerDetails.properties")
public class CustomerDetails {
	@Value("${customerid}")
	private int id;
	@Value("${customername}")
	private String name;
	@Value("${customeremailid}")
	private String emailid;
	@Value("${customerpassword}")
	private String password;
	@Value("${customermobile}")
	private long mobileno;
	@Value("${customergender}")
	private String gender;
	
	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", name=" + name + ", emailid=" + emailid + ", password=" + password
				+ ", mobileno=" + mobileno + ", gender=" + gender + "]";
	}
	public CustomerDetails()
	{
		System.out.println("Constructor Called");
	}
	
	public void displayCustomerDetails()
	{
		System.out.println("Customer Name : Dinga");
	}

}
