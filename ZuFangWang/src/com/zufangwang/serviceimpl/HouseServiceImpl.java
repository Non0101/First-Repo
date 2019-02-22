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
//�����·���
	@Override
	public void publishNew(House house, List<String> path) {
		try {
			houseDAO.insert(house);
			//���������ݷֿ���������������
			List<String> paStr = path;
			for (String string : paStr) {
				System.out.println("·����"+string);
			 	houseDAO.insertpath(string,houseDAO.getfid());
			}
			//��ǰ̨���ݴ洢��ͼƬ��
			ActionUtil.setSessionAttribute("tupianname",paStr);
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			MyBatisUtil.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  //��ѯ��������
	@Override
	public House xiangqing(int house_id) {
		try {
			System.out.println("����serviceimpl try�� house_idΪ" + house_id);
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
//���·����Ƽ�
	@Override
	public List<House> zuixin() {
		houseList=houseDAO.newest();
		return houseList;
	}
//��ѯ��ǰ����ID
	@Override
	public int fangdongid(int house_id) {
	int fangdongid=houseDAO.selectfangdongid(house_id);
		return fangdongid;
	}
//���ķ���״̬Ϊ��Ԥ��
	@Override
	public void updateHouseState(int house_id) {
		try {
			System.out.println("����serviceimpl try����ķ���״̬ house_idΪ" + house_id);
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
	//��ѯ�����������з���
	@Override
	public List<House> queryMyHouse(int user_id) {
		List<House> myhouse=new ArrayList<House>();
		try {
			System.out.println("����serviceimpl try���ѯ�������·��ݷ���idΪ" + user_id);
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


//ɾ����������
	@Override
	public void cancel(int house_id) {
		try {
			System.out.println("����serviceimpl try��cancel()");
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
