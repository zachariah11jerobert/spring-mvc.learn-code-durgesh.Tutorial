package com.jerome.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/*
	 * Notes Model is passed as function parameter with page name as string
	 * ModelAndView doesn't have parameters for function
	 */

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");

		model.addAttribute("name", "Ankit Kumar Joshi");
		model.addAttribute("id", 1421);

		List<String> friends = new ArrayList<String>();
		friends.add("Vandan");
		friends.add("Roshni");
		friends.add("ABC");

		model.addAttribute("friends", friends);

		return "index";

	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";

	}

	@RequestMapping("/help")
	public ModelAndView help() {

		System.out.println("this is help controller");

		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();

		// setting the data
		modelAndView.addObject("name", "Uttam Shukla");
		modelAndView.addObject("rollnumber", 123414);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);

		// setting the view name
		modelAndView.setViewName("help");

		return modelAndView;

	}

	@RequestMapping("/help-jstl")
	public ModelAndView helJSTL() {

		System.out.println("this is help controller");

		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();

		// setting the data
		modelAndView.addObject("name", "Uttam Shukla");
		modelAndView.addObject("rollnumber", 123414);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);

		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(3434);
		list.add(2134);
		list.add(2345);

		modelAndView.addObject("marks", list);

		// setting the view name
		modelAndView.setViewName("help_jstl");

		return modelAndView;

	}
}
