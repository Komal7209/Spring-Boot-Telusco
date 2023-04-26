// below example is using servlet

package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	@RequestMapping("home")
	public String home(HttpServletRequest req,HttpServletResponse res) // because of req n res , we will be able to accept n send data
	{
		HttpSession session = req.getSession(); // this is for using http session, and we have created session object
		String name = req.getParameter("name"); // getting data from client
		System.out.println("hi" + name);
		session.setAttribute("name",name); // using present session, setting value to name variable which would be fetched from this session object
		return "home";
	}
}
