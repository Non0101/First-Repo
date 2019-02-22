<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>更改我的个人信息</title>
<link href="../css/myinfo.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
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
        function chachong(){
         
           var emailTxt = document.getElementById("txtEmail");
		   var spanobj = document.getElementById("email.info");
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
		</script>
</head>
<body><div class="bd">
	<h1 class="h1" align="center">
				尊敬的 <font color="red"> <s:property value="#session.yonghuming"/></font> 您的个人详细信息如下
			</h1>
	<div class="my_message">
		<form action ="<s:url  action='user_updateAction' namespace='/aa'/>" method="post" >
			<table class="tab_login">
			   <tr>
					<td valign="top" class="w1">请输入昵称：</td>
					<td><input onblur="checkname()" name="userName" type="text"
						 class="text_input" value="<s:property value='#session.yonghuming'/>"/>
						<div class="text_left" >
							<p>4－20个字符 小写英文字母、中文或数字</p>
							<span id="name.info" style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">您的Email地址：</td>
					<td><input  name="userEmail" type="text" disabled="disabled"
						 class="text_input" value="<s:property value='#session.email'/>"/>
						<div>邮箱为唯一登陆账号，不可修改</div>
						</td>
				</tr>
<tr>
					<td valign="top" class="w1">请输入手机号码：</td>
					<td><input onblur="checkPhone()" name="userPhone"
						type="text"  class="text_input" value="<s:property value='#session.phone'/>"/>
						<div class="text_left" >
							<p>请输入11位手机号码</p>
							<span  style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">请设置新密码：</td>
					<td><input onblur="checkPassword()" name="userPassword"
						type="password" class="text_input" value="<s:property value='#session.password'/>" />
						<div class="text_left">
							<p>大小写英文字母、数字组成，长度6－20位。</p>
							<span  style="color:red"></span>
						</div></td>
				</tr>
				<tr>
					<td valign="top" class="w1">再次输入设置的密码：</td>
					<td><input onblur="checkPassword1()" name="userPassword1"
						type="password" class="text_input" />
						<div class="text_left" >
							<span  style="color:red"></span>
						</div></td>
				</tr>
				<tr>
				<td valign="top" class="w1">修改身份：</td>
				<td>
				 &nbsp&nbsp&nbsp&nbsp<input type="radio" name="userCategory" value="1" />房东&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				 <input type="radio"  name="userCategory" value="2"/>租客</td>
				</tr>
				<tr>
				 <td>
				  <input type="submit" value="确认修改"/></td>
				 </td>
				</tr>
			</table>
		</form>
	</div>
	</div>
	<div class="footerdiv">
	 <footer class="footer">
      <p align="center">
			<font size="5" color="red" align="center">信息安全大于天，修改个人信息请注意信息安全</font>
		</p>
     </footer></div>
</body>
</html>