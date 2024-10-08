<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Forget Password</title>
</head>
<body>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-12 col-md-5">
				<form method="post" action="${pageContext.request.contextPath}/forgetPassword">
					<c:if test="${error != null}">
						<div class="alert alert-danger">${error}</div>
					</c:if>
					<h2 class="text-center mb-4">Reset Password</h2>
					<div class="form-group mb-3">
						<label for="username">Username:</label> <input type="text"
							id="username" name="username" class="form-control" required />
					</div>
					<div class="form-group mb-3">
						<label for="newPassword">NewPassword:</label> <input
							type="password" id="newPassword" name="newPassword"
							class="form-control" required />
					</div>
					<div class="form-group mt-3">
						<button type="submit" class="btn btn-primary">Reset</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
