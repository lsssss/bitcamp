<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>    
<!DOCTYPE html>
<html>
<head>
<title>성적관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>성적 목록</h1>

<div class="toolbar" style ="float: right">
<form action="list" method="get" class="searchbox">
<input type="text" name="nm">
<button>검색</button>
</form>
</div>

<a href='form' class='btn btn-primary btn-sm'>추가</a>
<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>이름</th><th>합계</th><th>평균</th>
</tr>
</thead>
<tbody>

<c:forEach items="${list}" var="score">
    <tr>
        <td>${score.no}</td>
        <td><a href='${score.no}'>${score.name}</a></td>
        <td>${score.sum}</td>
        <td><fmt:formatNumber value="${score.aver}" pattern=".0"/></td>
    </tr>
</c:forEach>

</tbody>
</table>
<jsp:include page="../next.jsp"/>
<jsp:include page="../footer.jsp"/>

</div>

<%@ include file="../jslib.txt"%>

</body>
</html>











