package com.leo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.mapper.ModuleMapper;
import com.leo.po.system.ModuleVo;
import com.leo.service.ModuleService;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleMapper moduleMapper;
	
	@Override
	public boolean addModule(ModuleVo mv) throws Exception {
		
		return moduleMapper.addModule(mv) > 0;
	}

}
