package com.sunh.ninjagold.controllers;

import javax.servlet.http.HttpSession;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGold {
	@RequestMapping("/Gold") 
	public String main(HttpSession session) {
		return "Gold.jsp";
	}
	@RequestMapping(value="/submit", method=RequestMethod.POST) 
	public String sessCount(@RequestParam(value="which_button") String which_button, HttpSession sesh, Model model){
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	        Integer count = (Integer) sesh.getAttribute("gold");
	        String farm = "farm";
	        String cave = "cave";
	        String house = "house";
	        String casino = "casino";
	            if (count == null) {
	        	sesh.setAttribute("gold", 0);
	        	count = 0;
	        	return "redirect:/Gold";
	        }
	        if (which_button.equals(farm)) {
	        	Integer min = 10;
	        	Integer max = 20;
	        	Integer random = (int)(Math.random() * (max-min+1) + min);
	        	count += random;
	        	sesh.setAttribute("gold", count);
	        	model.addAttribute("gold", count);
//	        	ArrayList<String> activities = (ArrayList<String>) sesh.getAttribute("activities");
//	        	activities.add(0, "You entered the farm and earned "+count+" gold. ("+timeStamp+")");
	        	System.out.println(count);
	        	return "redirect:/Gold";
	        }
	        if (which_button.equals(cave)) {
	        	Integer min = 5;
	        	Integer max = 10;
	        	Integer random = (int)(Math.random() * (max-min+1) + min);
	        	count += random;
	        	sesh.setAttribute("gold", count);
	        	model.addAttribute("gold", count);
//	        	ArrayList<String> activities = (ArrayList<String>) sesh.getAttribute("activities");
//	        	activities.add(0, "You entered the cave and earned "+count+" gold. ("+timeStamp+")");
	        	System.out.println(count);
	        	return "redirect:/Gold";
	        }
	        if (which_button.equals(house)) {
	        	Integer min = 2;
	        	Integer max = 5;
	        	Integer random = (int)(Math.random() * (max-min+1) + min);
	        	count += random;
	        	sesh.setAttribute("gold", count);
	        	model.addAttribute("gold", count);
//	        	ArrayList<String> activities = (ArrayList<String>) sesh.getAttribute("activities");
//	        	activities.add(0, "You entered the house and earned "+count+" gold. ("+timeStamp+")");
	        	System.out.println(count);
	        	return "redirect:/Gold";
	        }
	        if (which_button.equals(casino)) {
	        	Integer min = 0;
	        	Integer max = 50;
	        	Integer random = (int)(Math.random() * (max-min+1) + min);
	        	count += random;
	        	sesh.setAttribute("gold", count);
	        	model.addAttribute("gold", count);
//	        	ArrayList<String> activities = (ArrayList<String>) sesh.getAttribute("activities");
//	        	activities.add(0, "You entered the casino and earned "+count+" gold. ("+timeStamp+")");
	        	System.out.println(count);
	        	return "redirect:/Gold";
	        }
	        return "Gold.jsp";
	}
	   	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.removeAttribute("gold");
		return "redirect:/Gold";
	}
}