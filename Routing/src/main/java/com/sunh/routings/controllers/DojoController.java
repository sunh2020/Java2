package com.sunh.routings.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{newbee}")
	public String dojo(@PathVariable ("newbee") String newbee) {
		String output = "";
		
		if (newbee.equals("burbank-dojo")) {
			output = "The Burbank Dojo is located in Southern California";
		} else if (newbee.equals("sanjose-dojo")) {
			output = "The SJ Dojo is the headquarters";
		} else {
			output = newbee + " is awesome";
		}
	    return output;
	}
}