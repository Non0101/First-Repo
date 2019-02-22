<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<title>租房网主页（房东）</title>
		<link href="../css/main.css" rel="stylesheet" type="text/css" />	
</head>
<body>
 <div class="bd">
 	<div class="fangdongmain_top">
		<img class="rt" src="../images/fdmain.gif"></img>
	</div>
 <div class="huanyingfd" align="center">  
     尊敬的房东<font color="red"><s:property value="#session.yonghuming"/></font>,您好，欢迎进入房东管理界面
 </div>
 <span class="li1_a" id="logininfo">
		<s:if test="#session.yonghuming!=null"> 
		[用户：<font size="3"color="red"><s:property value="#session.yonghuming"/></font>&nbsp;]<a href="<s:url action="user_logoutAction" namespace="/aa"/>">&nbsp<font size="5"color="yellow">退出</font></a>
		 </s:if> 
		<s:if test="#session.yonghuming==null">
		[&nbsp;<a href="../user/login_form.jsp"><font size="3" color="yellow">登陆</font>></a>/<a
			href="../user/register_form.jsp" ><font size="3" color="yellow">注册</font></a>&nbsp;]
			</s:if>
		</span>
<div class="middle">
   <div class="m-right">
      <div class="m-right-d1">
      <a href="${pageContext.request.contextPath}/house/publishhouse.jsp"><button style="width:230px;height:160px;background-color:green;border-radius:40px 40px 40px 40px;"><font size="6">发布房屋</font></button></a>
      </div><div class="m-right-d2">
      <a href="${pageContext.request.contextPath}/oo/order_fdOrdersAction"><button style="width:230px;height:160px;background-color:grey;border-radius:40px 40px 40px 40px;"><font size="6">订单中心</font></button></a>
      </div>
      <div class="m-right-d3">
    <a href="<s:url action='house_queryMyHousesAction' namespace='/dd'/>"><button style="width:230px;height:160px;background-color:yellow; border-radius:40px 40px 40px 40px;class="middle_button"><font size="6">我的房屋</font></button></a>
      </div>
      <div class="m-right-d4">
    <a href="${pageContext.request.contextPath}/common/fdpersonalcenter.jsp"><button style="width:230px;height:160px;background-color:white;border-radius:40px 40px 40px 40px;class="middle_button"><font size="6">我的信息</font></button></a>
      </div>
   </div>
   <div class="m-left">
      <div class="attention">最新公告<img src=""/></div>
      <a href="#">租房网最新政策</a><br/><br/>
      <a href="#">租房网寻找最美房东</a><br/><br/>
      <a href="#">租房网房东须知</a><br/><br/>
      <a href="#">我是房东我做主</a><br/><br/>
      <a href="#">我的租客，你在哪？</a><br/><br/>
      <a href="#">最新房屋一览</a><br/>
   </div>
</div> 
</div> 
<div class="footerdiv">
	 <footer class="footer">
       <p align="center">CopyRight@ by:郑州大学 20147700309 高绍铭 </p>
       友情链接: 
       <a href="#">房天下</a>&nbsp&nbsp&nbsp<a href="#">58同城</a>&nbsp&nbsp&nbsp<a href="#">赶集网</a>
       
     </footer>

</div>
</body>
</html>
