package com.zufangwang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.House;

public interface CategoryDao {
//ͨ�������������ѯ
 public List<House> selectByroomnumber(@Param("roomnumber")int roomnumber);	
 public List<House> selectByroomnumber2(@Param("roomnumber")int roomnumber);	
//ͨ������ѯ
	public List<House> selectByCategory(@Param("category_id")int category_id);
//ͨ���۸������ѯ
public List<House> selectByPrice(@Param("startPrice")int startPrice,@Param("endPrice")int endPrice);
}
