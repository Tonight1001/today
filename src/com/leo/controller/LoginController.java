package com.leo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(HttpServletRequest request) throws Exception{
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String checkLogin(@RequestParam("account") String userName, @RequestParam String password) throws Exception{
		//String userName = request.getParameter("userName");
		
		System.out.println(userName + "--" + password);
		return "admin";
	}
	
	@RequestMapping("/login2")
	public ModelAndView login2(HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		mv.addObject("userName", "小明");
		
		return mv;
	}
	
	/*@ExceptionHandler
	public ModelAndView exception(Exception ex){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error");
		mv.addObject("message", ex.getMessage());
		
		return mv;
	}*/
	
	//精确匹配
	
	@RequestMapping("/test/a")
	public String testa(HttpServletRequest request) throws Exception{
		return "login";
	}
	
	
	
}
