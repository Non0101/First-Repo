<%@page contentType="text/html;charset=utf-8"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>欢迎进入分类搜索页面</title>
<link href="../css/myinfo.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script type="text/javascript">
	</script>
</head>
<body>
<div class="bd">
	<table style="width:750px;">
	<s:iterator value="#session.Hlist"> 
	<tr style="background-color:green;width:750px;height:40px;">
	<td  style="width:90px;height:60px;"><a href="<s:url action='house_houseInfoAction' namespace='/dd'/>?pjid=<s:property value='house_id'/>"><s:iterator value="photo"><img style="width:90px;height:60px;"src="http://localhost:8989/ZuFangWang/imgco/<s:property value="photo_path"/>"/></s:iterator></a></td>
	<td><font color="red" size="3">房屋名：</font><font olor="white" size="4"><s:property value='house_name'/></font></td>
	<td><font color="red" size="3">房间数：</font><font olor="white" size="4"><s:property value='room_number'/></font></td>
	<td><font color="red" size="3">类别：</font><font olor="white" size="4"><s:property value='house_type'/></font></td>
	<td><font color="red" size="3">价格￥：</font><font olor="white" size="4"><s:property value='house_price'/></font></td>
	<td><a href="<s:url action='house_houseInfoAction' namespace='/dd'/>?pjid=<s:property value='house_id'/>"><button>查看详情</button></a></td>
	</tr>
	</s:iterator>
	</table>
</div>
</body>
</html>

