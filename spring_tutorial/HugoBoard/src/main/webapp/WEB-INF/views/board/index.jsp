<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
<c:url var="getBoardListUrl" value="/board/getBoardList"></c:url>
<script>
  $(document).on('click', '#btnWriteForm', function(e){
    e.preventDefault();
    location.href = "${pageContext.request.contextPath}/board/getBoardForm";
  });
  
  function fn_contentView(bid) {
	  var url = "${pageContext.request.contextPath}/board/getBoardContent";
	  url = url + "?bid=" + bid;
	  location.href = url;
  }
  
	//이전 버튼 이벤트
	function fn_prev(page, range, rangeSize) {
		var page = ((range - 2) * rangeSize) + 1;
		var range = range - 1;
		
		var url = "${getBoardList}"; // c:url 사용
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		
		location.href = url;
	}

	//페이지 번호 클릭
	function fn_pagination(page, range, rangeSize, searchType, keyword) {
		var url = "${getBoardList}"; // c:url 사용
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		
		location.href = url;  
	}

	//다음 버튼 이벤트
	function fn_next(page, range, rangeSize) {
		var page = parseInt((range * rangeSize)) + 1;
		var range = parseInt(range) + 1;
		var url = "${getBoardList}"; // c:url 사용
		url = url + "?page=" + page;
		url = url + "&range=" + range;
		
		location.href = url;
	}
	
	$(document).on('click', '#btnSearch', function(e){
	    e.preventDefault();
	    var url = "${getBoardList}"; // c:url 사용
	    url = url + "?searchType=" + $('#searchType').val();
	    url = url + "&keyword=" + $('#keyword').val();
	    location.href = url;
	    console.log(url);
  }); 
</script>
</head>
<body>
	<article>
		<div class="container">
			<div class="table-responsive">
				<table class="table table-sm">
					<h2>board list</h2>
					<table class="table table-striped">
						<colgroup>
							<col style="width: 5%;" />
							<col style="width: auto;" />
							<col style="width: 15%;" />
							<col style="width: 13%;" />
							<col style="width: 17%;" />
						</colgroup>
						<thead>
							<tr>
								<th>NO</th>
								<th>글제목</th>
								<th>작성자</th>
								<th>조회수</th>
								<th>작성일</th>
							</tr>
						</thead>
						<tbody>
							<c:choose>
								<c:when test="${empty boardList }">
									<tr>
										<td colspan="5" align="center">데이터가 없습니다.</td>
									</tr>
								</c:when>
								<c:when test="${!empty boardList}">
									<c:forEach var="list" items="${boardList}">
										<tr>
											<td><c:out value="${list.bid}" /></td>
											<td><a href="#" onclick="fn_contentView(${list.bid})">
													<c:out value="${list.title}" />
											</a></td>
											<td><c:out value="${list.reg_id}" /></td>
											<td><c:out value="${list.view_cnt}" /></td>
											<td><c:out value="${list.reg_dt}" /></td>
										</tr>
									</c:forEach>
								</c:when>
							</c:choose>
						</tbody>
					</table>
				</table>
			</div>
			<!-- 글쓰기 버튼 -->
			<div>
				<button type="button" class="btn btn-sm btn-primary"
					id="btnWriteForm">글쓰기</button>

				<div class="form-group row justify-content-center">
					<div class="w100" style="padding-right: 10px">
						<select class="form-control form-control-sm" name="searchType"
							id="searchType">
							<option value="title">제목</option>
							<option value="Content">본문</option>
							<option value="reg_id">작성자</option>
						</select>
					</div>
					<div class="w300" style="padding-right: 10px">
						<input type="text" class="form-control form-control-sm"
							name="keyword" id="keyword">
					</div>
					<div>
						<button class="btn btn-sm btn-primary" name="btnSearch"
							id="btnSearch">검색</button>
					</div>
				</div>
			</div>

			<!-- pagination{s} -->
			<div id="paginationBox">
				<ul class="pagination justify-content-center">
					<c:if test="${pagination.prev}">
						<li class="page-item"><a class="page-link" href="#"
							onClick="fn_prev('${pagination.page}', '${pagination.range}', '${pagination.rangeSize}')">Previous</a></li>
					</c:if>

					<c:forEach begin="${pagination.startPage}"
						end="${pagination.endPage}" var="idx">
						<li
							class="page-item <c:out value="${pagination.page == idx ? 'active' : ''}"/> ">
							<a class="page-link" href="#"
							onClick="fn_pagination('${idx}', '${pagination.range}', '${pagination.rangeSize}')">${idx}</a>
						</li>
					</c:forEach>

					<c:if test="${pagination.next}">
						<li class="page-item"><a class="page-link" href="#"
							onClick="fn_next('${pagination.range}', '${pagination.range}', '${pagination.rangeSize}')">Next</a>
						</li>
					</c:if>
				</ul>
			</div>
			<!-- pagination{e} -->
		</div>
	</article>

</body>
</html>