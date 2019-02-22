<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>个人中心</title>
<link href="../css/personalcenter.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.8.3.js" type="text/javascript"></script>
<script type="text/javascript">

	function show1() {
		var ifram = document.getElementById("ifrm")
		var ifm=$(ifrm)
		 ifm.prop("src","${pageContext.request.contextPath}/common/myinfo.jsp") 
		}
	function show2() {
		var ifram = document.getElementById("ifrm")
		var ifm=$(ifrm)
		 ifm.prop("src","${pageContext.request.contextPath}/common/updatemyinfo.jsp") 
		}
	function show3() {
		var ifram = document.getElementById("ifrm")
		var ifm=$(ifrm)
		 ifm.prop("src","${pageContext.request.contextPath}/oo/order_fdOrdersAction") 
		}
	function show4() {
		 ifm.prop("src","${pageContext.request.contextPath}/userAction/user_cancelAction") 
		}
		

	
</script>
</head>
<body>
	<div class="bd">
		<div class="myinfo_top">
			<img class="rt" src="../images/register_top.gif"></img>
		</div>
		<h1 class="huanying" align="center">
			尊敬的 <font color="red"> <s:property value="#session.yonghuming" /></font>欢迎进入个人中心
		</h1>
		<br />
		<h2>
			您还可以去往 &nbsp&nbsp<a
				href="${pageContext.request.contextPath}/main/fangdongmain.jsp">主页</a>
		</h2>
		<div class="left">
			<ul class=daohang>
				<li class="li1"><button class="li1_a"  onclick="show1()">我的资料</button></li>
				<li class="li1"><button class="li1_a"  onclick="show2()">修改资料</button></li>
				<li class="li1"><button class="li1_a"  onclick="show3()">我的订单</button></li>
				<li class="li1"><button class="li1_a"  onclick="show4()">注销账号</button></li>
			</ul>
		</div>
		<div class="right">
			<div class="right_1"width:780px;height:600px;>
				<iframe id="ifrm" src="${pageContext.request.contextPath}/images/defalt.jpg" frameborder="0"
					marginheight="0" marginwidth="0" width="780px" height="600px">
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