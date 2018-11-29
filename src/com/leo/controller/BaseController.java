package com.leo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class BaseController {
	@RequestMapping("*")
	public String base404(HttpServletRequest request) throws Exception{
		return "404";
	}
	
	/**
	 * RestFul风格，请求jsp页面
	 * @param module
	 * @param view
	 * @return
	 */
	@RequestMapping("/{module}/{view}")
	public String forward(@PathVariable("module") String module,@PathVariable("view") String view){
		
		return "/" + module + "/" + view;
	}
}
