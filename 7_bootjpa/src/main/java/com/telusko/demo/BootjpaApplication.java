// for this we need to start from 
//1. new spring starter project > next > search for web , jpa , h2 , and select these and press next


package com.telusko.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootjpaApplication.class, args);
	}

}
