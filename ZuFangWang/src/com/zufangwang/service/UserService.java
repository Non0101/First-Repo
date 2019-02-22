package com.zufangwang.service;

import java.util.List;

import com.zufangwang.entity.User;

public interface UserService {
	//��¼
	public User login(String email, String password);
    //ע��
	public void register(User user);
    //������Ϣ
	public void update(int id ,String password, int phone , String name,String category);
	//ע���˻�
	public void cancel( int id);
	//��ѯ�����û�
	public List<User> queryAll();
}
