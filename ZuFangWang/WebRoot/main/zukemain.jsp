<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>租房网主页（租客）</title>
<link href="../css/main.css" rel="stylesheet" type="text/css" />
<style type="text/css">
#tab {
	overflow: hidden;
	width: 935px;
	height: 342px;
	position: relative;
	float: left;
}

#tab>img:not (:first-child ){
	display: none;
}
</style>
<script>
    window.onload = function(){
        var images = document.getElementsByName("lunbo");
        var pos = 0;
        var len = images.length;
        setInterval(function(){
            images[pos].style.display = 'none';
            pos = ++pos == len ? 0 : pos;
            images[pos].style.display = 'inline';
        },2000); 
    };
</script>
</head>
<body>
<s:action name="house_querynewsAction" namespace="/dd"></s:action>
	<div class="zkbd">
		<div class="fangdongmain_top">
			<img class="rt" src="../images/register_top.gif"></img>
		</div>
		<div class="dh">
			<ul class="daohang">
				<li class="li1"><a href="#" class="li1_a"><img src="../images/logo.gif"/></a></li>
				<li class="li1"><a class="li1_a"
					href="${pageContext.request.contextPath}/house/fenlei.jsp">房屋分类</a></li>
				<li class="li1"><a class="li1_a"
					href="${pageContext.request.contextPath}/common/personalcenter.jsp">个人中心</a></li>
				<li class="li1"><a class="li1_a" href="#">关于我们</a></li>
		<li class="li1"><span class="li1_a" id="logininfo">
		<s:if test="#session.yonghuming!=null"> 
		[用户：<font size="3"color="red"><s:property value="#session.yonghuming"/></font>&nbsp;]<a href="<s:url action="user_logoutAction" namespace="/aa"/>">&nbsp<font size="5"color="yellow">退出</font></a>
		 </s:if> 
		<s:if test="#session.yonghuming==null">
		[&nbsp;<a href="../user/login_form.jsp"><font size="3" color="yellow">登陆</font>></a>/<a
			href="../user/register_form.jsp" ><font size="3" color="yellow">注册</font></a>&nbsp;]
			</s:if>
		</span>
		</li>
			</ul>
		</div>
		<div id="tab" class="tab">
			<img src="../images/lunbo01.jpg" name="lunbo" width="950"
				height="342" /> <img src="../images/lunbo02.jpg" name="lunbo"
				width="950" height="342" /> <img src="../images/lunbo03.jpg"
				name="lunbo" width="950" height="342" /> <img
				src="../images/lunbo04.jpg" name="lunbo" width="950" height="342" />
		</div>
		<div class="zu" align="center">租</div>
		<div class="zkmiddle"></div>
		<div class="fang" align="center">房</div><br/><br/>
    <s:iterator value="#session.houseList">
		 <div class="down-left" >
			<a href="<s:url action='house_houseInfoAction' namespace='/dd'/>?pjid=<s:property value='house_id'/>">
				<s:iterator value="photo"><img style="width:310px;height:200px;"src="http://localhost:8989/ZuFangWang/imgco/<s:property value="photo_path"/>"/></s:iterator>
				</a>
		</div>
	</s:iterator> 
	</div>
	<div class="footerdiv">
		<footer class="footer">
		<p align="center">CopyRight@ by:郑州大学 20147700309 高绍铭</p>
		友情链接: <a href="#">房天下</a>&nbsp&nbsp&nbsp<a href="#">58同城</a>&nbsp&nbsp&nbsp<a
			href="#">赶集网</a> </footer>
	</div>
</body>
</html>
