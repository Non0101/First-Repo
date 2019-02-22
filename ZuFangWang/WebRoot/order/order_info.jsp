<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head> 
<title>订单详情</title>
<link href="../css/order_info.css" rel="stylesheet" type="text/css" />
</head>
<body ><div class="bd">
	<div class="myinfo_top">
		<img class="rt" src="../images/orderinfo.gif"></img>
	</div>
	<h1 class="h1" align="center">
				尊敬的 <font color="red"> <s:property value="#session.yonghuming"/></font> 订单生成成功，详细信息如下：
	</h1>
	<div>
		<span><a href="${pageContext.request.contextPath}/common/personalcenter.jsp">个人中心</a></span> >订单详情
	</div>
	<div class="">
		<table class="tab_login">
			<tr>
				<td valign="top" class="w1" style="text-align: left"><b>房屋名称</b>
				</td>
				<td valign="top" class="w1" style="text-align: left"><b>房屋类型</b>
				</td>
				<td valign="top" class="w1" style="text-align: left"><b>房屋价格(元)</b>
				</td>
				<td valign="top" class="w1" style="text-align: left"><b>房屋地址</b>
				</td>
				<td valign="top" class="w1" style="text-align: left"><b>入住时间</b>
				</td>
				<td valign="top" class="w1" style="text-align: left"><b>退房时间</b>
				</td>
				<td valign="middle" class="w1" style="text-align:left"><b>总天数</b>
				</td>
			</tr>
			<!-- 订单开始 -->
				<tr>
					<td valign="top"><s:property value="#session.house.house_name" /></td>
					<td valign="top"><s:property value="#session.house.house_type" /></td>
					<td valign="top"><s:property value="#session.house.house_price" /></td>
					<td valign="top"><s:property value="#session.house.house_address" /></td>
					<td valign="top"><s:property value="#session.in_time" /></td>
				    <td valign="top"><s:property value="#session.out_time" /></td>
				    <td valign="top"><s:property value="#session.liveDays" /></td>
				    <td valign="top"><s:property value="#session.totalprice" /></td>
				</tr>
			<!-- 订单结束 -->
			<tr>
				<td valign="top" class="w1" style="text-align: center" colspan="5">
					<b>订单总价:&nbsp<font size="6" color="red"><s:property value="#session.house.house_price*#session.liveDays" /></font>&nbsp元</b>
				</td>
			</tr>
		</table>
		<br /> <br /> <br />
		<a href="${pageContext.request.contextPath}/oo/order_zkOrdersAction" method="post">查看我的所有订单</a>
	</div>
 </div>
 <div class="footerdiv">
	 <footer class="footer">
       <p align="center">CopyRight@ by:郑州大学 20147700309 高绍铭 </p>
       友情链接: 
       <a href="#">房天下</a>&nbsp&nbsp&nbsp<a href="#">58同城</a>&nbsp&nbsp&nbsp<a href="#">赶集网</a>
       
     </footer></div>
</body>
</html>

