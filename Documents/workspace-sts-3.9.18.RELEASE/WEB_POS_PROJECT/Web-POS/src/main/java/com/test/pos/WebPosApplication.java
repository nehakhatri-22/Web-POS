package com.test.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebPosApplication { 

	public static void main(String[] args) {
		System.out.print("application starting");
		SpringApplication.run(WebPosApplication.class, args);
		
	}

}
