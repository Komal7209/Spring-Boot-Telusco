// here we will be doing crud operation and also using xml format
// use postman
// it's content starts from 2.11
// in this we have just done for converting to xml and how to just restrict to xml

package com.telusko.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootjpaApplication.class, args);
	}

}


/*
 * In postman
 * under headers
 * key: Accept , Value: application/xml => this will let to accept just xml data
 */

 /*
  * go to mvn repository online
  * then check for jackson dataformat XML => and import this dependency in pom.xml
  * then we will be able to convert to xml format
 */