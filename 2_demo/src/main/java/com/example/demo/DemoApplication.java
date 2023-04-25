package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// 5. container of springbean gets created bcoz of just below line, 
		// the moment it gets to ".run" it returns you the context , this is where it initialises your container
		// in this container, it will try to create all objects of those classes, where @Component annotation will be written
		// 6. the moment below line runs, it will create object for the class where @Component was mentioned
		ConfigurableApplicationContext context =  SpringApplication.run(DemoApplication.class, args); // here the run method, returns object of ConfigurableApplicationContext class, so run method returns object of this one
		Alien a = context.getBean(Alien.class); // getBean refers to getting object of Alien class
		a.show(); // a is object of Alien class, and show is method of class Alien , so with a object we will be calling show method

		Alien a1 = context.getBean(Alien.class); 
		a1.show();
	}

}
