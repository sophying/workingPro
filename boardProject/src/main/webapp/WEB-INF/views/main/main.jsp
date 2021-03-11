<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>workingProject</title>
<!-- 북마크 시 보여지는 title -->
<meta name="description" content="workingProject by hyeRyun">
<meta name="author" content="hyeRyun">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<link rel="stylesheet" href="/resources/css/main.css">
<link href="/resources/js/main.js" />
</head>
<body>
	<h1 id="title">김혜련의 Spring Test</h1>
	<form class="row g-3" id="memberJoin">
		<div class="col-md-4 d-block">
			<label for="inputEmail4" class="form-label">Email</label>
			<input type="email" class="form-control" id="email" name= "email">
		</div>
		<div class="col-md-4 d-block">
			<label for="inputPassword4" class="form-label">Password</label>
			<input type="password" class="form-control" id="pass" name="pass">
		</div>
		<div class="col-12">
			<button type="submit" class="btn btn-primary" id="save">저장</button>
		</div>
	</form>

</body>
</html>