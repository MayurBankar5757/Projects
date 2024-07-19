package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")

	public String home(Model model) {
		model.addAttribute("name", "John");
		model.addAttribute("age", 23);
		model.addAttribute("city", "pune");
		
		 List <String> courses = new ArrayList <String>(); 
		 courses.add("Java");
		 courses.add("c");
		 courses.add("c++"); 
		 courses.add("python");
		 
		  model.addAttribute("courses",courses); 
		  return "home";
		
	}

	@RequestMapping("/help")

	public String help() {
		return "help";
	}

	// using another data adding approach
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView m = new ModelAndView();
		m.addObject("Salary", 20000);
		m.addObject("marks", 90);
		m.setViewName("about");
		return m;

	}
}
