<%@page import="java100.app.domain.Score"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@page import="java100.app.dao.ScoreDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<header>
	<nav class='navbar navbar-expand-lg navbar-light bg-light'>
		<a class='navbar-brand' href='../index.html'><img
			src='../images/bootstrap-solid.svg' width='30' height='30' alt=''>자바100기</a>
		<button class='navbar-toggler' type='button' data-toggle='collapse'
			data-target='#navbarNav' aria-controls='navbarNav'
			aria-expanded='false' aria-label='Toggle navigation'>
			<span class='navbar-toggler-icon'></span>
		</button>
		<div class='collapse navbar-collapse' id='navbarNav'>
			<ul class='navbar-nav'>
				<li class='nav-item active'><a class='nav-link'
					href='list.jsp'>성적<span class='sr-only'>(current)</span></a></li>
				<li class='nav-item'><a class='nav-link' href='../member/list.jsp'>회원</a>
				</li>
				<li class='nav-item'><a class='nav-link' href='../board/list.jsp'>게시판</a>
				</li>
				<li class='nav-item'><a class='nav-link' href='../room/list.jsp'>강의실</a>
				</li>
			</ul>
		</div>
	</nav>
</header>
