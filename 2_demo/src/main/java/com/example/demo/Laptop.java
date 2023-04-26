package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1") // because of this only it got instantiated
public class Laptop
{
	// properties
	private int lid;
	private String brand;

	// getters and setter for those properties
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	//9. source > toString()
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}
	
	public void compile() {
		System.out.println("compiling");
	}
}


