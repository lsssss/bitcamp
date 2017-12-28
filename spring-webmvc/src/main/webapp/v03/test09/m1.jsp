<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>v03/test09</title>
</head>
<body>

<h2>ServletRequest 보관소</h2>

name: ${requestScope.name}<br>
age: ${requestScope.age}<br>
working: ${requestScope.working}<br>



<h2>HttpSession보관소</h2>
name: ${sessionScope.name}<br>
age: ${sessionScope.age}<br>
working: ${sessionScope.working}<br>


</body>
</html>









