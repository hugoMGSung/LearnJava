<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ERROR 404</title>
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@600;900&display=swap"
	rel="stylesheet">
<script src="https://kit.fontawesome.com/4b9ba14b0f.js"
	crossorigin="anonymous"></script>
<style>
body {
	background-color: #95c2de;
}

.mainbox {
	background-color: #95c2de;
	margin: auto;
	height: 600px;
	width: 90%;
	position: relative;
}

.err {
	color: #ffffff;
	font-family: 'Nunito Sans', sans-serif;
	font-size: 11rem;
	text-align: center;
	left: 20%;
	top: 8%;
	left: 20%;
}

.far {
	position: absolute;
	font-size: 8.5rem;
	left: 42%;
	top: 15%;
	color: #ffffff;
}

.msg {
	text-align: center;
	font-family: 'NanumGothic';
	font-size: 1.6rem;
	position: absolute;
	text-align: center;
	top: 45%;
	width: 100%;
}

.exheader {
  font-family: 'NanumGothic';
  font-size: 12px;
}

.excont {
  font-family: 'NanumGothic';
  text-align: left;
  font-size: 12px;
}

a {
	text-decoration: none;
	color: white;
}

a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<div class="mainbox">
		<div class="err">500</div>

		<div class="msg">
			데이터처리과정에 문제가 발생했습니다.<br />관리자에게 문의하세요.
			<p class="exheader">
				${exception.getMessage()}				
			</p>
			<ul>
          <c:forEach items="${exception.getStackTrace()}" var="stack">
            <li class="excont">${stack.toString()}</li>
          </c:forEach>
        </ul>
			<p>
				<a href="/board/getBoardList">홈</a>으로 돌아갑니다.
			</p>
		</div>
	</div>
</body>
</html>