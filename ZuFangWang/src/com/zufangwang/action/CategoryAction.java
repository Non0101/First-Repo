package com.zufangwang.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.zufangwang.entity.House;
import com.zufangwang.service.CategoryService;
import com.zufangwang.serviceimpl.CategoryServiceImpl;

public class CategoryAction extends ActionSupport{
	private String type;
	private String startPrice;
	private String endPrice;
	private String roomnumber;
	CategoryService cts=new CategoryServiceImpl();

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getStartPrice() {
		return startPrice;
	}
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}
	public String getEndPrice() {
		return endPrice;
	}
	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	public String getRoomnumber() {
		return roomnumber;
	}
	public void setRoomnumber(String roomnumber) {
		this.roomnumber = roomnumber;
	}
	//通过类别分类查询房屋
	public String queryByleibieAction(){
	List<House> Hlist=new ArrayList<House>();
	 int ntype =Integer.parseInt(type);
	 System.out.println("类别为："+ntype);
		Hlist=cts.queryByleibie(ntype);
		ActionUtil.setSessionAttribute("Hlist",Hlist);
		if(Hlist!=null){return "queryByleibieok";}
		else return "error";
	}
	//通过价格区间分类查询房屋
	public String queryByPriceAction(){
		List<House> Hlist=new ArrayList<House>();
		 int nstartPrice =Integer.parseInt(startPrice);
		 int nendPrice =Integer.parseInt(endPrice);
		 System.out.println("价格区间为："+nstartPrice+"-"+nendPrice);
		Hlist=cts.queryByPrice(nstartPrice, nendPrice);
		ActionUtil.setSessionAttribute("Hlist",Hlist);
		if(Hlist!=null){return "queryByPriceok";}
		else return "error";
	}
//通过房间数分类查询
	public String queryByRoomnumberAction(){
		List<House> Hlist=new ArrayList<House>();
		 int nroomNumber =Integer.parseInt(roomnumber);
		 System.out.println("房间数为："+nroomNumber);
            Hlist=cts.queryByRoomnumber(nroomNumber);
            ActionUtil.setSessionAttribute("Hlist",Hlist);
		if(Hlist!=null){return "queryByRoomnumberok";}
		else return "error";
	}

}
