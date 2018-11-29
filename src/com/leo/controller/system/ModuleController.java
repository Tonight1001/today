package com.leo.controller.system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.leo.po.DataTablesVo;
import com.leo.po.system.ModuleVo;
import com.leo.service.ModuleService;

@Controller
@RequestMapping(value="/system")
public class ModuleController {

	@Autowired
	private ModuleService moduleService;
	
	@ResponseBody
	@RequestMapping(value="/module",method=RequestMethod.GET)
	public DataTablesVo<ModuleVo> moduleList() throws Exception{
		List<ModuleVo> mvList = new ArrayList<ModuleVo>();
		ModuleVo mv = new ModuleVo();
		mv.setModuleId(1);
		mv.setModuleName("系统管理模块");
		
		ModuleVo mv2 = new ModuleVo();
		mv2.setModuleId(2);
		mv2.setModuleName("学生管理模块");
		
		mvList.add(mv);
		mvList.add(mv2);
		
		DataTablesVo<ModuleVo> dtv = new DataTablesVo<ModuleVo>();
		dtv.setData(mvList);
		dtv.setRecordsTotal(2L);
		
		//String jsonStr = JSONObject.fromObject(dtv).toString();
		
		return dtv;
	}
	
	//Restful: URL用来定位资源
	@ResponseBody
	@RequestMapping(value="/module", method=RequestMethod.DELETE)
	public Map<String,Object> delModule(int moduleId) throws Exception{
		
		Map<String,Object> rs = new HashMap<String, Object>();
		rs.put("msg", "删除OK");
		rs.put("moduleId", moduleId);
		System.out.println("moduleId----" + moduleId);
		return rs;
	}
	
	
	@ResponseBody
	@RequestMapping(value="/module", method=RequestMethod.POST)
	public Map<String,Object> addModule(ModuleVo mv) throws Exception{
		System.out.println("moduleName----" + mv.getModuleName());
		System.out.println("moduleDesc----" + mv.getModuleDesc());
		
		boolean flag = moduleService.addModule(mv);
		String rsMsg = flag ? "增加成功" : "增加失败";
		
		Map<String,Object> rs = new HashMap<String, Object>();
		rs.put("msg", rsMsg);
		return rs;
	}
}
