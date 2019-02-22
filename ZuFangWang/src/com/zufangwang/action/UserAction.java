package com.zufangwang.action;

import java.util.Map;

import org.apache.commons.codec.digest.DigestUtils;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zufangwang.db.MyBatisUtil;
import com.zufangwang.entity.User;
import com.zufangwang.service.UserService;
import com.zufangwang.serviceimpl.UserServiceImpl;

public class UserAction extends ActionSupport {
	private int userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private int userPhone;
	private String userCategory;
	UserService us = new UserServiceImpl();
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(int userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserCategory() {
		return userCategory;
	}

	public void setUserCategory(String userCategory) {
		this.userCategory = userCategory;
	}
     // DMI��̬��������------�û�ע��
	public String registerAction() {
		System.out.println("����Action");
		User user = new User();
		user.setUser_name(userName);
		user.setUser_password(userPassword);
		user.setUser_email(userEmail);
		user.setUser_phone(userPhone);
		user.setUser_state("n");
		if ("1".equals(userCategory)) {
			user.setUser_category("����");
		} else if ("2".equals(userCategory)) {
			user.setUser_category("���");
		}
		us.register(user);
		ActionUtil.setSessionAttribute("youxiang", userEmail);
		System.out.println("userEmailΪ" + userEmail + "   " + "userPasswordΪ"
				+ userPassword + "���" + userCategory + "stateΪ"
				+ user.getUser_state());
		User uuu = us.login(userEmail, userPassword);
		if (uuu != null) {
			/*
			 * String cod = DigestUtils.md5Hex(userEmail + userPassword);
			 * ActionUtil.setSessionAttribute("code", cod);
			 */
			ActionUtil.setSessionAttribute("yonghuming", uuu.getUser_name());
			System.out.println("registerAction����");
			return "checkregisterok";
		} else {
			return "error";
		}
	}

	// DMI��̬��������------�û���¼
	public String loginAction() {
		System.out.println("����loginAction" + "email" + userEmail + "password"
				+ userPassword);
		User user = us.login(userEmail, userPassword);
		if (user != null) {
			System.out.println("��½�ǿ�");
			ActionUtil.setSessionAttribute("id", user.getUser_id());
			ActionUtil.setSessionAttribute("yonghuming", user.getUser_name());
			ActionUtil.setSessionAttribute("email", user.getUser_email());
			ActionUtil.setSessionAttribute("phone", user.getUser_phone());
			ActionUtil.setSessionAttribute("password", user.getUser_password());
			ActionUtil.setSessionAttribute("shenfen", user.getUser_category());
			if ("����".equals(user.getUser_category())) {
				//����session��ŷ���id �ڲ鿴��������Action��ʹ��
				ActionUtil.setSessionAttribute("user_id",user.getUser_id());
				System.out.println("-----------------------------------"+user.getUser_id());
				return "loginok_fangdong";
			}else if("����Ա".equals(user.getUser_category())){
				return"login_admin";
			}
			else {
				return "loginok_zuke";
			}
		} else {
			System.out.println("��½Ϊ��");
			return "error";
		}
	}

	// �û��ǳ�
	public String logoutAction() {
		// ��ֵջ��ɾ��session
		ActionContext ctx = ActionContext.getContext();
		Map session = ctx.getSession();
		// ��ȡ���е�session����
		session.remove("yonghuming");
		return "logout";
	}

	// �û����ĸ�����Ϣ
	public String updateAction() {
		System.out.println("updateAction ����");
		userId= (Integer)ActionUtil.getSessionAttribute("id");
		userEmail = (String)ActionUtil.getSessionAttribute("email");
		System.out.print(userId+userPassword+ userPhone + userName+ userCategory);
		if(userCategory.equals("1")){
			userCategory="����";
		}else{userCategory="���";}
		us.update( userId ,userPassword, userPhone , userName,userCategory);
		ActionUtil.setSessionAttribute("id", userId);
		ActionUtil.setSessionAttribute("yonghuming", userName);
		ActionUtil.setSessionAttribute("email",userEmail);
		ActionUtil.setSessionAttribute("phone", userPhone);
		ActionUtil.setSessionAttribute("password", userPassword);
		ActionUtil.setSessionAttribute("shenfen", userCategory);
		return "updateok";
	}
}
