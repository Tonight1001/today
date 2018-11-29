package com.leo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.mapper.TestMapper;
import com.leo.po.TestVo;
import com.leo.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestMapper testMapper;
	
	@Override
	public void add(TestVo tv) {
		
		testMapper.add(tv);
		
	}

	@Override
	public List<TestVo> search(TestVo tv) {
		
		return testMapper.search(tv);
	}

	@Override
	public boolean del(int id) {
		
		return testMapper.del(id) > 0;
	}

	@Override
	public TestVo get(int id) {
		return testMapper.get(id);
	}

	@Override
	public boolean update(TestVo tv) {
		return testMapper.update(tv) > 0;
	}

}
