package com.zufangwang.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.House;

public interface HouseService {
	//�����·���
	public void publishNew(House house,List<String> path);
	//�鿴��������
	public House xiangqing(int house_id);
	//��ѯ���·���6������
    public List<House>zuixin();
	 //��ѯ�����������з���
    public List<House>queryMyHouse(int user_id);
	//���ķ�������Ϊ��Ԥ��
	  public void updateHouseState(int house_id);
    //ɾ����������
	public void cancel(int house_id);
    //��ѯ��ǰ���ݷ���id
    public int fangdongid(int house_id);
	 
}
