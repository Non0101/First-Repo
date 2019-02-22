package com.zufangwang.entity;

import java.util.Date;

public class Order {
	private int order_id; // 订单项编号
	private House house;
	private int house_id; // 房屋编号
	private int fangdong_id;//房东id
	private int zuke_id;    //租客id
	private String house_name;  //房屋名
	private Date in_time; // 入住时间
	private Date out_time; // 退房时间
	private int price;     //房屋单价
	private int live_days; // 入住天数
	private int total_money; // 总价
	private String order_state; // 订单状态
	private Date order_time; // 订单生成时间
	

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getFangdong_id() {
		return fangdong_id;
	}

	public void setFangdong_id(int fangdong_id) {
		this.fangdong_id = fangdong_id;
	}

	public int getZuke_id() {
		return zuke_id;
	}

	public void setZuke_id(int zuke_id) {
		this.zuke_id = zuke_id;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public String getHouse_name() {
		return house_name;
	}

	public void setHouse_name(String house_name) {
		this.house_name = house_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getHouse_id() {
		return house_id;
	}

	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}
	public int getLive_days() {
		return live_days;
	}

	public Date getIn_time() {
		return in_time;
	}

	public void setIn_time(Date in_time) {
		this.in_time = in_time;
	}

	public Date getOut_time() {
		return out_time;
	}

	public void setOut_time(Date out_time) {
		this.out_time = out_time;
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

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int order_id, House house, int house_id, int fangdong_id,
			int zuke_id, String house_name, Date in_time, Date out_time,
			int price, int live_days, int total_money, String order_state,
			Date order_time) {
		super();
		this.order_id = order_id;
		this.house = house;
		this.house_id = house_id;
		this.fangdong_id = fangdong_id;
		this.zuke_id = zuke_id;
		this.house_name = house_name;
		this.in_time = in_time;
		this.out_time = out_time;
		this.price = price;
		this.live_days = live_days;
		this.total_money = total_money;
		this.order_state = order_state;
		this.order_time = order_time;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", house=" + house
				+ ", house_id=" + house_id + ", fangdong_id=" + fangdong_id
				+ ", zuke_id=" + zuke_id + ", house_name=" + house_name
				+ ", in_time=" + in_time + ", out_time=" + out_time
				+ ", price=" + price + ", live_days=" + live_days
				+ ", total_money=" + total_money + ", order_state="
				+ order_state + ", order_time=" + order_time + "]";
	}
}
