<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>提示页面</title>
<link href="../css/publishok.css" rel="stylesheet" type="text/css"/>
<script src="../js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
	</script>
</head>
<body><div class="bd">
	<div class="myinfo_top">
		<img class="rt" src="../images/register_top.gif"></img>
	</div>
	 <div class="tishi" align="center">
       <font color="white">房屋已预定成功<br/>请稍后查看<a href="${pageContext.request.contextPath}/common/personalcenter.jsp">个人中心</a>订单</font>
     </div>
     &nbsp&nbsp<a href="${pageContext.request.contextPath}/#">再次预定房屋</a>&nbsp&nbsp
     <a href="${pageContext.request.contextPath}/main/zukemain.jsp">返回主页</a>
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

