<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>订单管理中心</title>
<link href="../css/myfz.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
<s:action name="admin_queryAllOrdersAction" namespace="/oo"></s:action>
	<div class="bd">
		<!-- <div class="myinfo_top">
			<img class="rt" src="../images/register_top.gif"></img>
		</div> -->
		<h1 class="huanying" align="center">
			尊敬的 <font color="red"> 管理员先生（女士）</font>以下是租房网所有订单信息
		</h1>
		<div class="middle">
			<table style="width:80%" align="center" border="1px solid black">
				<tr align="center">
					<td>订单号</td>
					<td>房屋ID</td>
					<td>房屋名</td>
					<td>单价</td>
					<td>入住时间</td>
					<td>退房时间</td>
					<td>总天数</td>
					<td>总金额</td>
					<td>租客ID</td>
					<td>房东ID</td>
					<td>订单状态</td>
					<td>创建订单时间</td>
					<td>操作
						<td>
				</tr>
				<s:iterator value="#session.allOrders">
					<tr align="center">
						<td><s:property value="order_id" /></td>
						<td><s:property value="house_id" /></td>
						<td><s:property value="house_name" /></td>
						<td><s:property value="price" /></td>
						<td><s:property value="in_time" /></td>
						<td><s:property value="out_time" /></td>
						<td><s:property value="intime-outTime" /></td>
						<td><s:property value="" /></td>
						<td><s:property value="zuke_id" /></td>
						<td><s:property value="fangdong_id" /></td>
						<td><s:property value="order_state" /></td>
						<td><s:property value="order_time" /></td>
						<td><a
							href="<s:url action="admin_deleteOrderAction"  namespace="/oo"/>?order_id=<s:property value="order_id"/>"><button>删除该订单</button></a></td>
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