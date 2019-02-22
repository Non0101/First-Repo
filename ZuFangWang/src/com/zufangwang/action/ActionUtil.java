package com.zufangwang.action;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class ActionUtil extends ActionSupport{
	private static ValueStack vs;
	static{
		ActionContext context=ActionContext.getContext();
		vs=context.getValueStack();
	}
	public static void setSessionAttribute(String ognl,Object value){
		vs.setValue("#session."+ognl, value);	
	}
	public static Object getSessionAttribute(String ognl){
		return vs.findValue("#session."+ognl);
	}
	public static void setApplicationAttribute(String ognl,Object value){
		vs.setValue("#application"+ognl, value);
	}
	public static Object getApplicationAttribute(String ognl){
		return vs.findValue("#application."+ognl);
	}
	

}
