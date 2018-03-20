package jk.framework.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import jk.framework.test.entity.TestEntity;

@Mapper
public interface TestMapper {
	
	@Select("SELECT * FROM board WHERE bno = #{bno}")
	public List<TestEntity> findByBno(@Param("bno") int bno); 
	
	public List<TestEntity> findByBno2(int bno); 
}
