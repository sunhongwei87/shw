<%--
  Created by IntelliJ IDEA.
  User: 孙宏伟
  Date: 2018/12/22
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  首页<br>
  <a href="${pageContext.request.contextPath }/life/session_invalidate.jsp">session销毁</a><br>
  <a href="${pageContext.request.contextPath }/attr/add.jsp">添加属性</a><br>
  <a href="${pageContext.request.contextPath }/attr/replace.jsp">替换属性</a><br>
  <a href="${pageContext.request.contextPath }/attr/remove.jsp">删除属性</a><br>
  <a href="${pageContext.request.contextPath }/session/add.jsp">javabean绑定到了session中</a><br>
  <a href="${pageContext.request.contextPath }/session/1.jsp">获取session中javabean</a><br>
  <a href="${pageContext.request.contextPath }/session/remove.jsp">javabean从session中解绑了</a><br>
  </body>
</html>
