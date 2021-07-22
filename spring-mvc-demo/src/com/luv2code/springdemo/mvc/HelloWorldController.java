package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	// need a controller method to show the initial html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		// spring adds prefix and suffix
	}
	
	// need a controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// add a new controller method to read form data and add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShopDude(HttpServletRequest r, Model m) {
		// read request param from html form
		String theName = r.getParameter("studentName");
		
		// convert data to upper case
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Yo " + theName;
		
		// update model with this message
		m.addAttribute("message", result);
		
		return "helloworld";
	}
	
	// add a new controller method to read form data and add data to model
		@RequestMapping("/processFormVersionThree")
		public String letsShopDude(@RequestParam("studentName") String theName, Model m) {
			
			// convert data to upper case
			theName = theName.toUpperCase();
			
			// create the message
			String result = "Yo " + theName;
			
			// update model with this message
			m.addAttribute("message", result);
			
			return "helloworld";
		}
}
