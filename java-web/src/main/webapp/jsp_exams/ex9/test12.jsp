<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
	<h1>JSTL(JSP Standard Tag Library)</h1>
	특정 자바 코드를 생성하는 태그이다
	<br>

	<h2>Core 라이브러리</h2>

	<h3>c:redirect</h3>
	<p>특정 페이지로 다시 요청할 것을 클라이언트에게 응답하는 태그이다.</p>
	<br>
	<%--
	<c:redirect url="요청 URL"/>
 --%>

	<c:if test="${empty param.name}">
	<c:redirect url="error.jsp"></c:redirect>
	</c:if>
	
	${param.name} 님 환영합니다.


</body>
</html>

