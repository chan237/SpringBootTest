<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Home</title>
</head>
<body>
<h3>Form Home</h3> 

<!-- GET 방식 등록 -->
<form action="/board/register"> 
    <input type="submit" value="register (GET)"> 
</form>

<!-- POST 방식 등록 -->
<form action="/board/register" method="post"> 
    <input type="submit" value="register (POST)"> 
</form> 

<!-- GET 방식 수정 -->
<form action="/board/modify"> 
    <input type="submit" value="modify (GET)"> 
</form>

<!-- POST 방식 수정 -->
<form action="/board/modify" method="post"> 
    <input type="submit" value="modify (POST)"> 
</form>

<!-- POST 방식 삭제 -->
<form action="/board/remove" method="post"> 
    <input type="submit" value="remove (POST)"> 
</form>

<!-- GET 방식 목록 -->
<form action="/board/list"> 
    <input type="submit" value="list (GET)"> 
</form> 

</body>
</html>
