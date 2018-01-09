<%@ page language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<title>도서등록</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>

<jsp:include page="../header.jsp"/>

<h1>도서 등록</h1>

<form action="add" method='post' enctype="multipart/form-data">

<div class='form-group row'>
<label for='title' class='col-sm-2 col-form-label'>제목</label>
<div class='col-sm-10'>
<input class='form-control' id='booktitle' type='text' name='booktitle'>
</div>
</div>

<div class='form-group row'>
<label for='title' class='col-sm-2 col-form-label'>출판사</label>
<div class='col-sm-10'>
<input class='form-control' id='publisher' type='text' name='publisher'>
</div>
</div>


<div class='form-group row'>
<label for='title' class='col-sm-2 col-form-label'>출판일</label>
<div class='col-sm-10'>
<input class='form-control' id='publicationdate' type='date' name='publicationdate'>
</div>
</div>
<div class='form-group row'>
<label for='title' class='col-sm-2 col-form-label'>가격</label>
<div class='col-sm-10'>
<input class='form-control' id='price' type='text' name='price'>
</div>
</div>

<div class='form-group row'>
<label for='content' class='col-sm-2 col-form-label'>내용</label>
<div class='col-sm-10'>
<textarea class='form-control' id='information' name='information'></textarea>
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
<button class='btn btn-primary btn-sm'>등록</button>
</div>
</div>
</form>

<jsp:include page="../footer.jsp"/>

</div>

<%@ include file="../jslib.jsp"%>

</body>
</html>
    