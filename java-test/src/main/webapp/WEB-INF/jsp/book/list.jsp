<%@page import="test100.app.domain.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<title>도서 관리</title>
<link rel='stylesheet'
	href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
	
	<div class='container'>
		<jsp:include page="../header.jsp" />

		<h1>도서 목록</h1>


		<p>
			<a href='form' class='btn btn-primary btn-sm'>추가</a>
		</p>

		<table class='table table-hover'>
			<thead>
				<tr class='tr2'>
					<th class='th1'>사진</th>
					<th class='th1'>도서명</th>
					<th class='th1'>도서 제목</th>
					<th class='th1'>출판사</th>
					<th class='th1'>가격</th>
				</tr>
			</thead>
			<tbody>
			
				<c:forEach items="${list}" var="book">
					<c:set var="booktitle" value="${fn:length(book.booktitle)== 0 ? '(제목이 없습니다.)' : book.booktitle}" />
						<tr id='tr1' class='tr1' onclick="location.href='${book.bookno}'" style="cursor:pointer;">
						
						<td class='td2'>
           				 <img src="${contextPath}/download/${book.bookphoto}" style="width:auto; height:150px">
    				    </td>
						
						
						<td id='td1' class='td1' >${book.bookno}</td>
						<td id='td1' class='td1'><span
								class="d-inline-block text-truncate" style="max-width: 300px">
									${booktitle} </span></td>
									
						<td id='td1' class='td1'>${book.publisher}</td>
						
						
						<td id='td1' class='td1'>${book.price}</td>
						
						</tr>
				</c:forEach>
			</tbody>
			<tr>
			</tr>
		</table>
		

		
		<jsp:include page="../next.jsp" />
		<jsp:include page="../footer.jsp"/>
	</div>
	
	
	<%@ include file="../jslib.jsp"%>

</body>
</html>
