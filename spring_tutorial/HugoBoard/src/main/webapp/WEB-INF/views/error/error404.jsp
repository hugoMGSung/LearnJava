<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	width: 600px;
	position: relative;
}
.err {
	color: #ffffff;
	font-family: 'Nunito Sans', sans-serif;
	font-size: 11rem;
	position: absolute;
	left: 20%;
	top: 8%;
}
.far {
	position: absolute;
	font-size: 8.5rem;
	left: 42%;
	top: 15%;
	color: #ffffff;
}
.err2 {
	color: #ffffff;
	font-family: 'Nunito Sans', sans-serif;
	font-size: 11rem;
	position: absolute;
	left: 68%;
	top: 8%;
}
.msg {
	text-align: center;
	font-family: 'NanumGothic';
	font-size: 1.6rem;
	position: absolute;
	left: 16%;
	top: 45%;
	width: 75%;
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
		<div class="err">4</div>
		<i class="far fa-question-circle fa-spin"></i>
		<div class="err2">4</div>
		<div class="msg">
		  페이지가 이동되었거나 삭제되었나요?<br/>
			요청하신 페이지는 존재하지 않습니다.<br/>관리자에게 문의하세요.
			<p>
				<a href="/board/getBoardList">홈</a>으로 돌아갑니다.
			</p>
		</div>
	</div>
</body>
</html>