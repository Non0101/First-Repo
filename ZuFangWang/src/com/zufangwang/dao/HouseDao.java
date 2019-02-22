package com.zufangwang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.House;

public interface HouseDao {
	// 查询操作（单个房屋详情）
	public House selectone(@Param("house_id") int house_id);
	//查询最新发布房屋
	public List<House> newest();
	//查询房东名下所有房屋
	public List<House>querymyhouses(@Param("user_id")int user_id); 
    //删除单个房屋
	public void cancel(int house_id);
	//获取当前创建的房屋id
	public int getfid();
	//发布新房屋
	public void insert(House house);
	//图片名插入 
	public void insertpath(@Param("path")String path,@Param("house_id")int house_id);
	//查询当前房屋房东id
	public int selectfangdongid(int house_id);
	//更改当前房屋状态为已预订
	public void updateHouseState(int house_id);
	//更改当前房屋状态为可预订（保留功能）
	
}
