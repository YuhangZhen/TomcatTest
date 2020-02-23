<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>甄宇航的毕设实验之动态时间</title>
</head>
<body>
此时的时间为
<span id = "times" >

</span>
</body>
<script type="text/javascript">
	function getTime(){
		var date = new Date();
		var d1= date.toLocaleString();
		var div1=document.getElementById("times");
		div1.innerHTML= d1;
	}
	setInterval("getTime();",1000);
	</script>
</html>