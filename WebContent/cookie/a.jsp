<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>保存COOKIES</h1>
<h2>尝试保存cookie</h2>
<%
	Cookie cookie1 = new Cookie("a","A");
	response.addCookie(cookie1);
	Cookie cookie2 = new Cookie("b","B");
	response.addCookie(cookie2);
	
%>

</body>
</html>