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
	//10.  @Autowired will search by type
	@Autowired // this is required , because we are not creating object below using context or not going ahead with getBeans
	@Qualifier("lap1") //11.  this helps to search by name , thus it will search for @Component(lap1)
	private Laptop laptop; //9.  As ALien class is dependent on laptop class, so we require object of laptop class
 
	
	
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

	// getter and setter for laptop
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
		laptop.compile(); // due to object of laptop we are here calling laptop class's method and it got instantiated because @Component annotation
	}
}

	
