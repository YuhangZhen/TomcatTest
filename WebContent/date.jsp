<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>甄宇航的毕设实验</title>

<p>今天的日期是: <%= (new java.util.Date()).toLocaleString()%>
</p>
</head>
<body>
<table border="1" align="center" width="60%">
<tr>
<td>姓名</td>
<td>年龄</td>
</tr>

<%
for (int i=0;i<10;i++){
%>
<tr>
<td>甄宇航</td>
<td>
<%= 25+i %>
</td>
</tr>
<tr>
<td>丁媛秀</td>
<td>
<%= 24+i %>
</td>
</tr>
<%
}
%>

</table>
</body>
</html>