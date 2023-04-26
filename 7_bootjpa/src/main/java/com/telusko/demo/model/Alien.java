package com.telusko.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//6. Adding @Entity and @Id will create an empty table
// 7. or src>main>resources > right click > new> untitled text file > search for file in the wizard> type data.sql and submit > new data.sql will be created
// if you want to add entries in above table, we can use this data.sql to write queries to insert data, and whenever we run, this file will be loaded n insert data into the table

@Entity 
public class Alien {
@Id
	private int aid;
	private String aname;
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
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + "]";
	}

}
