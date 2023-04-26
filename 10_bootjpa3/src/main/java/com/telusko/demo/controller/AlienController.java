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
	@ResponseBody
	public String getAliens()
	{
		return repo.findAll().toString(); // this will give all the aliens // till findAll, it returned an iterator
				
	}

	// for fetching data by aid
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public String getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid).toString();
		
		
	}
}
