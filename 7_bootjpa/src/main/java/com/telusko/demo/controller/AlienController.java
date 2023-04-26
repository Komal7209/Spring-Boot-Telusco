//3. created this page for running webpage

package com.telusko.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

@Controller
public class AlienController
{
	//9.2 using the interface, autowired will instanciate the same
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	//8.  using below method to add data to the .jsp page and then we are required to create interface
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) // fetching the value of alien and then saving to db
	{
		repo.save(alien); // 9.3 because of this line, whatever we will submit from webpage, that will get saved to db
		return "home.jsp";
	}
}
