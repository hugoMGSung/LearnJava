<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
<script src="https://cdn.ckeditor.com/ckeditor5/27.0.0/classic/ckeditor.js"></script>
<script>
	$(document).ready(function() {
		var mode = '<c:out value="${mode}"/>';

		if (mode == 'edit') {
			//입력 폼 셋팅
			$("#reg_id").prop('readonly', true);
			$("input:hidden[name='bid']").val(<c:out value="${boardContent.bid}"/>);
			$("input:hidden[name='mode']").val('<c:out value="${mode}"/>');
			$("#reg_id").val('<c:out value="${boardContent.reg_id}"/>');
			$("#title").val('<c:out value="${boardContent.title}"/>');
			$("#content").val('<c:out value="${boardContent.content}"/>');
			$("#tag").val('<c:out value="${boardContent.tag}"/>');
		}
	});

	$(document).on('click', '#btnSave', function(e) {
		e.preventDefault();
		$("#form").submit();
	});

	$(document).on('click', '#btnList',
		function(e) {
			e.preventDefault();
			location.href = "${pageContext.request.contextPath}/board/getBoardList";
		});
</script>
</head>
<body>
	<article>
		<div class="container" role="main">
			<h2>board Form</h2>
			<form name="form" id="form" role="form" method="post"
				action="${pageContext.request.contextPath}/board/setBoardData">
				<input type="hidden" name="bid" id="bid" value="0" />
				<input type="hidden" name="mode" id="mode" />
				<input type="hidden" name="cate_cd" id="cate_cd" value="1" />
				<div class="mb-3">
					<label for="title">제목</label> <input type="text"
						class="form-control" name="title" id="title"
						placeholder="제목을 입력해 주세요">
				</div>
			
				<div class="mb-3">
					<label for="reg_id">작성자</label> <input type="text"
						class="form-control" name="reg_id" id="reg_id"
						placeholder="이름을 입력해 주세요">
				</div>
			
				<div class="mb-3">
					<label for="content">내용</label>
					<textarea class="form-control" rows="5" name="content" id="content" style="display: none; height: 495px; width: 100%;""
						placeholder="내용을 입력해 주세요"></textarea>
					<script>
					ClassicEditor 
					  .create(document.querySelector('#content')) 
					  .then( editor => { 
					      window.ckeditor = editor; 
					  }) 
					  .catch( error => { 
					      console.error( error ); 
					  });

					</script>
				</div>
			
				<div class="mb-3">
					<label for="tag">TAG</label> <input type="text"
						class="form-control" name="tag" id="tag" placeholder="태그를 입력해 주세요">
				</div>
			</form>
			<div>
				<button type="button" class="btn btn-sm btn-primary" id="btnSave">저장</button>
				<button type="button" class="btn btn-sm btn-primary" id="btnList">목록</button>
			</div>
		</div>
	</article>
<%-- 	<script src="${pageContext.request.contextPath}/resources/common/js/ckeditor.js"></script> --%>
</body>
</html>