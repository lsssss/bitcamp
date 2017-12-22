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

	<h3>c:url 태그</h3>
	<p>url을 생성하는 태그이다.</p>
	<br>
	<%--
<c:url var="변수명" value="URL">
<c:param name="파라미터명" value="값" />
<c:param name="파라미터명" value="값" />
</c:url>
 --%>


	<c:url var="url" value="https://search.daum.net/search">
		<c:param name="w" value="tot" />
		<c:param name="DA" value="YZR" />
		<c:param name="t_nil_searchbox" value="btn" />
		<c:param name="t_nil_searchbox" value="btn" />
		<c:param name="sug"  value=""/>
		<c:param name="sugo" value=""/>
		<c:param name="q" value="java"/>
	</c:url>
	<p>
	URL: ${url}
	</p>

	<%--https://search.daum.net/search?w=tot&DA=YZR&t__nil_searchbox=btn&sug=&sugo=&q=%EC%9E%90%EB%B0%94 --%>



</body>
</html>

