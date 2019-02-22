<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>欢迎进入个人信息页</title>
<link href="../css/myinfo.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
	</script>
</head>
<body>
	<div class="bd">
		<font><h1 color="red" class="h1" align="center">
			您的个人详细信息如下
		</h1></font>
		<div class="my_message">

			<table class="myinfo_table">
				<tr>
					<td valign="top" class="w1">您的昵称：</td>
					<td><s:property value="#session.yonghuming" /></td>
				</tr>
				<tr>
					<td valign="top" class="w1">您的Email地址：</td>
					<td><s:property value="#session.email" /></td>
				</tr>
				<tr>
					<td valign="top" class="w1">您的手机号码：</td>
					<td><s:property value="#session.phone" /></td>
				</tr>
				<tr>
					<td valign="top" class="w1">您的密码：</td>
					<td><s:property value="#session.password" /></td>
				</tr>
				<tr>
					<td valign="top" class="w1">您的身份是：</td>
					<td><s:property value="#session.shenfen" /></td>
				</tr>
				<tr>

					<td align="center"><a href="../common/updatemyinfo.jsp"> <input
							type="button" value="修改我的个人信息" /></a></td>

				</tr>
			</table>
		</div>
	</div>
	<div class="footerdiv">
		<footer class="footer">
		<p align="center">
			<font size="5" color="red" align="center">信息安全大于天，修改个人信息请注意信息安全</font>
		</p>
		</footer>
	</div>
</body>
</html>

