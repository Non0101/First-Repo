package com.zufangwang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.User;

public interface UserDao {
	//查询操作（登录）
	  public User selectone(@Param("email")String email,@Param("password")String password);
	//插入操作（注册）
	  public void insert(User user);
	//更改操作（更改个人信息）
	  public void update(@Param("id")int id,@Param("password")String password,@Param("phone")int phone,@Param("name")String name,@Param("category")String category);
    //注销操作（注销个人账号即Delete操作）
	  public void cancel(@Param("user_id")int user_id);
	//查询所有用户信息
	  public List<User> selectAll();
}
