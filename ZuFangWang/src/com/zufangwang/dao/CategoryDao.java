package com.zufangwang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.House;

public interface CategoryDao {
//通过房间数分类查询
 public List<House> selectByroomnumber(@Param("roomnumber")int roomnumber);	
 public List<House> selectByroomnumber2(@Param("roomnumber")int roomnumber);	
//通过类别查询
	public List<House> selectByCategory(@Param("category_id")int category_id);
//通过价格区间查询
public List<House> selectByPrice(@Param("startPrice")int startPrice,@Param("endPrice")int endPrice);
}
