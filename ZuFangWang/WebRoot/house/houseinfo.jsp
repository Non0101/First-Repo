<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>房屋详情</title>
<link href="../css/houseinfo.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.8.3.js" type="text/javascript"></script>
<script type="text/javascript">
	function changeImage(a){
	//通过id来获取js原生对象
		var houseimage = document.getElementById("houseimage")
		//js对象转换为jQuery对象
       var houseimage = document.getElementById("houseimage")
		var newImage = $(houseimage)
		//Prop属性只能由JQuery对象使用，通过prop标签获得相关的属性 ，更改属性的格式如下。 
	     var se="<%=session.getAttribute("session.house.photo")%>"
		newImage.prop("src",$(a).attr("src"))
	}
</script>
</head>
<body>
	<div class="bd">
		<div class="houseinfo_top">
			<img class="rt" src="../images/houseinfo.gif"></img>
		</div>
		<div class="huanying" align="center">
			尊敬的访客<font color="red"><s:property value="#session.yonghuming" /></font>,您好，欢迎进入房屋详情界面
		</div>
		<div class="middle">
			<form class="m-right"
				action="<s:url namespace="/oo" action="order_createOrderAction"/>"
				method="post">
				<div class="m-right-d1">
					&nbsp&nbsp房屋名：<font size="3" color="white">
					<s:property value="#session.house.house_name" /></font>
				</div>
				<br /> <br />

				<div class="m-right-d2">
					&nbsp&nbsp房屋类别：<font
					size="3" color="white">
					<s:property value="#session.house.house_type" /></font>
				</div>
				<br /> <br />

				<div class="m-right-d3">
					&nbsp&nbsp房屋价格：<font
					size="3" color="white">
					<s:property value="#session.house.house_price" /></font>
					(元/天)
				</div>
				<br />
				<div class="m-right-d4">
					&nbsp&nbsp请选择入住时间：<br /> <input type="date" name="intime" /><br />
					<br /> &nbsp&nbsp请选择退房时间：<br /> <input type="date" name="outtime" />
					<br /> <br /> &nbsp&nbsp&nbsp&nbsp
		<s:if test="#session.state=='no'">
			<input type="submit" value="确认预订" />
</s:if>
<s:if test="#session.state=='yes'">
			<input type="button" disabled="disabled" value="该房屋已被预订"/>
</s:if>

			</div>

			</form>
			<!-- 大图 -->
			<div class="m-left">
				<img id="houseimage" class="imagesleft"
					src="http://localhost:8989/ZuFangWang/imgco/<s:property value="#session.house.photo[0].photo_path"/>" />
			</div>
		</div>
		<div class="middle-next">
			<table class="tbl">
				<tr><!--小图  -->
					<s:iterator value="#session.house.photo">
						<td class="td" ><img onmouseover="changeImage(this)"
							style="width:154px;height:140px;"src="http://localhost:8989/ZuFangWang/imgco/<s:property value="photo_path"/>" />
						</td>
					</s:iterator>
				</tr>
			</table>
		</div>
		<div class="buttom">
			<div class="buttom-left">
				<font size="5" color="green"> 该房屋具体信息如下：</font><br /> <br /> 房屋面积：<font
					size="3" color="white"><s:property
						value="#session.house.house_area" /> </font><br /> <br /> <br />
				房屋设施：<font size="3" color="white"><s:property
						value="#session.house.room_sheshi" /></font><br /> <br /> <br />
				房屋地址：<font size="3" color="white"><s:property
						value="#session.house.house_address" /></font> <br /> <br /> <br />
				房间数量：<font size="3" color="white"><s:property
						value="#session.house.room_number" /></font>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
				适合居住人数：<font size="3" color="white"><s:property
						value="#session.house.live_number" /></font>
			</div>
			<div class="buttom-right">
				房东有话说:<br /> &nbsp&nbsp<font size="3" color="white" align="senter"><s:property
						value="#session.house.house_describe" /></font>
			</div>
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
