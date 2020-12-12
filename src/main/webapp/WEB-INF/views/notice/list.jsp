<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>공지게시판</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>공지게시판</h1>
		<table id="list" class="table">
			<thead>
				<tr>
					<th>번호</th>
					<th>날짜</th>
					<th>제목</th>	
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="u">
					<tr>
						<td>${u.id}</td>
						<td>${u.postdate}</td>
						<td>${u.title}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>