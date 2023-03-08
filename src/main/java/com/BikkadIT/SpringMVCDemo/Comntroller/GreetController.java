package com.BikkadIT.SpringMVCDemo.Comntroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class GreetController {

	@GetMapping("/Greet")
	public String greetMsg(Model model) {
		
		
		String grtMsg="Wellcome To BikkadIT Pune";
		model.addAttribute("GREETMESSAGE", grtMsg);
		
		return "greet";
		
	}

}
