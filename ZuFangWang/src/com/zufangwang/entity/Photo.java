package com.zufangwang.entity;

public class Photo {
private int photo_id;
private String photo_path; 
private int house_id;
public int getPhoto_id() {
	return photo_id;
}
public void setPhoto_id(int photo_id) {
	this.photo_id = photo_id;
}
public String getPhoto_path() {
	return photo_path;
}
public void setPhoto_path(String photo_path) {
	this.photo_path = photo_path;
}
public int getHouse_id() {
	return house_id;
}
public void setHouse_id(int house_id) {
	this.house_id = house_id;
}
public Photo() {
	super();
	// TODO Auto-generated constructor stub
}
public Photo(int photo_id, String photo_path, int house_id) {
	super();
	this.photo_id = photo_id;
	this.photo_path = photo_path;
	this.house_id = house_id;
}
@Override
public String toString() {
	return "Photo [photo_id=" + photo_id + ", photo_path=" + photo_path
			+ ", house_id=" + house_id + "]";
}
}
