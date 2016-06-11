<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style >
body{text-align:center}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加新的吉他</title>
</head>
<body>
	<h2>请输入新吉他的数据</h2>
	<form method="post"action="AddGuitarServlet">
		序&nbsp;&nbsp;&nbsp;号：   <input type="text" name="serialNumber"><br /> 
		<br>
		制造者：<input type="text" name="builder"><br /> 
		<br>
		价&nbsp;&nbsp;&nbsp;格：<input type="text" name="price"><br />
		 <br>
		模&nbsp;&nbsp;&nbsp;式：<input type="text" name="model"><br />
		<br> 
		类&nbsp;&nbsp;&nbsp;型：<input type="text" name="type"><br /> 
		<br>
		背&nbsp;&nbsp;&nbsp;木：<input type="text" name="backWood"><br />
		<br>
		 顶&nbsp;&nbsp;&nbsp;木：<input type="text" name="topWood"><br /> 
		 <br>
		<input type="submit" value="添加">
	</form>
</body>
</html>