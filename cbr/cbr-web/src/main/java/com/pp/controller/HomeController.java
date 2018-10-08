package com.pp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value = { "", "/page", "page*", "view/*,**/msg" })
	public String showPage() {
		return "home";
		
		
	}
}
