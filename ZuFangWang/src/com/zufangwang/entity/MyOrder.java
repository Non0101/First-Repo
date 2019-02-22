package com.zufangwang.entity;

public class MyOrder {
	private int MyOrderId; // ∂©µ•±‡∫≈
	private int userID; // ”√ªß±‡∫≈

	public int getMyOrderId() {
		return MyOrderId;
	}

	public void setMyOrderId(int MyOrderId) {
		this.MyOrderId = MyOrderId;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public MyOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyOrder(int myOrderId, int userID) {
		super();
		MyOrderId = myOrderId;
		this.userID = userID;
	}

	@Override
	public String toString() {
		return "MyOrder [MyOrderId=" + MyOrderId + ", userID=" + userID + "]";
	}
}
