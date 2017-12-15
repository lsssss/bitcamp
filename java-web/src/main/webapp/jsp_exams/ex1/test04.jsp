<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="text/html; charset=UTF-8">
<title>JSP예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>

<h1>템플릿 데이터</h1>
<p>JSP 파일에 그냥 작성하는 모든 텍스트는 자바의 출력 코드로 만들어진다.</p>
<%--JSP페이지에 주석을 넣고 싶은가? 이렇게 하라! 이것은 자바소스코드로 바뀌지 않는다 그냥 버려진다. --%>
<h2>JSP 템플릿 데이터</h2>
<pre class="jsp">
안녕하세요 !
JSP에 오신 걸 환영합니다.
</pre>

<h2>생성된 자바 코드</h2>
<pre class="java">
out.wirte("안녕하세요 !\n");
out.wirte("JSP에 오신걸 환영 합니다.\n");
</pre>
</body>
</html>	