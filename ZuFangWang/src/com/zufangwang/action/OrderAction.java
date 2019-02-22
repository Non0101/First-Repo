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
	private int order_id; // 订单项编号
	private House house;
	private User user;
	private int house_id; // 房屋编号
	private int myorder_id; // 订单编号
	private Date intime; // 入住时间
	private Date outtime; // 退房时间
	private int live_days; // 入住天数
	private int total_money; // 总价
	private String order_state; // 订单状态
	private Date order_time; // 订单生成时间
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

	// 计算租赁房屋的天数
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
		long orderDays = (time2 - time1) / (1000 * 3600 * 24); // 由毫秒换算成天
		return Integer.parseInt(String.valueOf(orderDays));
	}

	// 创建新订单
	public String createOrderAction() throws Exception {
		try {
			System.out.println("进入创建新订单Action");
			House house = (House) ActionUtil.getSessionAttribute("house");
			System.out.println("house-------------------" + house);
			order.setHouse_id(house.getHouse_id());
			// 计算租赁时间（天）
			System.out.println("house.getHouse_id()" + house.getHouse_id());
			int orderDays = orderDays(intime, outtime);
			order.setLive_days(orderDays);
		// 将入住、退房时间、总价放在session中，订单详情order_info页面调用
			ActionUtil.setSessionAttribute("in_time", intime);
			ActionUtil.setSessionAttribute("out_time", outtime);
			ActionUtil.setSessionAttribute("liveDays", orderDays);
			// 转换UtilDate为SqlDate 方便插入数据库
			java.sql.Date sintime = new java.sql.Date(intime.getTime());
			java.sql.Date souttime = new java.sql.Date(outtime.getTime());
			// 设置入住时间和退房时间
			order.setIn_time(sintime);
			order.setOut_time(souttime);
			order.setOrder_state("未支付");
			// 设置预定日期为当前日期
			Date uDate = new Date();
			java.sql.Date sDate = new java.sql.Date(uDate.getTime());
			order.setOrder_time(sDate);
			// 获取当前房屋id
			House nhouse = (House) ActionUtil.getSessionAttribute("house");
			System.out.println("orderAction中house_id为" + nhouse.getHouse_id());
			order.setHouse_id(nhouse.getHouse_id());
			// 获取当前房屋名
			order.setHouse_name((String) ActionUtil
					.getSessionAttribute("fwname"));
			// 获取当前房屋单价
			order.setPrice((Integer) ActionUtil.getSessionAttribute("danjia"));
			// 获取当前用户id,作为租客id
			order.setZuke_id((Integer) ActionUtil.getSessionAttribute("id"));
			System.out.println("orderAction中用户id"
					+ (Integer) ActionUtil.getSessionAttribute("id"));
			// 获取房东id
			// 通过当前房屋id查询此房屋的房东id
			HouseService hos = new HouseServiceImpl();
			int fdid = hos.fangdongid(nhouse.getHouse_id());
			System.out.println("orderAction中房东id" + fdid);
			order.setFangdong_id(fdid);
			od.newOrder(order);
			hos.updateHouseState(nhouse.getHouse_id());
			// 這裡可能會出錯！
			return "insertorderok";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}

	// 查看单个订单信息
	public String orderInfoAction() {
		order = od.queryone(order_id);
		if (order != null) {
			return "orderinfook";
		} else {
			return "error";
		}
	}

	// 房东查看所有订单
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

	// 租客查看所有订单
	public String zkOrdersAction() {
		System.out.println("进入租客订单action");
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
