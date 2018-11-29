package com.leo.controller.system;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //==@Controller + @ResponseBody
@RequestMapping(value="/system")
public class ModuleController2 {

	@RequestMapping(value="/module2", method=RequestMethod.GET)
	public Map<String,Object> delModule(int moduleId) throws Exception{
		Map<String,Object> rs = new HashMap<String, Object>();
		rs.put("msg", "OK");
		rs.put("moduleId", moduleId);
		System.out.println("moduleId----" + moduleId);
		return rs;
	}
}
