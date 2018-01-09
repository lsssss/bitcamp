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

		<div class="toolbar" style="float: right">
			<form action="list" method="get" class="searchbox">
				<input type="text" name="word">
				<button>검색</button>
			</form>
		</div>

		<p>
			<a href='form' class='btn btn-primary btn-sm'>추가</a>
		</p>

		<table class='table table-hover'>
			<thead>
				<tr>
					<th>도서 번호</th>
					<th>도서 제목</th>
					<th>출판사</th>
					<th>가격</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${list}" var="book">
					<c:set var="booktitle"
						value="${fn:length(book.booktitle)== 0 ? '(제목이 없습니다.)' : book.booktitle}" />
					<tr>
						<td>${book.bookno}</td>
						<td>><a href='${book.bookno}'><span class="d-inline-block text-truncate"
							style="max-width: 300px"> ${booktitle} </span></a></td>
						<td>${book.publisher}</td>
						<td>${book.price}</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<jsp:include page="../next.jsp" />
		<jsp:include page="../footer.jsp" />

	</div>

	<%@ include file="../jslib.jsp"%>

</body>
</html>
