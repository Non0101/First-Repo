package com.zufangwang.entity;

public class Category {
private int category_id;   //Àà±ð±àºÅ
private int type;
private int startPrice;
private int endPrice;
private int roomnumber;
public int getCategory_id() {
	return category_id;
}
public void setCategory_id(int category_id) {
	this.category_id = category_id;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
public int getStartPrice() {
	return startPrice;
}
public void setStartPrice(int startPrice) {
	this.startPrice = startPrice;
}
public int getEndPrice() {
	return endPrice;
}
public void setEndPrice(int endPrice) {
	this.endPrice = endPrice;
}

public int getRoomnumber() {
	return roomnumber;
}
public void setRoomnumber(int roomnumber) {
	this.roomnumber = roomnumber;
}
public Category(int category_id, int type, int startPrice, int endPrice,
		int roomnumber) {
	super();
	this.category_id = category_id;
	this.type = type;
	this.startPrice = startPrice;
	this.endPrice = endPrice;
	this.roomnumber = roomnumber;
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Category [category_id=" + category_id + ", type=" + type
			+ ", startPrice=" + startPrice + ", endPrice=" + endPrice
			+ ", roomnumber=" + roomnumber + "]";
}
}
