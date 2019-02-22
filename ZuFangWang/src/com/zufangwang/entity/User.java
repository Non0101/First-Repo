package com.zufangwang.entity;

public class User {
	private int user_id; // 用户标识
	private String user_name; // 用户名
	private String user_password; // 用户密码
	private String user_email; // 用户邮箱
	private int user_phone; // 用户手机号
	private String user_state; // 用户状态
	private String user_category; // 用户类别
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_state() {
		return user_state;
	}
	public void setUser_state(String user_state) {
		this.user_state = user_state;
	}
	public String getUser_category() {
		return user_category;
	}
	public void setUser_category(String user_category) {
		this.user_category = user_category;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int user_id, String user_name, String user_password,
			String user_email, int user_phone, String user_state,
			String user_category) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_password = user_password;
		this.user_email = user_email;
		this.user_phone = user_phone;
		this.user_state = user_state;
		this.user_category = user_category;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name
				+ ", user_password=" + user_password + ", user_email="
				+ user_email + ", user_phone=" + user_phone + ", user_state="
				+ user_state + ", user_category=" + user_category + "]";
	}
}
