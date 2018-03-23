package jk.framework.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jk.framework.test.entity.TestEntity;
import jk.framework.test.service.TestService;

@Controller
public class TestController {
	
	// properties test
    @Value("${server.ip}")
    private String serverIp ;
    
    @Value("${mybatis.mapper-locations}")
    private String location;
    
	@Autowired
	TestService testService;
	
	/* Test Code */
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "home.test";
	}
	
	@RequestMapping("/propTest")
	public String test(Model model) {
		model.addAttribute("test", location);
		return "propTest";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		model.addAttribute("test", serverIp);
		return "/dashboard/dashboard";
	}
	
	@GetMapping("/test/readTest")
	public ModelAndView readTest() {
		List<TestEntity> testList = testService.findByBno(1);
		ModelAndView nextPage = new ModelAndView("/test/readTest");
		nextPage.addObject("testList", testList);
		return nextPage;
	}
	/* Test Code */
	
	@GetMapping("/list")
	@ResponseBody
	public List<TestEntity> list() {
		List<TestEntity> list = testService.findAll();
		return list;
	}
 
}
