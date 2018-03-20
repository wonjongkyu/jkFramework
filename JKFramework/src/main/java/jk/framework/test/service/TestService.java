package jk.framework.test.service;

import java.util.List;

import jk.framework.test.entity.TestEntity;

public interface TestService {
	
	public List<TestEntity> findByBno(int bno); 
	public List<TestEntity> findByBno2(int bno); 
}
