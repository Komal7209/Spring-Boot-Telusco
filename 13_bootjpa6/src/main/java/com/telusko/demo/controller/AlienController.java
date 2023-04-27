package com.telusko.demo.controller;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.AlienRepo;
import com.telusko.demo.model.Alien;

@RestController // we can remove requestBody annotation from all RequestMapping and use RestController here
public class AlienController
{
	@Autowired
	AlienRepo repo;

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}

	// here server is consuming json data
	@PostMapping(path="/alien",consumes= {"application/json"}) // rather than using RequestMapping(path="/alien",consumes= {"application/json"}, method = POST) 
	public Alien addAlien(@RequestBody Alien alien) // using this annotation, so that we can send raw data
	{
		repo.save(alien);
		return alien;
	}

	@GetMapping(path="/aliens") // changed RequestMapping to GetMapping for ease of reading code
	public List<Alien> getAliens()
	{
		return repo.findAll();
		
		
	}

	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid);
		
		
	}
}

/*
 * whenever we send data from a server to a client, that means that server is producing, that means produce
 * when a server is accepting from a client, then that means consumes
*/