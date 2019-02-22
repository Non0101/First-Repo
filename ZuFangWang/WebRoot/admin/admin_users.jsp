<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>用户管理中心</title>
<link href="../css/myfz.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
</script>
</head>
<body>
<s:action name="admin_QueryAllUsersAction" namespace="/oo"></s:action>
	<div class="bd">
		<h1 class="huanying" align="center">
			尊敬的 <font color="red"> 管理员先生（女士）</font>以下是租房网所有用户信息
		</h1>
		<div class="middle">
			<table style="width:80%" align="center" border="1px solid black">
				<tr align="center">
					<td>用户ID</td>
					<td>用户名</td>
					<td>用户密码</td>
					<td>用户邮箱</td>
					<td>用户电话</td>
					<td>用户状态</td>
					<td>用户类别</td>
					<td>操作<td>
				</tr>
				<s:iterator value="#session.allUsers">
					<tr align="center">
						<td><s:property value="user_id" /></td>
						<td><s:property value="user_name" /></td>
						<td><s:property value="user_password" /></td>
						<td><s:property value="user_email" /></td>
						<td><s:property value="user_phone" /></td>
						<td><s:property value="user_state" /></td>
						<td><s:property value="user_category" /></td>
						<td><a
							href="<s:url action="admin_DeleteUserAction"  namespace="/oo"/>?user_id=<s:property value="user_id"/>"><button>删除该用户</button></a></td>
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