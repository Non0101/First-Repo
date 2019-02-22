<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>个人中心</title>
<link href="../css/adminmain.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.8.3.js" type="text/javascript"></script>
<script type="text/javascript">
	function show1() {
		var ifram = document.getElementById("ifrm")
		var ifm=$(ifrm)
		 ifm.prop("src","${pageContext.request.contextPath}/oo/admin_QueryAllUsersAction") 
		}
	function show2() {
		var ifram = document.getElementById("ifrm")
		var ifm=$(ifrm)
		 ifm.prop("src","${pageContext.request.contextPath}/oo/admin_queryAllOrdersAction") 
		}		
</script>
</head>
<body>
	<div class="bd">
		<div class="myinfo_top">
			<img class="rt" src="../images/register_top.gif"></img>
		</div>
		<h1 class="huanying" align="center">
		<font color="white">亲爱的管理员，您好， 欢迎进入管理员中心</font>
		</h1>
		<br />
		<div class="up">
			<ul class=daohang>
				<li class="li1"><button class="li1_a"  onclick="show1()">管理用户</button></li>
				<li class="li1"><button class="li1_a"  onclick="show2()">管理订单</button></li>
				<li class="li1"><a href="${pageContext.request.contextPath}/user/login_form.jsp"><button class="li1_a">退出管理页面</button></a></li>
			</ul>
		</div>
		<div class="middlebox">
			<div class="right_1"width:900px;height:300px;>
				<iframe id="ifrm" src="${pageContext.request.contextPath}/images/defalt.jpg" frameborder="0"
					marginheight="0" marginwidth="0" width="900px" height="500px">
				</iframe>
			</div>
		</div> 
	</div>
	<div class="footerdiv">
		<footer class="footer">
		<p align="center">CopyRight@ by:郑州大学 20147700309 高绍铭</p>
		友情链接: <a href="#">房天下</a>&nbsp&nbsp&nbsp<a href="#">58同城</a>&nbsp&nbsp&nbsp<a
			href="#">赶集网</a> </footer>
	</div>
</body>
</html>