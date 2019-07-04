<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=j %>

	<%
		int i = 3;
		System.out.println(i);

	%>

	<%=i+4 %>
	
	
	<%
		out.print("我是jsp中的java代码");
		add();
		
	%>
	
	<%!
		int j = 4;
		void add(){
			System.out.print("我是java代码");
		}
	%>
	
	<%
		out.print(j);
	%>
</body>
</html>