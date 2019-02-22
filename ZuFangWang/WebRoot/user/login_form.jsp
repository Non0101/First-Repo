<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<title>欢迎登录租房网</title>
		<link href="../css/login.css" rel="stylesheet" type="text/css" />	
    </head>
    <body>
    <banner><img src="../images/login_top.png" style="height: 101px; width: 800px;margin-left:20px;"></img></banner>
		<div class="center">
			<div style="height: 30px; padding: 5px; color: red" id="divErrorMssage"></div>
		      <div class="main">
						<h1 align="center">
							欢迎登陆租房网
						</h1>

			<form action="<s:url namespace='/aa' action='user_loginAction'/>" method="post">
				<ul class="ul">
					<li>
					&nbsp&nbsp&nbsp&nbsp&nbsp<span>请输入账号：</span>
					<input type="text" name="userEmail" id="txtUsername" class="textbox" />
					</li>
					<br/>
					<li>
					&nbsp&nbsp&nbsp&nbsp&nbsp<span>请输入密码：</span>
					<input type="password" name="userPassword" id="txtPassword"
					class="textbox" />
					</li>
					<br/>
					<li><center><font color="red"><s:property value="errorMsg"/></font></center></li>
					<br/>
					<li >
					<input type="submit" id="btnSignCheck" class="button_submit"value="登 录" />
					</li>
				</ul>
					<input type="hidden" name="uri" value="${uri}" />
			</form>
					</div>
					<div class="user_new">
						<p align="right">
						 还没有租房网账号？
						</p>
						<p class="set_up"align="right">
							<a href="${pageContext.request.contextPath}/user/register_form.jsp"><button>马上去注册&gt;&gt;</button></a>
						</p>
					</div>
				</div>
	</body>
</html>

