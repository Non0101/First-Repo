package com.zufangwang.service;

import java.util.List;

import com.zufangwang.entity.House;
import com.zufangwang.entity.User;

public interface adminService {
	//����Ա��ѯ�����û���Ϣ
	public List chaxun(String email);
	//����Ա��˷���
	public House shenhe(String house_id);
}
