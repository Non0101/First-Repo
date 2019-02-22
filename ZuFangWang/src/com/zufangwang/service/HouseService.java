package com.zufangwang.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.House;

public interface HouseService {
	//发布新房屋
	public void publishNew(House house,List<String> path);
	//查看房屋详情
	public House xiangqing(int house_id);
	//查询最新发布6个房屋
    public List<House>zuixin();
	 //查询房东名下所有房屋
    public List<House>queryMyHouse(int user_id);
	//更改房屋属性为已预订
	  public void updateHouseState(int house_id);
    //删除单个房屋
	public void cancel(int house_id);
    //查询当前房屋房东id
    public int fangdongid(int house_id);
	 
}
