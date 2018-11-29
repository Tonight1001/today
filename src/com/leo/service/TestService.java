package com.leo.service;

import java.util.List;

import com.leo.po.TestVo;

public interface TestService {
	public void add(TestVo tv);

	public boolean del(int id);
	
	public TestVo get(int id);
	
	public boolean update(TestVo tv);
	
	public List<TestVo> search(TestVo tv);
	
}
