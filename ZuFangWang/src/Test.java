import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

import com.zufangwang.action.ActionUtil;
import com.zufangwang.dao.HouseDao;
import com.zufangwang.db.MyBatisUtil;
import com.zufangwang.entity.House;
import com.zufangwang.entity.User;


public class Test {
	static Date beginDate = new Date();
	static Date endDate = DateUtils.addMonths(beginDate, 1);
 public static void main(String[] args) throws ParseException {
/*	 House house = new House();
	 User user = new User();
	 //UserDao us = (UserDao) MyBatisUtil.getMapper(UserDao.class);
	  HouseDao houseDAO = (HouseDao) MyBatisUtil.getMapper(HouseDao.class);
	  house.setHouse_id(300);
	house.setCategory_id(3);
     houseDAO.insert(house)
	 //us.selectone("222@qq.com","123123");
	 System.out.println(houseDAO.selectone(1));
	  HouseService hos = new HouseServiceImpl();
	  House house1 = hos.xiangqing(1);
	  for (Photo p : house1.getPhoto()) {
		System.out.println(p.getPhoto_path());
	  }
	  
	  System.out.println(new Date());*/
	 int a =(Integer) ActionUtil.getSessionAttribute("id");
	 System.out.println(a);
 }
 }

