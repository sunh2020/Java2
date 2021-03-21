package com.sunh.lookify;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunh.lookify.models.Lookify;
import com.sunh.lookify.services.LookifyService;

@Controller
public class LookifyController {
	private final LookifyService lookifyService;
    public LookifyController(LookifyService lookifyService){
        this.lookifyService = lookifyService;
    }
    @RequestMapping("/") 
	public String main() {
		return "index.jsp";
	}
    
    @RequestMapping("/dashboard")
    public String index(Model model, @ModelAttribute("language") Lookify newl) {
        List<Lookify> lookify = lookifyService.allLookify();
        model.addAttribute("lookify", lookify);
        return "result.jsp";
}
}
