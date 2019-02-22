package com.zufangwang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.User;

public interface UserDao {
	//��ѯ��������¼��
	  public User selectone(@Param("email")String email,@Param("password")String password);
	//���������ע�ᣩ
	  public void insert(User user);
	//���Ĳ��������ĸ�����Ϣ��
	  public void update(@Param("id")int id,@Param("password")String password,@Param("phone")int phone,@Param("name")String name,@Param("category")String category);
    //ע��������ע�������˺ż�Delete������
	  public void cancel(@Param("user_id")int user_id);
	//��ѯ�����û���Ϣ
	  public List<User> selectAll();
}
