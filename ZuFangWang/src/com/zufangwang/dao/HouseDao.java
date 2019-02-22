package com.zufangwang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.House;

public interface HouseDao {
	// ��ѯ�����������������飩
	public House selectone(@Param("house_id") int house_id);
	//��ѯ���·�������
	public List<House> newest();
	//��ѯ�����������з���
	public List<House>querymyhouses(@Param("user_id")int user_id); 
    //ɾ����������
	public void cancel(int house_id);
	//��ȡ��ǰ�����ķ���id
	public int getfid();
	//�����·���
	public void insert(House house);
	//ͼƬ������ 
	public void insertpath(@Param("path")String path,@Param("house_id")int house_id);
	//��ѯ��ǰ���ݷ���id
	public int selectfangdongid(int house_id);
	//���ĵ�ǰ����״̬Ϊ��Ԥ��
	public void updateHouseState(int house_id);
	//���ĵ�ǰ����״̬Ϊ��Ԥ�����������ܣ�
	
}
