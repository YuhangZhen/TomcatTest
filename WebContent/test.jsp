<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! int fontSize; %> 
<!DOCTYPE html>
<html>
	<head>
	<!-- <meta http-equiv="refresh"  content="5;url=main.jsp" > -->
		<title>甄宇航的毕设实验</title>
		<!--  <frameset rows="50%,50%89/98"> 
			<frame name="top" src="jiafatest/form.jsp" />
			<frame name="bottom" src="jiafatest/result.jsp"/>
		</frameset>
		-->
	</head>
	<body>
	<input type="button" value="try" onclick="href1();" />
		
	</body> 
		<script type="text/javascript" >
			function href1(){
				var flag = confirm("确认跳转？");
				if(flag == true){
					location.href="date.jsp";
				}else{
					window.open("main.jsp"," ","width=200,height=200")
				}
			}
			var str = "abcdefg";
			document.write(str.length);
			document.write("<hr>");
			document.write(str.bold());
			var str1 = "link"
			document.write(str1.link("date.jsp"));
			document.write("<hr>");
			document.write(location.href);
		</script>
</html>