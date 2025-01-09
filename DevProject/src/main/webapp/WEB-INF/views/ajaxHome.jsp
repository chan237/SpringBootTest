<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script 
src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript"> 
$(document).ready(function() { 
 	//putbtn 클릭하면 이 함수를 작동시켜줘 (서버에 대이터를 전송(ajax)하고 전송성공유무를 리턴받아서 출력한다.)
	$("#putBtn").on("click", function() { 
		//사용자가 입력한 데이터를 읽어와서 객체를 만들 것
		var boardNo = $("#boardNo"); 
		var title = $("#title"); 
		var content = $("#content"); 
		var writer = $("#writer"); 
		//사용자가 입력한 값을 가져온다.
		var boardNoVal = boardNo.val(); 
		var titleVal = title.val(); 
		var contentVal = content.val(); 
		var writerVal = writer.val(); 
		
		//전송할 객체를 만든다.
		var boardObject = { 
			boardNo : boardNoVal, 
			title : titleVal, 
			content : contentVal, 
			writer : writerVal 
			}; 
 
	$.ajax({ 
		type : "put", 
		url : "/board/" + boardNoVal, 
		data : JSON.stringify(boardObject), 
		contentType : "application/json; charset=utf-8", 
		success : function(result) { 
			console.log("result: " + result); 
				if (result === "SUCCESS") { 
					alert("SUCCESS"); 
				}
			}
		}); 
	}); 
	
	$("#putHeaderBtn").on("click", function() { 
		var boardNo = $("#boardNo"); 
		var title = $("#title"); 
		var content = $("#content"); 
		var writer = $("#writer"); 

		var boardNoVal = boardNo.val(); 
		var titleVal = title.val(); 
		var contentVal = content.val(); 
		var writerVal = writer.val(); 
 
		var boardObject = { 
			boardNo : boardNoVal, 
			title : titleVal, 
			content : contentVal, 
			writer : writerVal 
			};
		
		$.ajax({
			type : "put", 
			url : "/board/" + boardNoVal, 
			headers : { 
			"X-HTTP-Method-Override" : "PUT" 
			}, 
			data : JSON.stringify(boardObject), 
			contentType : "application/json; charset=utf-8", 
			success : function(result) { 
				console.log("result: " + result); 
				if (result === "SUCCESS") { 
					alert("SUCCESS"); 
					} 
				} 
			}); 
		}); 
	 
	}); 
</script>
<body>
	<h1>AjaxHome page</h1>
	<form>
		boardNo: <input type="text" name="boardNo" value="" id="boardNo"><br>
		title: <input type="text" name="title" value="" id="title"><br>
		content: <input type="text" name="content" value="" id="content"><br>
		writer: <input type="text" name="writer" value="" id="writer"><br>
	</form>

	<div>
		<button id="putBtn">수정(put)</button>
		<button id="putHeaderBtn">수정(put with header)</button>
	</div>
</body>
</html>