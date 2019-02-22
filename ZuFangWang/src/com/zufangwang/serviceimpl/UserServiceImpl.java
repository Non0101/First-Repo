package com.zufangwang.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.zufangwang.dao.UserDao;
import com.zufangwang.db.MyBatisUtil;
import com.zufangwang.entity.User;
import com.zufangwang.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDAO = (UserDao) MyBatisUtil.getMapper(UserDao.class);
	User user = new User();

	@Override
	// 登录业务
	public User login(String email, String password) {
		try {
	    	System.out.println("进入serviceimpl try块"+email+password);
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			user = userDAO.selectone(email, password);
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			MyBatisUtil.close();
		}
	}

	@Override
	// 注册业务
	public void register(User user) {
		try {
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			userDAO.insert(user);
			MyBatisUtil.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	// 更改信息业务
	public void update(int id ,String password, int phone , String name,String category) {
		try {
			SqlSession session = null;
			session = MyBatisUtil.getSqlSession();
			System.out.println("usimpl中id:"+id);
			userDAO.update( id ,password, phone ,  name, category);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.commit();
			MyBatisUtil.close();
		}
	}

	// 注销业务
	@Override
	public void cancel(int id) {
		try {
			SqlSession session = MyBatisUtil.getSqlSession();
			 userDAO.cancel(id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			MyBatisUtil.commit();
			MyBatisUtil.close();
		}
	}

	@Override
	public List<User> queryAll() {
		try {
			SqlSession session = MyBatisUtil.getSqlSession();
			List<User> allUsers = new ArrayList<User>();
			allUsers=userDAO.selectAll();
			return allUsers;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			MyBatisUtil.close();
		}
	}
}
