package com.sunh.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	@RequestMapping("/") 
	public String main(HttpSession session) {
		session.setAttribute("count", 0);
		return "index.jsp";
	}
	@RequestMapping("/counter") 
	public String sessCount(HttpSession session){
	        Integer count = (Integer) session.getAttribute("count");
	        count++;
	        session.setAttribute("count", count);
	        System.out.println(count);
	        return "counter.jsp";
	}
}