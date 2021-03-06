package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ByUsingPropertiesFileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ByUsingPropertiesFileApplication.class, args);
	}
	
	
	@Bean
	public ResourceBundleMessageSource messageSource() {
	    ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	    messageSource.addBasenames("messages");
	    return messageSource;
	}


}
