package com.zufangwang.dao;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.User;

public interface adminDao {
	  public User selectone(@Param("email")String email,@Param("password")String password);
	  public void update(@Param("house_id") int house_id,@Param("house_state") String house_state);
}
