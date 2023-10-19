<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Book Info</title>
<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	    <h2 class="text-center">Book Info</h2>
		<table class="table table-bordered table table-hover">
			<tr><td>title :</td><td>${books.title}</td></tr>
			<tr><td>author :</td><td>${books.author}</td></tr>
			<tr><td>isbn :</td><td>${books.isbn}</td></tr>
			<tr><td>genre :</td><td>${books.genre}</td></tr>
			<tr><td>created_at :</td><td>${books.created_at}</td></tr>
		</table>
	</div>
</body>
</html>












