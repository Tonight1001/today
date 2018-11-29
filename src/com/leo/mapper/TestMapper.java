package com.leo.mapper;

import java.util.List;

import com.leo.po.TestVo;

public interface TestMapper {
	public void add(TestVo tv);

	public int del(int id);
	
	public TestVo get(int id);
	
	public int update(TestVo tv);
	
	public List<TestVo> search(TestVo tv);
}
