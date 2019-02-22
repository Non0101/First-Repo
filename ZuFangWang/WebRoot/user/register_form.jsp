<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>欢迎注册租房网</title>
<link href="../css/register.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.8.3.js" type="text/javascript"></script>
<script type="text/javascript">
		/* $(function(){
				$("#imgVcode").attr("src","${pageContext.request.contextPath}/bb/yzm?random="
						+Math.random());
		}); */
		//邮箱必须有“@”
        function checkemail(){
		    var emailTxt = document.getElementById("txtEmail");
		    var spanobj = document.getElementById("email.info");
			if(emailTxt.value.indexOf("@")==-1 || emailTxt.value.indexOf(".")==-1){
				spanobj.innerHTML="<font color=red>邮箱地址格式错误</font>";
				return false;
			}
			spanobj.innerText ="";
			return true;
		}
        function checkname(){
           var nameTxt = document.getElementById("txtNickName");
		   var spanobj=document.getElementById("name.info");
		   if(nameTxt.value == ""){
		   	  	spanobj.innerHTML="<font color=red>姓名必填</font>";
		      	return false;
		   }
		     else 
		   	spanobj.innerText = "";
		   	
		   	return true;
        }
		   // 密码验证
		  function checkPassword(){
	       var pwdTxt = document.getElementById("txtPassword");
		   var spanobj=document.getElementById("password.info");
		   if(pwdTxt.value.length < 6){
		   spanobj.innerHTML="<font color=red>密码至少六位</font>";
		      return false;
		   }else
		   spanobj.innerText = "";
		   return true;
          }
          // 再次密码验证
		  function checkPassword1(){
		   var pwdTxt = document.getElementById("txtPassword");
	       var pwd1Txt = document.getElementById("txtRepeatPass");
		   var spanobj=document.getElementById("password1.info");
		   if(pwdTxt.value!=pwd1Txt.value){
		   		spanobj.innerHTML="<font color=red>两次输入的密码不同</font>";
		      	return false;
		   }else
		   spanobj.innerText = "";
		   return true;
          }
		// 表单验证
		function checkForm(){
			if (checkemail()==false || checkname()==false || checkPassword()==false || checkPassword1==false)
				return false;
			else
				return true;
		}
		<%-- //对比验证码
		function yanzhengma(){
		alert(0)
		<%
    HttpSession s = request.getSession(); 
   	s.setAttribute("name","test");
    %>
		alert("<%=s.getAttribute("validationCode")%>");
		var yzcode = document.getElementById("txtVerifyCode");
		var backyzcode="<%=session.getAttribute("validationCode")%>";
		alert(backyzcode);
		 /*  if(yzcode!=$("#validationCode")){
		      alert("验证码错误，请重试 "); 
		}*/} --%>
		</script>
</head>
<body><div class="bd">
	<div class="register_top">
		<img class="rt" src="../images/register_top.gif"></img>
	</div>
	<div class="fill_message">
		<form action ="<s:url  action='user_registerAction' namespace='/aa'/>" method="post" onsubmit="return checkForm()">
			<h1 class="h1" align="center">
				 新用户信息注册 
				<s:property value="errorMsg" />
			</h1>
			<table class="tab_login">
			   <tr>
					<td valign="top" class="w1">您的昵称：</td>
					<td><input onblur="checkname()" name="userName" type="text"
						id="txtNickName" class="text_input" />
						<div class="text_left" id="nickNameValidMsg">
							<p>4－20个字符 小写英文字母、中文或数字</p>
							<span id="name.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">您的Email地址：</td>
					<td><input onblur="checkemail()" name="userEmail" type="text"
						id="txtEmail" class="text_input" />
						<div class="text_left" id="emailValidMsg">
							<p>请填写有效的Email地址</p>
							<span id="email.info" style="color:red"></span>
						</div>
						</td>
				</tr>
<tr>
					<td valign="top" class="w1">您的手机号码：</td>
					<td><input onblur="checkPhone()" name="userPhone"
						type="text" id="txtPhone" class="text_input" />
						<div class="text_left" id="passwordValidMsg">
							<p>请输入11位手机号码</p>
							<span id="phone.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">设置您的密码：</td>
					<td><input onblur="checkPassword()" name="userPassword"
						type="password" id="txtPassword" class="text_input" />
						<div class="text_left" id="passwordValidMsg">
							<p>大小写英文字母、数字组成，长度6－20位。</p>
							<span id="password.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">再次输入设置的密码：</td>
					<td><input onblur="checkPassword1()" name="userPassword1"
						type="password" id="txtRepeatPass" class="text_input" />
						<div class="text_left" id="repeatPassValidMsg">
							<span id="password1.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
				<td valign="top" class="w1">您想要注册的身份是：</td>
				<td>
				 &nbsp&nbsp&nbsp&nbsp<input type="radio" name="userCategory" value="1" />房东&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				 <input type="radio"  name="userCategory" value="2"/>租客</td>
				</tr>
				<%-- <tr>
					<td valign="top" class="w1">验证码：</td>
					<td>
						<img class="yzm_img" id='imgVcode' src="${pageContext.request.contextPath}/bb/yzm" /> 
						<input name="yzcode" type="text" id="txtVerifyCode" class="yzm_input" onblur="yanzhengma()" />
						<div class="text_left t1">
							<p class="t1">
								<span id="vcodeValidMsg">请输入图片中的四个字母。</span> <span
									id="number.info" style="color:red"></span> <a
									href="javascript:void(0)" onclick="document.getElementById('imgVcode').src='${pageContext.request.contextPath}/bb/yzm?time='+(new Date()).getTime();">看不清楚？换个图片</a>

							</p>
						</div>
					</td>
				</tr> --%>
			</table>

			<div class="login_in">

				<input id="btnClientRegister" class="button_1" name="submit" 
					type="submit" value="注 册" />
			</div>
		</form>
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

