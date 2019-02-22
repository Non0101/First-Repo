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
	//����Ա�鿴���ж�����Ϣ
	OrderService ods=new OrderServiceImpl();
	UserService us = new UserServiceImpl();
	public String queryAllOrdersAction(){
	 List<Order> allorder = new ArrayList<Order>();
	 allorder=ods.queryAll();
	 ActionUtil.setSessionAttribute("allOrders",allorder);
	 return "queryallorder";
 }
//����Աɾ������������Ϣ
	public String deleteOrderAction(){
		ods.cancel(order_id);
		return "deleteoneorder";
	}
//����Ա�鿴�����û���Ϣ
public String QueryAllUsersAction(){
	List<User> allUsers = new ArrayList<User>();
	allUsers=us.queryAll();
	ActionUtil.setSessionAttribute("allUsers",allUsers);
	return "queryalluser";
}
//����Աɾ�������û���Ϣ
public String DeleteUserAction(){
	us.cancel(user_id);
	System.out.println("ɾ���û�idΪ"+user_id);
	return "deleteoneuser";
}
}
