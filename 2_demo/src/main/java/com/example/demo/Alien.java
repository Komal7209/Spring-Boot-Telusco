// this file has been created by new > class

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 6. below annotation helps in creating object for following class 
// 7. because of component we will have following output
// object created
// in show
// in show

@Component
// @Scope(value = "prototype") 

//=> bcoz of this 2 instances will be created => i.e when we ask for instance, by "getBean", then only it will create instance
// 8. because of above will have following output
// object created
// in show
// object created
// in show
public class Alien {

	//1.  below all are properties
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	@Qualifier("lap1")
	private Laptop laptop;

	
	
	public Alien() {
		super();
		System.out.println("object created..");
	}


    //2.  below ones are getters and setters, created by ide itself, right click> source> generate getters and setters

	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	//3. this method is added, so that we can once check if ConfigurableApplicationContext is working fo creating object
	// 4. check for diagram on one note, to check how it is working...
	public void show() 
	{
		System.out.println("in show");
		laptop.compile();
	}
}

	
