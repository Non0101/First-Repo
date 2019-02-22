package com.zufangwang.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.Order;
import com.zufangwang.entity.User;

public interface OrderService {
    //新建order
	public void newOrder(Order order);
    //查询单个订单
	public Order queryone(int order_id);
	//查询所有订单
	public List<Order> queryAll();
	//查询orders（租客）
	public List<Order> queryzkOrders(int zuke_id);
	//查询orders(房东)
    public List<Order> queryfdOrders(int fangdong_id);
	//删除order
	public void cancel(int order_id);

}
