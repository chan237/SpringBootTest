<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 업로드 폼 요청처리</title>
</head>
<body>
	<h2>파일 업로드 폼 요청처리</h2>
	<form action="/registerFileUp01" method="post"
		enctype="multipart/form-data">
		1. <input type="file" name="picture"> <input type="submit">
	</form>
	<form action="/registerFileUp02" method="post"
		enctype="multipart/form-data">
		2. userId: <input type="text" name="userId" value="hong"><br>
		2.password: <input type="text" name="password" value="1234"><br>
		<input type="file" name="picture"> <input type="submit">
	</form>
	<form action="/registerFileUp03" method="post"
		enctype="multipart/form-data">
		3. userId: <input type="text" name="userId" value="hong"><br>
		3.password: <input type="text" name="password" value="1234"><br>
		<input type="file" name="picture"> <input type="submit">
	</form>
	<form action="/registerFileUp04" method="post"
		enctype="multipart/form-data">
		4. userId: <input type="text" name="userId" value="hong"><br>
		4.password: <input type="text" name="password" value="1234"><br>
		<input type="file" name="picture"> <input type="submit">
	</form>
	<form action="/registerFileUp05" method="post"
		enctype="multipart/form-data">
		5. userId: <input type="text" name="userId" value="hong"><br>
		5.password: <input type="text" name="password" value="1234"><br>
		<input type="file" name="picture"> <br> <input
			type="file" name="picture2"> <input type="submit">
	</form>
	<form action="/registerFileUp06" method="post"
		enctype="multipart/form-data">
		6-1.userId: <input type="text" name="userId" value="hong"><br>
		6-1.password: <input type="text" name="password" value="1234"><br>
	</form>
	<input type="file" name="pictureList[0]">
	<br>
	<input type="file" name="pictureList[1]">
	<input type="submit">

	<form action="/registerFileUp06" method="post"
		enctype="multipart/form-data">
		6-2.userId: <input type="text" name="userId" value="hong1"><br>
		6-2.password: <input type="text" name="password" value="12345"><br>
	</form>
	<input type="file" name="pictureList">
	<br>
	<input type="file" name="pictureList">
	<input type="submit">
	<form action="/registerFileUp07" method="post"
		enctype="multipart/form-data">
		7. userId: <input type="text" name="userId" value="hong"><br>
		7.password: <input type="text" name="password" value="1234"><br>
	</form>
	<input type="file" name="pictureList[0]">
	<br>
	<input type="file" name="pictureList[1]">
	<input type="submit">

	<form action="/registerFileUp08" method="post"
		enctype="multipart/form-data">
		8. userId: <input type="text" name="userId" value="hong"><br>
		8.password: <input type="text" name="password" value="1234"><br>

		<input type="file" name="pictureList" multiple> <input
			type="submit">
	</form>
</body>
</html>
