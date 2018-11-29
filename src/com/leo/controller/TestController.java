package com.leo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.leo.po.TestVo;
import com.leo.service.TestService;

@Controller
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("/test")
	public String test() throws Exception{
		
		
		return "test";
	}
	
	@RequestMapping("/add")
	public ModelAndView add(TestVo tv) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		
		testService.add(tv);
		
		mv.addObject("info", "数据保存成功");
		
		return mv;
	}
	
	@RequestMapping("/search")
	public ModelAndView search(TestVo tv) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		
		List<TestVo> tvList = testService.search(tv);
		
		mv.addObject("tvList", tvList);
		
		return mv;
	}
	
	@RequestMapping("/del")
	public ModelAndView del(int id) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		
		boolean rs = testService.del(id);
		
		if(rs){
			mv.addObject("result", "删除成功");
		} else {
			mv.addObject("result", "删除失败");
		}
		
		return mv;
	}
	
	@RequestMapping("/get")
	public ModelAndView get(int id) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		
		TestVo tv = testService.get(id);
		
		mv.addObject("tv", tv);
		
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView update(TestVo tv) throws Exception{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("test");
		
		boolean rs = testService.update(tv);
		
		if(rs){
			mv.addObject("updateInfo", "修改成功");
		}else{
			mv.addObject("updateInfo", "修改失败");
		}
		
		
		return mv;
	}
}
