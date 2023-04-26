//3.  created by new java class > name: home controller

package com.telusko.demo;

import org.springframework.stereotype.Controller; // this package gets imported, when we add @controller annotation
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 4. adding this annotation, because of this link request gets accepted
public class HomeController
{
	@RequestMapping("home") // 5. this handles the request for home; whenever we get the request for home, we want to handle through below method
	public String home()
	{
		System.out.println("hi"); // 6. we require a server as well,but spring framwework has embedded tomcat server in it
		return "home.jsp"; 
	}
}

// 7. we got hi, then that means controller is handling our request
// 7.1 : we need to create something that accepts the request, which is accepted by the annotation: @RequestMapping("home")
// 7.2 : send the response, which is sent by : return home.jsp line => but just this will simply download the .jsp webpage
// 7.3 : So, we need to add tomcat-jasper dependency in pom.xml file from tomcat-jasper page, and for checking which version to add, check for version of tomcat in maven dependencies > after this, our .jsp output will be there on webpage