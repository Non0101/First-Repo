<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>提示页面</title>
<link href="../css/myfz.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.8.3.js" type="text/javascript"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="bd">
		<div class="myinfo_top">
			<img class="rt" src="../images/register_top.gif"></img>
		</div>
		<h1 class="huanying" align="center">
			尊敬的房东 <font color="red"> <s:property
					value="#session.yonghuming" /></font>以下是您的所有房屋信息
		</h1>
		&nbsp&nbsp<a
			href="${pageContext.request.contextPath}/common/personalcenter.jsp">个人中心</a>
		&nbsp&nbsp<a
			href="${pageContext.request.contextPath}/main/fangdongmain.jsp">主页</a>

		<div class="middle">
			<table style="width:80%" align="center" border="1px solid black">
				<tr align="center">
					<td>房屋编号</td>
					<td>房屋名</td>
					<td>房屋图片</td>
					<td>房屋类型</td>
					<td>房屋面积(m²)</td>
					<td>房屋地址</td>
					<td>租赁价格</td>
					<td>房屋状态</td>
				</tr>
				<s:iterator value="#session.myhouseList">
					<tr align="center">
						<td><s:property value="house_id" /></td>
						<td><s:property value="house_name" /></td>
						<td  style="width:60px;height:40px;"><a href="<s:url action='house_houseInfoAction' namespace='/dd'/>?pjid=<s:property value='house_id'/>"><s:iterator value="photo"><img style="width:60px;height:40px;"src="http://localhost:8989/ZuFangWang/imgco/<s:property value="photo_path"/>"/></s:iterator></a></td>
						<td><s:property value="house_type" /></td>
						<td><s:property value="house_area"/></td>
						<td><s:property value="house_address" /></td>
						<td><s:property value="house_price" /></td>
						<td><s:property value="house_state" /></td>
					</tr>
				</s:iterator>
			</table>
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
