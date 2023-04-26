package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@RequestMapping("home")
	public ModelAndView home(Alien alien) // for passing multiple entries,we can directly pass object of that class 
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",alien);
		mv.setViewName("home");
		return mv;
	}
}


/*
public String home(HttpServletRequest req,HttpServletResponse res) 
{
 HttpSession session = req.getSession(); // this is for using http session, and we have created session object
		String name = req.getParameter("name"); // getting data from client
		System.out.println("hi" + name);
		session.setAttribute("name",name); // using present session, setting value to name variable which would be fetched from this session object
		return "home";
}  
*/

// webapp with spring ModelAndView

/*
Step 1 : trial for chekcing how by removing HttpServletRequest req, it works

 @Controller
public class HomeController
{
	@RequestMapping("home")
	public String home(String name, HttpSession session)
	{
		System.out.println("hi" + name);
		session.setAttribute("name",name); // using present session, setting value to name variable which would be fetched from this session object
		return "home";
	}
}
*/

/* Step 2: If I change name variable, then we need to pass @RequestParam() annotation
	
	// client requires 2 things: data and view
	// so in springframework we have data as model , view as view


 @Controller
public class HomeController
{
	@RequestMapping("home") 
	public String home(@RequestParam("myName") String name, HttpSession session) // now myName will get value from session and would be assigned to variable name
	{
		System.out.println("hi" + name);
		session.setAttribute("name",name); // here name is the data
		return "home"; // home is the view
	}
}

*/

/* Step 3: using ModelAndView annotation
	
	// client requires 2 things: data and view
	// so in springframework we have data as model , view as view


 @Controller
public class HomeController
{
	@RequestMapping("home") 
	public ModelAndView home(@RequestParam("name") String myName) 
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("home")
		return mv ; // home is the view
	}
}

*/

// 4. to create a class Alien