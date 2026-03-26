package com.bnp.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name = "gs1")
	public GreetingserviceImpl getGs1() {
		GreetingserviceImpl gs=new GreetingserviceImpl();
		gs.setGreeting("Good Noon");
		return gs;
		
	}
	
	
	
}
