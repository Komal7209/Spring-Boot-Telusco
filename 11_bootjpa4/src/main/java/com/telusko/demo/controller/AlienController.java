package com.telusko.demo.controller;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

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

	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
	}
	@RequestMapping("/aliens")
	@ResponseBody
	public List<Alien> getAliens()
	{
		return repo.findAll(); // 3. remove toString and change return type to List as now we are using JPARepository rather than CrudRepository
								// 4. in maven dependencies, we have dependency called jackson which converts java object to json, thus this list would be converted to json and displayed as json
		
	}
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid")int aid)
	{
		return repo.findById(aid); // 2. remove toString and make return type as Optional<Alien> , so that it works
		
		
	}
}
