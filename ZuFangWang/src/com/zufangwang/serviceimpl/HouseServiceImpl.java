package com.zufangwang.serviceimpl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.struts2.ServletActionContext;

import com.zufangwang.action.ActionUtil;
import com.zufangwang.dao.HouseDao;
import com.zufangwang.db.MyBatisUtil;
import com.zufangwang.entity.House;
import com.zufangwang.service.HouseService;

public class HouseServiceImpl implements HouseService {
	private HouseDao houseDAO = (HouseDao) MyBatisUtil
			.getMapper(HouseDao.class);
	House house = new House();
	List<House> houseList = new ArrayList<House>();
//发布新房屋
	@Override
	public void publishNew(House house, List<String> path) {
		try {
			houseDAO.insert(house);
			//将集合内容分开，逐条遍历插入
			List<String> paStr = path;
			for (String string : paStr) {
				System.out.println("路径："+string);
			 	houseDAO.insertpath(string,houseDAO.getfid());
			}
			//向前台传递存储的图片名
			ActionUtil.setSessionAttribute("tupianname",paStr);
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			MyBatisUtil.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  //查询房屋详情
	@Override
	public House xiangqing(int house_id) {
		try {
			System.out.println("进入serviceimpl try块 house_id为" + house_id);
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			house = houseDAO.selectone(house_id);
			System.out.println("wwwwwwwwwwwww"+house.toString());
			System.out.println("ssssssssssssssssssssssss"+house.getHouse_state());
			ActionUtil.setSessionAttribute("state",house.getHouse_state());
			ActionUtil.setSessionAttribute("fwname", house.getHouse_name());
			ActionUtil.setSessionAttribute("danjia",house.getHouse_price());
			return house;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			MyBatisUtil.close();
		}
	}
//最新发布推荐
	@Override
	public List<House> zuixin() {
		houseList=houseDAO.newest();
		return houseList;
	}
//查询当前房东ID
	@Override
	public int fangdongid(int house_id) {
	int fangdongid=houseDAO.selectfangdongid(house_id);
		return fangdongid;
	}
//更改房屋状态为已预订
	@Override
	public void updateHouseState(int house_id) {
		try {
			System.out.println("进入serviceimpl try块更改房屋状态 house_id为" + house_id);
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			houseDAO.updateHouseState(house_id);
			MyBatisUtil.commit();
			House house=houseDAO.selectone(house_id);
			ActionUtil.setSessionAttribute("house_state", house.getHouse_state());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.close();
		}
		
	}
	//查询房东名下所有房屋
	@Override
	public List<House> queryMyHouse(int user_id) {
		List<House> myhouse=new ArrayList<House>();
		try {
			System.out.println("进入serviceimpl try块查询房东名下房屋房东id为" + user_id);
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			myhouse=houseDAO.querymyhouses(user_id);
			System.out.println(myhouse.toString());
			return myhouse;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			MyBatisUtil.close();
		}
	}


//删除单个房屋
	@Override
	public void cancel(int house_id) {
		try {
			System.out.println("进入serviceimpl try块cancel()");
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			houseDAO.cancel(house_id);
			MyBatisUtil.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.close();
		}
	}

}
