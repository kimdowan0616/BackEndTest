<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Book Management</title>
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


</head>
<body>
	<div class="container">
		<h2 class="text-center">Book List</h2>
		<table class="table table-bordered table table-hover"> 
			<thead> 
				<tr> 
					<th>id</th> 
					<th>title</th> 
					<th>author</th>
					<th>isbn</th>
					<th>genre</th>
					<th>created_at</th>
				</tr> 
		</thead> 
		<tbody> 
			<c:forEach var="book" items="${bookList}">
				<tr>
					<td>
					 	<a href="getBook.do?id=${book.id}">${book.id}</a>
					 </td>
					 <td>${book.title}</td>
					<td>${book.author}</td>
					<td>${book.isbn}</td>
					<td>${book.genre}</td>
					<td>${book.created_at}</td>
				</tr>
			</c:forEach>
		</tbody> 
	</table>
	</div>
</body>
</html>

































