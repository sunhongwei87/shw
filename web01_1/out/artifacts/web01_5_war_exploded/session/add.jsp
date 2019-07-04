<%@page import="cn.itcast.d_session_javabean.Person"%>
<%@page import="cn.itcast.d_session_javabean.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.setAttribute("user", new User(1,"tom"));
		session.setAttribute("per", new Person(1,"jerry"));
	%>
</body>
</html>