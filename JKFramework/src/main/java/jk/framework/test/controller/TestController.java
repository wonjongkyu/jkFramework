package jk.framework.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "home.test";
	}
	
	@RequestMapping("/test")
	public String test(Model model) {
		model.addAttribute("test", "test입니다.");
		return "test";
	}
 
}
