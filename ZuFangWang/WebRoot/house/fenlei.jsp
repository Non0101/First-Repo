<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>欢迎进入分类搜索页面</title>
<link href="../css/fenlei.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="bd">
		<div class="myinfo_top">
			<img class="rt" src="../images/fenlei.gif"></img>
		</div>
		<a href="${pageContext.request.contextPath}/main/zukemain.jsp">主页</a>>>>分类搜索页
		<div class="fenlei">
			<font color="red" size="2">按房间数：</font><a
				href="<s:url action='category_queryByRoomnumberAction' namespace='/cc'/>?roomnumber=1"><font
				color="white" size="3" name="roomnumber">1室</font></a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a
				href="<s:url action='category_queryByRoomnumberAction' namespace='/cc'/>?roomnumber=2"><font
				color="white" size="3" name="roomnumber">2室</font></a>&nbsp;&nbsp;&nbsp;&nbsp;
			<a
				href="<s:url action='category_queryByRoomnumberAction' namespace='/cc'/>?roomnumber=3"><font
				color="white" size="3" name="roomnumber">3室</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="<s:url action='category_queryByRoomnumberAction' namespace='/cc'/>?roomnumber=4"><font
				color="white" size="3" name="roomnumber">4室</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="<s:url action='category_queryByRoomnumberAction' namespace='/cc'/>?roomnumber=5"><font
				color="white" size="3" name="roomnumber">5室</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="<s:url action='category_queryByRoomnumberAction' namespace='/cc'/>?roomnumber=6"><font color="white" size="3" name="roomnumber">5室以上</font></a><br />
			<br /> <font color="red" size="2">按房屋类型：</font><a
				href="<s:url action='category_queryByleibieAction' namespace='/cc'/>?type=1"><font
				color="white" size="3">别墅</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="<s:url action='category_queryByleibieAction' namespace='/cc'/>?type=2"><font
				color="white" size="3">民宿</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="<s:url action='category_queryByleibieAction' namespace='/cc'/>?type=3"><font
				color="white" size="3">公寓</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="<s:url action='category_queryByleibieAction' namespace='/cc'/>?type=4"><font
				color="white" size="3">普通</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="<s:url action='category_queryByleibieAction' namespace='/cc'/>?type=5"><font
				color="white" size="3">其他</font></a></font> <br /> <br /> <font color="red"
				size="2">按价格区间（元/天）：</font><a href="<s:url action='category_queryByPriceAction' namespace='/cc'/>?startPrice=0&endPrice=99"><font color="white"
				size="3">0-99</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="<s:url action='category_queryByPriceAction' namespace='/cc'/>?startPrice=100&endPrice=199"><font
				color="white" size="3">100-199</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="<s:url action='category_queryByPriceAction' namespace='/cc'/>?startPrice=200&endPrice=299"><font color="white" size="3">200-299</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="<s:url action='category_queryByPriceAction' namespace='/cc'/>?startPrice=300&endPrice=500"><font color="white" size="3">300-500</font></a>&nbsp;&nbsp;&nbsp;&nbsp;<a
				href="<s:url action='category_queryByPriceAction' namespace='/cc'/>?startPrice=500&endPrice=1000000"><font color="white" size="3">500以上</font></a></font><br />
			<br />

		</div>
		<br />
		<hr color="green" size="2px" />
		<div class="fenleishow">
			<%@include file="../house/fenleishow.jsp"%>
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

