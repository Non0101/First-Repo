package com.zufangwang.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zufangwang.entity.House;
import com.zufangwang.entity.Order;
import com.zufangwang.entity.User;
import com.zufangwang.service.OrderService;
import com.zufangwang.service.UserService;
import com.zufangwang.serviceimpl.OrderServiceImpl;
import com.zufangwang.serviceimpl.UserServiceImpl;

public class AdminAction  extends ActionSupport{
	private int order_id;  
	private int user_id;
	
 public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	//管理员查看所有订单信息
	OrderService ods=new OrderServiceImpl();
	UserService us = new UserServiceImpl();
	public String queryAllOrdersAction(){
	 List<Order> allorder = new ArrayList<Order>();
	 allorder=ods.queryAll();
	 ActionUtil.setSessionAttribute("allOrders",allorder);
	 return "queryallorder";
 }
//管理员删除单个订单信息
	public String deleteOrderAction(){
		ods.cancel(order_id);
		return "deleteoneorder";
	}
//管理员查看所有用户信息
public String QueryAllUsersAction(){
	List<User> allUsers = new ArrayList<User>();
	allUsers=us.queryAll();
	ActionUtil.setSessionAttribute("allUsers",allUsers);
	return "queryalluser";
}
//管理员删除单个用户信息
public String DeleteUserAction(){
	us.cancel(user_id);
	System.out.println("删除用户id为"+user_id);
	return "deleteoneuser";
}
}
