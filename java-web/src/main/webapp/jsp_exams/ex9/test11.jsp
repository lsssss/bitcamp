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

	<h3>c:import 태그</h3>
	<p>HTTP 요청을 수행하는 태그이다.</p>
	<br>
	<%--
	<c:import url="요청 URL" var="결과 값을 저장할 때 사용할 이름"/>
 --%>


	<c:url var="url" value="http://www.zdnet.co.kr/news/news_view.asp">
		<c:param name="article_id" value="20171217175836" />
		<c:param name="lo" value="z36" />
	</c:url>
	<p>URL: ${url}</p>
	<%--서버에 받은 결과는 var에 지정된 result라는 이름을 저장한다. --%>
	<c:import url="${url}" var="result"/>
	
	<textarea rows="15" cols="80"> ${result} </textarea>
	

	<%--http://www.zdnet.co.kr/news/news_view.asp?artice_id=20171218185836&lo=z36 --%>



</body>
</html>

