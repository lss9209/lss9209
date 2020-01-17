<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<table class="table table-hover table-responsive table-striped table-bordered">
		<form action="reply.do" method="post">
			<input type = "hidden" name="bId" value="${reply_view.bId}">
			<input type = "hidden" name="bGroup" value="${reply_view.bGroup}">
			<input type = "hidden" name="bStep" value="${reply_view.bStep}">
			<input type = "hidden" name="bIndent" value="${reply_view.bIndent}">
			<tr class="success">
				<td> 번호 </td>
				<td> ${reply_view.bId} </td>
			</tr>
			
			<tr class="success">
				<td> 히트 </td>
				<td> ${reply_view.bHit} </td>
			</tr>
			
			<tr class="success">
				<td> 이름 </td>
				<td> <input type="text" name="bName" value="${reply_view.bName}"> </td>
			</tr>
			<tr class="success">
				<td> 제목 </td>
				<td> <input type="text" name="bTitle" value="${reply_view.bTitle}"> </td>
			</tr>
			<tr class="success">
				<td> 내용 </td>
				<td> <textarea name="bContent" value="${reply_view.bContent}" ></textarea> </td>
			</tr>
			<tr class="success">
				<td colspan="2"> <input type="submit" value="답변"> &nbsp;&nbsp; <a href="list.do">목록보기</a></td>
			</tr>
		</form>
	</table>     
</div>
</body>
</html>