package jk.framework.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.framework.test.entity.TestEntity;
import jk.framework.test.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	TestMapper testMapper;
	
	@Override
	public List<TestEntity> findByBno(int bno){
		return testMapper.findByBno(bno);
	}
	
	@Override
	public List<TestEntity> findByBno2(int bno){
		return testMapper.findByBno2(bno);
		
	}
}
