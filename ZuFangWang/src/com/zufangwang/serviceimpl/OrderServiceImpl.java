package com.zufangwang.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.zufangwang.action.ActionUtil;
import com.zufangwang.dao.OrderDao;
import com.zufangwang.dao.UserDao;
import com.zufangwang.db.MyBatisUtil;
import com.zufangwang.entity.Order;
import com.zufangwang.service.OrderService;

public class OrderServiceImpl implements OrderService {
	private OrderDao orderDAO = (OrderDao) MyBatisUtil.getMapper(OrderDao.class);
	private UserDao userDAO = (UserDao) MyBatisUtil.getMapper(UserDao.class);
	Order order = new Order();
	List<Order> orderList = new ArrayList<Order>();
	@Override
	//�½�����ҵ��
	public void newOrder(Order order){
		try {
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			orderDAO.insert(order);
			MyBatisUtil.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	//��ѯ��������ҵ��
	public Order queryone(int order_id){
		try {
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			order=orderDAO.selectone(order_id);
			return order;
		} catch (Exception e) {
			e.printStackTrace();
			return order;
		} 
	}
	@Override
	// ��Ͳ鿴���ж���
	public List<Order> queryzkOrders(int zuke_id){
		try {
	    	System.out.println("����orderserviceimpl try��selectone");
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			orderList=orderDAO.zkselect(zuke_id);
			return orderList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			MyBatisUtil.close();
		}
	}
  @Override
	// �����鿴���ж���
		public List<Order> queryfdOrders(int fangdong_id){
			try {
		    	System.out.println("����orderserviceimpl try�鷿�����ж���"+fangdong_id);
				SqlSession session = null;
				session = MyBatisUtil.getSqlSession();
				orderList=orderDAO.fdselect(fangdong_id);
				return orderList;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			} finally {
				MyBatisUtil.close();
			}
		}
	// ȡ������ҵ��
	@Override
	public void cancel(int order_id){
		try {
			System.out.println("���붩��service"+order_id);
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			System.out.println("orderservice��ɾ����order_id"+order_id);
			orderDAO.deleteOrder(order_id);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.commit();
			MyBatisUtil.close();
		}
	}
	//��ѯ���ж���
	@Override
	public List<Order> queryAll() {
		List<Order> allorders = new ArrayList<Order>();
		try {
			SqlSession session = MyBatisUtil.getSqlSession();
			allorders=orderDAO.selectall();
			return allorders;
		} catch (Exception e) {
			e.printStackTrace();
		 return null;
		} finally {
			MyBatisUtil.close();
		}
	}
}
