package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWordConfig {
	
	@Bean
	public SayToWorld sayToWorld() {
		return new SayToWorld();
	}
}
