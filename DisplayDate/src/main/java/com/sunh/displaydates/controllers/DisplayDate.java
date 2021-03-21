package com.sunh.displaydates.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDate {
	@RequestMapping("/") 
		public String main() {
			return "index.jsp";
		}
	@RequestMapping("/date")
		public String date(Model model) {
		model.addAttribute("date", new Date());
//		System.out.print("Saturday, the 22 of January, 2028");
			return "date.jsp";
		
	}
	@RequestMapping("/time")
		public String time(Model model) {
		model.addAttribute("time", new Date());
//		System.out.print("11:30 PM");
			return "time.jsp";
		
	}
}
