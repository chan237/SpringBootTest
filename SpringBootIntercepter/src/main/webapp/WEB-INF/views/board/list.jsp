<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인터셉터 활용 - 접근 로그 저장</title>
</head>
<body>
	<h3>게시글 목록</h3>
	<a href="register">New</a>
	<table border="1">
		<tr>
			<th align="center" width="50">NO</th>
			<th align="center" width="300">TITLE</th>
			<th align="center" width="100">WRITER</th>
			<th align="center" width="180">REGDATE</th>
		</tr>
		<c:forEach items="${list}" var="board">
			<tr>
				<td align="center">${board.boardNo}</td>
				<td align="left"><a href="/board/read?boardNo=${board.boardNo}">${board.title}</a></td>
				<td align="right">${board.writer}</td>
				<td align="center"><fmt:formatDate pattern="yyyy-MM-dd HH:mm"
						value="${board.regDate}" /></td>
			</tr>
		</c:forEach>
	</table>
	<script> 
var result = "${msg}"; 
if (result == "SUCCESS") 
{ alert("처리가 
완료되었습니다."); 
} 
</script>
</body>
</html>