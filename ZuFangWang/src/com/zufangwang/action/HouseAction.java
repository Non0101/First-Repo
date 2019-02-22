package com.zufangwang.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zufangwang.dao.HouseDao;
import com.zufangwang.db.MyBatisUtil;
import com.zufangwang.entity.House;
import com.zufangwang.entity.User;
import com.zufangwang.service.HouseService;
import com.zufangwang.serviceimpl.HouseServiceImpl;

public class HouseAction extends ActionSupport {
	private int house_id; // 房屋id
	private int category_id; // 类别id
	private int user_id; // 用户id
	private String house_name; // 房屋名
	private String house_type; // 房屋类型（个人房源/中介）
	private int house_area; // 房屋面积
	private String house_address; // 房屋地址
	private int live_number; // 可住人数
	private int room_number; // 房间数
	private String room_sheshi; // 房屋设施
	private String house_photo; // 房屋主图
	private int house_price; // 房屋价格
	private String house_describe; // 房屋描述
	private String house_state; // 房屋状态
	private int house_areaStart; // 搜索条件之房屋最小面积
	private int house_areaEnd; // 搜索条件之房屋最大面积
	private int house_priceStart; // 搜索条件之房屋最低价
	private int house_priceEnd; // 搜索条件之房屋最高价格
	private String pjid;
	private File[] upload; // 封装上传文件属性

	private String[] uploadContentType; // 封装上传文件的类型

	private String[] uploadFileName; // 封装上传文件名称

	private String savePath; // 封装文件上传的路径
	private List<String> paths;

	public String getPjid() {
		return pjid;
	}

	public void setPjid(String pjid) {
		this.pjid = pjid;
	}

	public File[] getUpload() {
		return upload;
	}

	public void setUpload(File[] upload) {
		this.upload = upload;
	}

	public String[] getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String[] uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String[] getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String[] uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	List<House> housel = new ArrayList<House>();

	public int getHouse_id() {
		return house_id;
	}

	public void setHouse_id(int house_id) {
		this.house_id = house_id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getHouse_name() {
		return house_name;
	}

	public void setHouse_name(String house_name) {
		this.house_name = house_name;
	}

	public String getHouse_type() {
		return house_type;
	}

	public void setHouse_type(String house_type) {
		this.house_type = house_type;
	}

	public int getHouse_area() {
		return house_area;
	}

	public void setHouse_area(int house_area) {
		this.house_area = house_area;
	}

	public String getHouse_address() {
		return house_address;
	}

	public void setHouse_address(String house_address) {
		this.house_address = house_address;
	}

	public int getLive_number() {
		return live_number;
	}

	public void setLive_number(int live_number) {
		this.live_number = live_number;
	}

	public int getRoom_number() {
		return room_number;
	}

	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}

	public String getRoom_sheshi() {
		return room_sheshi;
	}

	public void setRoom_sheshi(String room_sheshi) {
		this.room_sheshi = room_sheshi;
	}

	public String getHouse_photo() {
		return house_photo;
	}

	public void setHouse_photo(String house_photo) {
		this.house_photo = house_photo;
	}

	public int getHouse_price() {
		return house_price;
	}

	public void setHouse_price(int house_price) {
		this.house_price = house_price;
	}

	public String getHouse_describe() {
		return house_describe;
	}

	public void setHouse_describe(String house_describe) {
		this.house_describe = house_describe;
	}

	public String getHouse_state() {
		return house_state;
	}

	public void setHouse_state(String house_state) {
		this.house_state = house_state;
	}

	public int getHouse_areaStart() {
		return house_areaStart;
	}

	public void setHouse_areaStart(int house_areaStart) {
		this.house_areaStart = house_areaStart;
	}

	public int getHouse_areaEnd() {
		return house_areaEnd;
	}

	public void setHouse_areaEnd(int house_areaEnd) {
		this.house_areaEnd = house_areaEnd;
	}

	public int getHouse_priceStart() {
		return house_priceStart;
	}

	public void setHouse_priceStart(int house_priceStart) {
		this.house_priceStart = house_priceStart;
	}

	public int getHouse_priceEnd() {
		return house_priceEnd;
	}

	public void setHouse_priceEnd(int house_priceEnd) {
		this.house_priceEnd = house_priceEnd;
	}

	List<String> photonamelist;

	// 上传图片
	public String execute() throws Exception {
		File file = new File(getSavePath());
		if (!file.exists())
			file.mkdir(); // 查询服务器下是否存在该文件夹 若否则创建
		byte[] buffer = new byte[1024];
		for (int i = 0; i < upload.length; i++) {
			uploadFileName[i] = getUpload()[i].getName() + ".jpg"; // 上传文件重命名放入数组中
			System.out.println("---------------" + uploadFileName.toString());
			FileInputStream fis = new FileInputStream(getUpload()[i]);
			FileOutputStream fos = new FileOutputStream(getSavePath() + "\\"
					+ this.getUploadFileName()[i]); // 命名上传文件
			int length = fis.read(buffer);
			while (length > 0) {
				fos.write(buffer, 0, length);
				length = fis.read(buffer);
			}
			photonamelist = Arrays.asList(uploadFileName); // 将上面封装的前台上传图片路径的数组转换为集合，方便后续插入数据库
			fos.flush();
			fos.close();
			fis.close();
		}
		return null;
	}

	public String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath("/imgco");
	}

	// Action开始----------
	HouseDao houseDAO = (HouseDao) MyBatisUtil.getMapper(HouseDao.class);
	HouseService hos = new HouseServiceImpl();
	House house = new House();

	// 发布新房屋
	public String createHouseAction() throws Exception {
		house.setHouse_name(house_name);
		int a = Integer.parseInt(house_type);
		house.setCategory_id(a);
		int b = (Integer) ActionUtil.getSessionAttribute("id");
		System.out.println("发布房屋中user_id为" + b);
		house.setUser_id(b);
		if ("1".equals(house_type)) {
			house.setHouse_type("别墅");
		} else if ("2".equals(house_type)) {
			house.setHouse_type("民宿");
		} else if ("3".equals(house_type)) {
			house.setHouse_type("公寓");
		} else if ("4".equals(house_type)) {
			house.setHouse_type("普通");
		} else {
			house.setHouse_type("其他");
		}
		house.setHouse_area(house_area);
		house.setHouse_address(house_address);
		house.setLive_number(live_number);
		house.setRoom_number(room_number);
		house.setRoom_sheshi(room_sheshi);
		house.setHouse_price(house_price);
		house.setHouse_describe(house_describe);
		house.setHouse_state("no");
		execute();
		hos.publishNew(house, photonamelist);

		if (hos.xiangqing(houseDAO.getfid()) != null) {
			return "publishok";
		}else{
			return "error";

		}
	}

	// 查看房屋详情
	public String houseInfoAction() {
		System.out.println("进入查询详情Action");
		System.out.println(pjid.toString() + "---------------pjid");
		Integer id = Integer.parseInt(pjid);
		house = hos.xiangqing(id);
		System.out.println("house中photo：" + house.getPhoto());
		if (house != null) {

			ActionUtil.setSessionAttribute("house", house);
			return "xiangqingok";
		} else {
			System.out.println("查询详情出错");
			return "error";
		}
	}

	// 更新房屋信息
	public String changeAction() {
		house.setHouse_name(house_name);
		house.setHouse_type(house_type);
		house.setHouse_area(house_area);
		house.setHouse_address(house_address);
		house.setLive_number(live_number);
		house.setRoom_number(room_number);
		house.setRoom_sheshi(room_sheshi);
		house.setHouse_price(house_price);
		house.setHouse_describe(house_describe);
		house.setHouse_state(house_state);
		hos.publishNew(house, photonamelist);
		if (hos.xiangqing(house_id) != null) {
			return "changeok";
		} else {
			return "error";
		}
	}
//查询房东名下所有房屋
	public String queryMyHousesAction(){
		List<House> myhouses=new ArrayList<House>();
		int user_id=(Integer)ActionUtil.getSessionAttribute("user_id");
		myhouses=hos.queryMyHouse(user_id);
		ActionUtil.setSessionAttribute("myhouseList", myhouses);
		if(myhouses!=null){return "queryMyHousesok";}
		else return "error";
	}
	// 删除房屋
	public String deleteHouseAction(int house_id) {
		hos.cancel(house_id);
		if (hos.xiangqing(house_id) == null) {
			return "cancelok";
		} else {
			return "error";
		}
	}

	// 查询最新发布的六个房屋进行推荐

	public void querynewsAction() {
		List<House> houseList = new ArrayList<House>();
		houseList = hos.zuixin();
		ActionUtil.setSessionAttribute("houseList", houseList);
	}
}
