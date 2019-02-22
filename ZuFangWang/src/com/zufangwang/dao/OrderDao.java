package com.zufangwang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.Order;

public interface OrderDao {
	//����������½�������
	  public void insert(Order order);
	//��ѯ��������
	  public Order selectone(@Param("order_id")int order_id);
	//��ѯ���ж���
	  public List<Order> selectall();
	//��ѯ��������Ͳ鿴���ж�����
	  public List<Order> zkselect(@Param("zuke_id")int zuke_id);
	//��ѯ�����������鿴���ж�����
	  public List<Order> fdselect(@Param("fangdong_id")int fangdong_id);
    //ע��������ɾ��������
	  public void deleteOrder(@Param("order_id")int order_id);
}
