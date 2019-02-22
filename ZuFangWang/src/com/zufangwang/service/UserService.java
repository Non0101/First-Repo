package com.zufangwang.service;

import java.util.List;

import com.zufangwang.entity.User;

public interface UserService {
	//登录
	public User login(String email, String password);
    //注册
	public void register(User user);
    //更改信息
	public void update(int id ,String password, int phone , String name,String category);
	//注销账户
	public void cancel( int id);
	//查询所有用户
	public List<User> queryAll();
}
