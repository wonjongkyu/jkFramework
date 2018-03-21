package jk.framework.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jk.framework.test.entity.TestEntity;
import jk.framework.test.mapper.TestMapper;

@Service
public class TestService {
	
	@Autowired
	TestMapper mapper;
	
	public List<TestEntity> findByBno(int bno){
		return mapper.findByBno(bno);
	}
	
	public List<TestEntity> findByBno2(int bno){
		return mapper.findByBno2(bno);
	}
	
	/**
	 * <pre>
	 * 1. 개요 : 
	 * 2. 처리내용 : 
	 * </pre>
	 * @Method Name : findAll
	 * @date : 2018. 3. 21.
	 * @author : Hyundai
	 * @history : 
	 *	-----------------------------------------------------------------------
	 *	변경일				작성자						변경내용  
	 *	----------- ------------------- ---------------------------------------
	 *	2018. 3. 21.		Hyundai				최초 작성 
	 *	-----------------------------------------------------------------------
	 * 
	 * @param bno
	 * @return
	 */ 	
	public List<TestEntity> findAll(int bno){
		return mapper.findByBno2(bno);
	}
	
	public List<TestEntity> save(int bno){
		return mapper.findByBno2(bno);
	}
	
	public List<TestEntity> findOne(int bno){
		return mapper.findByBno2(bno);
	}
	
	public List<TestEntity> delete(int bno){
		return mapper.findByBno2(bno);
	}
}
