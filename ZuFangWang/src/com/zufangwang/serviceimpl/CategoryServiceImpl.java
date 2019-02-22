package com.zufangwang.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.zufangwang.action.ActionUtil;
import com.zufangwang.dao.CategoryDao;
import com.zufangwang.dao.HouseDao;
import com.zufangwang.db.MyBatisUtil;
import com.zufangwang.entity.House;
import com.zufangwang.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	private CategoryDao categoryDAO = (CategoryDao) MyBatisUtil.getMapper(CategoryDao.class);
  //通过类别 分类查询房屋
	@Override
	public List<House> queryByleibie(int category_id) {
	   List<House> CHlist = new ArrayList<House>();
	   try {
			System.out.println("进入categoryServiceimpl try块 category_id为" + category_id);
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			CHlist=categoryDAO.selectByCategory(category_id);
			return CHlist;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			MyBatisUtil.close();
		}
		
	}
//通过价格区间分类查询房屋
	@Override
	public List<House> queryByPrice(int startPrice, int endPrice) {
		 List<House> CHlist = new ArrayList<House>();
		   try {
				System.out.println("进入categoryServiceimpl try块 startPrice为" + startPrice+"endPrice为"+endPrice);
				SqlSession session = null;
				session = MyBatisUtil.getSqlSession();
				CHlist=categoryDAO.selectByPrice(startPrice, endPrice);
				return CHlist;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			} finally {
				MyBatisUtil.close();
			}
	}
//通过房间数，分类查询房屋
	@Override
	public List<House> queryByRoomnumber(int roomnumber) {
		 List<House> CHlist = new ArrayList<House>();
		   try {
				System.out.println("进入categoryServiceimpl try块 roomnumber为" + roomnumber);
				SqlSession session = null;
				session = MyBatisUtil.getSqlSession();
				if(roomnumber<6){
					CHlist=categoryDAO.selectByroomnumber(roomnumber);
				}
				else if(roomnumber>5){
					CHlist=categoryDAO.selectByroomnumber2(roomnumber);
				}
				return CHlist;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			} finally {
				MyBatisUtil.close();
			}
	}

}
