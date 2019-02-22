package com.zufangwang.entity;

import java.util.Date;
import java.util.List;

public class House {
	private int house_id; // 房屋编号
	private String house_name; // 房屋名
	private String house_type; // 房屋类型
	private float house_area; // 房屋面积
	private String house_address; // 房屋地址
	private int live_number; // 可住人数
	private int room_number; // 房间数
	private String room_sheshi; // 房屋设施
	private int house_price; // 房屋价格
	private String house_describe; // 房屋描述
	private String house_state; // 房屋状态
	private Category category;
	private int category_id;   //房屋类别id
	private User user;
	private int user_id;
    private List<Photo> photo;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getHouse_id() {
		return house_id;
	}
	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}

	public String getHouse_name() {
		return house_name;
	}

	public void setHouse_name(String house_name) {
		this.house_name = house_name;
	}
	
	public String getHouse_address() {
		return house_address;
	}
	public void setHouse_address(String house_address) {
		this.house_address = house_address;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getHouse_type() {
		return house_type;
	}

	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}

	public float getHouse_area() {
		return house_area;
	}

	public void setHouse_area(float house_area) {
		this.house_area = house_area;
	}

	public int getLive_number() {
		return live_number;
	}

	public void setLive_number(int live_number) {
		this.live_number = live_number;
	}

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}

	public String getRoom_sheshi() {
		return room_sheshi;
	}

	public void setRoom_sheshi(String room_sheshi) {
		this.room_sheshi = room_sheshi;
	}
	public int getHouse_price() {
		return house_price;
	}

	public void setHouse_price(int house_price) {
		this.house_price = house_price;
	}

	public String getHouse_describe() {
		return house_describe;
	}

	public void setHouse_describe(String house_describe) {
		this.house_describe = house_describe;
	}
	public String getHouse_state() {
		return house_state;
	}

	public void setHouse_state(String house_state) {
		this.house_state = house_state;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getCategory_id() {
		return category_id;
	}

	public List<Photo> getPhoto() {
		return photo;
	}
	public void setPhoto(List<Photo> photo) {
		this.photo = photo;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public House() {
		super();
		// TODO Auto-generated constructor stub
	}
	public House(int house_id, String house_name, String house_type,
			float house_area, String house_address, int live_number,
			int room_number, String room_sheshi,
			int house_price, String house_describe,String house_state, Category category,
			int category_id, List<Photo> photo) {
		super();
		this.house_id = house_id;
		this.house_name = house_name;
		this.house_type = house_type;
		this.house_area = house_area;
		this.house_address = house_address;
		this.live_number = live_number;
		this.room_number = room_number;
		this.room_sheshi = room_sheshi;
		this.house_price = house_price;
		this.house_describe = house_describe;
		this.house_state = house_state;
		this.category = category;
		this.category_id = category_id;
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "House [house_id=" + house_id + ", house_name=" + house_name
				+ ", house_type=" + house_type + ", house_area=" + house_area
				+ ", house_address=" + house_address + ", live_number="
				+ live_number + ", room_number=" + room_number
				+ ", room_sheshi=" + room_sheshi + ", house_price="
				+ house_price + ", house_describe=" + house_describe
				+ ", house_state=" + house_state + ", category=" + category
				+ ", category_id=" + category_id + ", user=" + user
				+ ", user_id=" + user_id + ", photo=" + photo + "]";
	}
	
}
