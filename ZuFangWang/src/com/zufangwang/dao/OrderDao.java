package com.zufangwang.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zufangwang.entity.Order;

public interface OrderDao {
	//插入操作（新建订单）
	  public void insert(Order order);
	//查询单条订单
	  public Order selectone(@Param("order_id")int order_id);
	//查询所有订单
	  public List<Order> selectall();
	//查询操作（租客查看所有订单）
	  public List<Order> zkselect(@Param("zuke_id")int zuke_id);
	//查询操作（房东查看所有订单）
	  public List<Order> fdselect(@Param("fangdong_id")int fangdong_id);
    //注销操作（删除订单）
	  public void deleteOrder(@Param("order_id")int order_id);
}
