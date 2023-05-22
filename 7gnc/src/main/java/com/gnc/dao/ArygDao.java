package com.gnc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.gnc.dto.ArygDto;
import com.gnc.dto.Criteria2;

@Mapper
public interface ArygDao {
	public List<ArygDto> arygList(@Param("year")String year);
	
	public List<String> arygListDao(Criteria2 cri);
	
	public List<String> arygSearchListDao(@Param("year")String year,@Param("pageStart")int start,@Param("perPageNum")int perPageNum);
	
	
	public int getSearchCount (@Param("year")String year);
	
	public Integer avgSearchDao(@Param("year")String year);
	
	public List<String> arygSearchListDao2(@Param("year")String year
			,@Param("pageStart")int start,@Param("perPageNum")int perPageNum
			,@Param("age")String age,@Param("gender")String gender
			,@Param("address")String address,@Param("order")String order);
	
	public int getSearchCount2(@Param("year")String year,@Param("age")String age,@Param("gender")String gender
			,@Param("address")String address);
	
	public Integer avgSearchDao2(@Param("year")String year,@Param("age")String age,@Param("gender")String gender
			,@Param("address")String address);
}
