<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<!DOCTYPE html>
<html>
<head>
<title>회원관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="../header.jsp"/>
<h1>회원 상세정보</h1>
<form action='add' method='post'>
<div class='form-group row'>
<label for='name' class='col-sm-2 col-form-label'>이름</label>
<div class='col-sm-10'>
<input class='form-control' id='name' type='text' name='name'>
</div>
</div>
<div class='form-group row'>
<label for='email' class='col-sm-2 col-form-label'>이메일</label>
<div class='col-sm-10'>
<input class='form-control' id='kor' type='text' name='email'>
</div>
</div>
<div class='form-group row'>
<label for='pwd' class='col-sm-2 col-form-label'>패스워드</label>
<div class='col-sm-10'>
<input class='form-control' id='pwd' type='password' name='pwd'>
</div>
</div>
<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>추가</button>
</div>
</div>
</form>
<jsp:include page="../footer.jsp"/>
</div>
<%@ include file="../jslib.jsp"%>
</body>
</html>
