package com.zufangwang.service;

import java.util.List;

import com.zufangwang.entity.House;
import com.zufangwang.entity.User;

public interface adminService {
	//管理员查询所有用户信息
	public List chaxun(String email);
	//管理员审核房屋
	public House shenhe(String house_id);
}
