<%@page contentType="text/html;charset=utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>发布房屋</title>
<link href="../css/publishhouse.css" rel="stylesheet" type="text/css" />
<script src="../js/jquery-1.8.3.js" type="text/javascript"></script>
<script type="text/javascript">
	
</script>
</head>
<body>
	<div class="bd">
		<div class="houseinfo_top">
			<img class="rt" src="../images/register_top.gif"></img>
		</div>
		<div class="huanying" align="center">
			尊敬的房东<font color="red"><s:property value="#session.yonghuming" /></font>,您好，欢迎进入房屋发布界面
		</div>
		<div class="fb">
			<form action="<s:url namespace='/dd' action='house_createHouseAction'/>" method="post" enctype="multipart/form-data">
				<table>
					<tr>
						<td class="td-left">房&nbsp屋&nbsp类&nbsp别&nbsp:
						<select name="house_type">
						 <option value="1">别墅</option>
						 <option value="2">民宿</option>
						 <option value="3">公寓</option>
						 <option value="4">普通</option>
						 <option value="5">其他</option>
						</select></td>
						<td class="td-right1">房&nbsp屋&nbsp名:<input type="text" name="house_name"/></td>
					</tr>
					<tr>
						<td class="td-left">房屋面积(m²)<input type="text" name="house_area"/></td>
						<td class="td-right1">房间数量:<input type="text" name="room_number"/></td>
					</tr>
					<tr>
						<td class="td-left">适&nbsp合&nbsp人&nbsp数&nbsp:<input type="text" name="live_number"/></td>
						<td class="td-right">相关设施:<input type="text" name="room_sheshi"/></td>
					</tr>
					<tr>
						<td class="td-left">房&nbsp屋&nbsp地&nbsp址&nbsp:<input
							type="text" name="house_address"/></td>
						<td class="td-right">价格(元/天):<input type="text" name="house_price"/></td>
						<td class="td-right2">房屋描述:<input type="text" name="house_describe" style = width:230px;height:160px;border-radius:40px 40px 40px 40px;></input>
						</td>
					</tr>
				</table>
				<br/><br/>
				<div class="dimg" >
					请选择图片：<input type="file" name="upload" /> 
					请选择图片：<input type="file" name="upload" />
					 请选择图片：<input type="file" name="upload" /><br/><br/> 
					 请选择图片：<input type="file" name="upload" /> 
					 请选择图片：<input type="file" name="upload" /> 
					 请选择图片：<input type="file" name="upload" />
				</div>
				<br/><br/>
				<input class="butn" type="submit" value="发布我的房屋" />
			</form>
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
