package com.leo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler
	public ModelAndView exception(Exception ex){
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error");
		mv.addObject("message", ex.getMessage());
		
		return mv;
	}
}
