<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<title>게시판</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>게시물 상세정보</h1>

<c:if test="${not empty book}">
        <form action='update' method='post' enctype="multipart/form-data">
        <div class='form-group row'>
        <label for='bookno' class='col-sm-2 col-form-label'>번호</label>
        <div class='col-sm-10'>
        <input class='form-control' readonly id='bookno' type='number' 
                name='bookno' value='${book.bookno}'>
        </div>
        </div>
        <div class='form-group row'>
        <label for='booktitle' class='col-sm-2 col-form-label'>제목</label>
        <div class='col-sm-10'>
        <input class='form-control' id='booktitle' type='text' 
                name='booktitle' value='${book.booktitle}'>
        </div>
        </div>
        
             <div class='form-group row'>
        <label for='publisher' class='col-sm-2 col-form-label'>출판사</label>
        <div class='col-sm-10'>
        <input class='form-control' id='publisher' type='text' 
                name='publisher' value='${book.publisher}'>
        </div>
        </div>
        
    
        <div class='form-group row'>
        <label for='publicationdate' class='col-sm-2 col-form-label'>출판일</label>
        <div class='col-sm-10'>
        <input class='form-control' id='publicationdate' type='date' name='publicationdate'
                value='${book.publicationdate}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='price' class='col-sm-2 col-form-label'>가격</label>
        <div class='col-sm-10'>
        <input class='form-control' id='price' type='number' name='price'
                value='${book.price}'>
        </div>
        </div>
        
        <div class='form-group row'>
        <label for='information' class='col-sm-2 col-form-label'>책정보</label>
        <div class='col-sm-10'>
        <textarea class='form-control' id='information' 
                    name='information'>${book.information}</textarea>
        </div>
        </div>
        
      	<div class='form-group row'>
        <label class='col-sm-2 col-form-label'>첨부파일  </label>
        <div class='col-sm-10'>
        <c:forEach items="${book.bookphoto}" var="file">
        	<a href="${contextPath}/download/${book.bookphoto}">${book.bookphoto}</a><br>
            <img src="${contextPath}/download/${book.bookphoto}" style="width:40%; height:auto">
        </c:forEach>
        </div>
        </div>
        
        
        
        <div class='form-group row'>
		<label for='file' class='col-sm-2 col-form-label'>사진</label>
		<div class='col-sm-10'>
		<input type="file" class="form-control-file" id="file" name="file">
		</div>
		</div>

        
        <div class='form-group row'>
        <div class='col-sm-10'>
        <button class='btn btn-primary btn-sm'>변경</button>
        <a href='delete?no=${book.bookno}' class='btn btn-primary btn-sm'>삭제</a>
        </div>
        </div>
        </form>
</c:if>
<c:if test="${empty book}">
        <p>'${param.bookno}'번 게시물이 없습니다.</p>
</c:if>

<jsp:include page="../footer.jsp"/>

</div>

<%@ include file="../jslib.jsp"%>

</body>
</html>
