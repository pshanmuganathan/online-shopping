package com.ps.shoppingwebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageContoller {

	
	@RequestMapping(value={"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","HomePage");
		mv.addObject("homepage",true);
		
		return mv;
		
	}
	
	@RequestMapping(value={"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About");
		mv.addObject("about",true);
		return mv;
		
	}
	
	@RequestMapping(value={"/contact"})
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact");
		mv.addObject("contact",true);
		return mv;
		
	}
}
