package com.niket.springWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niket.springWeb.service.OffersService;

@Controller
public class HomeController {
	
	private OffersService os;
	
	
	
	
	public OffersService getOs() {
		return os;
	}



	@Autowired
	public void setOs(OffersService os) {
		this.os = os;
	}




	@RequestMapping("/offers")
	public String getHome(ModelMap mv){
		System.out.println("hello world"+mv.size());
		
		mv.addAttribute("offers", os.getAllOffers());
		return "offers";
		
	}

}
