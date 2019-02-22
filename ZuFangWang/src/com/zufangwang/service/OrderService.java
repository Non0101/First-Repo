package com.zufangwang.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.Order;
import com.zufangwang.entity.User;

public interface OrderService {
    //�½�order
	public void newOrder(Order order);
    //��ѯ��������
	public Order queryone(int order_id);
	//��ѯ���ж���
	public List<Order> queryAll();
	//��ѯorders����ͣ�
	public List<Order> queryzkOrders(int zuke_id);
	//��ѯorders(����)
    public List<Order> queryfdOrders(int fangdong_id);
	//ɾ��order
	public void cancel(int order_id);

}
