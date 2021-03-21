package com.sunh.thecode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {
	@RequestMapping("/") 
	public String main() {
		return "index.jsp";
	}
	@RequestMapping(value="/submit", method=RequestMethod.POST)
	public String submitResult(@RequestParam(value="boss") String boss, RedirectAttributes errormsg) {
		if (boss.equals("bushido")) {
			return "success.jsp";
		} else {
			errormsg.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";

	}
}
}