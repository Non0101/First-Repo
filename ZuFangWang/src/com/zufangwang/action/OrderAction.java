package com.zufangwang.action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zufangwang.entity.House;
import com.zufangwang.entity.Order;
import com.zufangwang.entity.User;
import com.zufangwang.service.HouseService;
import com.zufangwang.service.OrderService;
import com.zufangwang.serviceimpl.HouseServiceImpl;
import com.zufangwang.serviceimpl.OrderServiceImpl;

public class OrderAction extends ActionSupport {
	private int order_id; // ��������
	private House house;
	private User user;
	private int house_id; // ���ݱ��
	private int myorder_id; // �������
	private Date intime; // ��סʱ��
	private Date outtime; // �˷�ʱ��
	private int live_days; // ��ס����
	private int total_money; // �ܼ�
	private String order_state; // ����״̬
	private Date order_time; // ��������ʱ��
	Order order = new Order();
	OrderService od = new OrderServiceImpl();
	List<Order> orderList = new ArrayList<Order>();
	HouseService hos = new HouseServiceImpl();

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getMyorder_id() {
		return myorder_id;
	}

	public void setMyorder_id(int myorder_id) {
		this.myorder_id = myorder_id;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public int getHouse_id() {
		return house_id;
	}

	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}

	public Date getIntime() {
		return intime;
	}

	public void setIntime(Date intime) {
		this.intime = intime;
	}

	public Date getOuttime() {
		return outtime;
	}

	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}

	public int getLive_days() {
		return live_days;
	}

	public void setLive_days(int live_days) {
		this.live_days = live_days;
	}

	public int getTotal_money() {
		return total_money;
	}

	public void setTotal_money(int total_money) {
		this.total_money = total_money;
	}

	public String getOrder_state() {
		return order_state;
	}

	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}

	public Date getOrder_time() {
		return order_time;
	}

	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}

	// �������޷��ݵ�����
	public static int orderDays(Date beginDate, Date endDate)
			throws ParseException {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		beginDate = sd.parse(sd.format(beginDate));
		endDate = sd.parse(sd.format(endDate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(beginDate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(endDate);
		long time2 = cal.getTimeInMillis();
		long orderDays = (time2 - time1) / (1000 * 3600 * 24); // �ɺ��뻻�����
		return Integer.parseInt(String.valueOf(orderDays));
	}

	// �����¶���
	public String createOrderAction() throws Exception {
		try {
			System.out.println("���봴���¶���Action");
			House house = (House) ActionUtil.getSessionAttribute("house");
			System.out.println("house-------------------" + house);
			order.setHouse_id(house.getHouse_id());
			// ��������ʱ�䣨�죩
			System.out.println("house.getHouse_id()" + house.getHouse_id());
			int orderDays = orderDays(intime, outtime);
			order.setLive_days(orderDays);
		// ����ס���˷�ʱ�䡢�ܼ۷���session�У���������order_infoҳ�����
			ActionUtil.setSessionAttribute("in_time", intime);
			ActionUtil.setSessionAttribute("out_time", outtime);
			ActionUtil.setSessionAttribute("liveDays", orderDays);
			// ת��UtilDateΪSqlDate ����������ݿ�
			java.sql.Date sintime = new java.sql.Date(intime.getTime());
			java.sql.Date souttime = new java.sql.Date(outtime.getTime());
			// ������סʱ����˷�ʱ��
			order.setIn_time(sintime);
			order.setOut_time(souttime);
			order.setOrder_state("δ֧��");
			// ����Ԥ������Ϊ��ǰ����
			Date uDate = new Date();
			java.sql.Date sDate = new java.sql.Date(uDate.getTime());
			order.setOrder_time(sDate);
			// ��ȡ��ǰ����id
			House nhouse = (House) ActionUtil.getSessionAttribute("house");
			System.out.println("orderAction��house_idΪ" + nhouse.getHouse_id());
			order.setHouse_id(nhouse.getHouse_id());
			// ��ȡ��ǰ������
			order.setHouse_name((String) ActionUtil
					.getSessionAttribute("fwname"));
			// ��ȡ��ǰ���ݵ���
			order.setPrice((Integer) ActionUtil.getSessionAttribute("danjia"));
			// ��ȡ��ǰ�û�id,��Ϊ���id
			order.setZuke_id((Integer) ActionUtil.getSessionAttribute("id"));
			System.out.println("orderAction���û�id"
					+ (Integer) ActionUtil.getSessionAttribute("id"));
			// ��ȡ����id
			// ͨ����ǰ����id��ѯ�˷��ݵķ���id
			HouseService hos = new HouseServiceImpl();
			int fdid = hos.fangdongid(nhouse.getHouse_id());
			System.out.println("orderAction�з���id" + fdid);
			order.setFangdong_id(fdid);
			od.newOrder(order);
			hos.updateHouseState(nhouse.getHouse_id());
			// �@�e���ܕ����e��
			return "insertorderok";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	// �鿴����������Ϣ
	public String orderInfoAction() {
		order = od.queryone(order_id);
		if (order != null) {
			return "orderinfook";
		} else {
			return "error";
		}
	}

	// �����鿴���ж���
	public String fdOrdersAction() {
		try {
			List<Order> fdorderList = new ArrayList<Order>();
			int a = (Integer) ActionUtil.getSessionAttribute("id");
			System.out.println("OrderAction   fangdongid"
					+ (Integer) ActionUtil.getSessionAttribute("id"));
			fdorderList = od.queryfdOrders(a);
			for (Order order : fdorderList) {
				int orderDays = orderDays(order.getIn_time(),order.getOut_time());
				order.setLive_days(orderDays);
				order.setTotal_money(orderDays*order.getPrice());
			}
			ActionUtil.setSessionAttribute("fdOrderList", fdorderList);
			return "fdorders";
		} catch (Exception e) {
			e.printStackTrace();
			return "fderror";
		}
	}

	// ��Ͳ鿴���ж���
	public String zkOrdersAction() {
		System.out.println("������Ͷ���action");
		try {
			List<Order> zkorderList = new ArrayList<Order>();
			zkorderList = od.queryzkOrders((Integer) ActionUtil
					.getSessionAttribute("id"));
			for (Order order : zkorderList) {
				int orderDays = orderDays(order.getIn_time(),order.getOut_time());
				order.setLive_days(orderDays);
				order.setTotal_money(orderDays*order.getPrice());
			}
			ActionUtil.setSessionAttribute("zkOrderList", zkorderList);
			return "zkorders";
		} catch (Exception e) {
			e.printStackTrace();
			return "zkerror";
		}
	}
}
