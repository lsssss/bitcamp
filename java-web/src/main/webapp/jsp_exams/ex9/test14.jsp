<%@page import="org.apache.taglibs.standard.lang.jstl.test.PageContextImpl"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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
	<h3>fmt:parseDate 태그</h3>
	<p>문자열을 java.util.Date 객체로 바꿔주는 태그이다.</p>
	<br>
	
	<%--
	<fmt:parseDate value="문자열" pattern="문자열형식" var="생성된 객체를 저장할 때 사용할 이름"/>
 	--%>
 	<fmt:parseDate value="2017-12-19" pattern="yyyy-MM-dd" var="date1"/>
 	<fmt:parseDate value="2017-12-20" pattern="yyyy-MM-dd" var="date2"/>
 	<fmt:parseDate value="2017-12-21" pattern="yyyy-MM-dd" var="date3"/>
	
	
	<%
	java.util.Date d = (java.util.Date)pageContext.getAttribute("date1");
	%>
	
	<%=d.toString() %><br>
	
	
		<h3>fmt:format 태그</h3>
	<p>문자열을 java.util.Date 객체로 바꿔주는 태그이다.</p>
	<br>
	
	<%--
	<fmt:forMatDate value="날짜객체" pattern="출력 문자 열형식" />
 	--%>
	
	<%
	pageContext.setAttribute("today",new java.util.Date());
	%>
	
	<fmt:formatDate value="${today}" pattern="dd/MM/YYYY"/><br>
	<fmt:formatDate value="${today}" pattern="yyyy-MM-dd"/><br>

</body>
</html>

