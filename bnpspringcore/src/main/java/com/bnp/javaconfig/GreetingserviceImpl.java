package com.bnp.javaconfig;

public class GreetingserviceImpl implements GreetingService {
	private String greeting;
	

	public GreetingserviceImpl(String greeting) {
		super();
		this.greeting = greeting;
	}


	public GreetingserviceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getGreeting() {
		return greeting;
	}


	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}


	@Override
	public void sayHi() {
		System.out.println("hi..."+greeting);
		
	}

}
