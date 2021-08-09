<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html lang="kr">
<head>
<meta charset="utf-8">
<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.5.1.js"
  integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc="
  crossorigin="anonymous"></script>
<!--  BootStrap CSS -->
<link rel="stylesheet"
  href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
  integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
  crossorigin="anonymous">
<!-- Bootstrap JS -->
<script
  src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
  crossorigin="anonymous"></script>
<!-- common CSS -->
<link rel="stylesheet"
	href="<c:url value='/resources/common/css/common.css'/>">
<style>
body {
	padding: 0px
}

#tile_header {
	width: 100%;
}

#tile_body {
	width: 100%;
	float: left;
}
</style>
</head>
<body>
	<div id="tile_header">
		<tiles:insertAttribute name="tile_header" />
	</div>
	<div id="tile_body">
		<tiles:insertAttribute name="tile_body" />
	</div>
</body>
</html>