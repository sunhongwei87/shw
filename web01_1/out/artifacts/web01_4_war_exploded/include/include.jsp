<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	静态包含页面<br>
	1.jsp中的内容
	<hr>
	<%@include file="/include/1.jsp"%>
	<hr>
	2.jsp中的内容
	<hr>
	<%@include file="/include/2.jsp"%>
</body>
</html>