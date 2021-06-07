package controller;


import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	@RequestMapping(value = "/About", method = RequestMethod.GET)
	public String about() {
		return "about";
	}
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String adminPage(Model model, Principal principal) {
         
        return "indexAdmin";
    }

	
	
}
