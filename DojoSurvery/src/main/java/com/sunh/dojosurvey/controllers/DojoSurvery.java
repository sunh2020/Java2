package com.sunh.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurvery {
	@RequestMapping("/")
		public String index() {
			return "index.jsp";
	}
	
	@RequestMapping(path="/result", method=RequestMethod.POST)
	public String result(@RequestParam(value="yourName") String yourName, @RequestParam(value="location") String location, @RequestParam(value="fav") String fav, @RequestParam(value="comment") String comment, HttpSession sesh) {
		sesh.setAttribute("yourName", yourName);
		sesh.setAttribute("location", location);
		sesh.setAttribute("fav", fav);
		sesh.setAttribute("comment", comment);
		return "result.jsp";
	}
}
