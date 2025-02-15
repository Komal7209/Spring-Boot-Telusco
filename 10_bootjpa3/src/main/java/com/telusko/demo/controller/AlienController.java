package com.telusko.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

@Controller
public class AlienController
{
	@Autowired
	AlienRepo repo;

	// home page
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}

	// for adding data
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}

	// for fetching data
	@RequestMapping("/aliens")
	@ResponseBody // 2. because of this it becomes data to be send
	public String getAliens()
	{
		return repo.findAll().toString(); //1.  this will give all the aliens // till findAll, it returned an iterator, so required to write toString
											// 1.2 And this is just a view name
				
	}

	// for fetching data by aid
	@RequestMapping("/alien/{aid}") // 3. putting wildcard i.e {}
	@ResponseBody
	public String getAlien(@PathVariable("aid")int aid) //3.1  using @PathVariable for fetching from browser aid
	{
		return repo.findById(aid).toString();
		
		
	}
}
