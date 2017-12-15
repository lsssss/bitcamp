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

<h1>스크립트릿</h1>
<p>JSP 페이지에 자바 코드를 넣을때 사용한다.</p>
<h2>JSP 스크립트릿</h2>
<pre class="jsp">
&lt;%
int a= 10;
int b= 20;
out.printf("%d+%d=%d\n",a,b,a+b);
%>
</pre>

<h2>생성된 자바 코드</h2>
<pre class="java">

int a= 10;
int b= 20;
out.printf("%d+%d=%d\n",a,b,a+b);

</pre>
</body>
</html>	