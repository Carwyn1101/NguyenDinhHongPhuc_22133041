<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<h2>Edit information</h2>
		<form action="${pageContext.request.contextPath}/profile"
			method="post" enctype="multipart/form-data">
			<input type="hidden" name="id" value="${user.id}" />

			<div class="mb-3">
				<label for="fullname" class="form-label">Full Name</label> <input
					type="text" class="form-control" id="fullname" name="fullname"
					value="${user.fullName}" required>
			</div>

			<div class="mb-3">
				<label for="phone" class="form-label">Phone</label> <input
					type="text" class="form-control" id="phone" name="phone"
					value="${user.phone}" required>
			</div>

			<div class="mb-3">
				<label for="avatar" class="form-label">Avatar</label> <input
					type="file" class="form-control" id="avatar" name="avatar">
				<c:if test="${user.avatar != null}">
					<img
						src="${pageContext.request.contextPath}/uploads/${user.avatar}"
						width="150" class="mt-3" alt="Avatar">
					<!--  <p>Tên file: ${user.avatar}</p> -->
				</c:if>
				<c:if test="${empty user.avatar}">
					<img
						src="${pageContext.request.contextPath}/uploads/default-avatar.png"
						width="150" class="mt-3" alt="Default Avatar">
				</c:if>
			</div>

			<button type="submit" class="btn btn-primary"
				onclick="window.location.href='${pageContext.request.contextPath}/profile'">Update</button>


			<button type="button" class="btn btn-secondary"
				onclick="window.location.href='${pageContext.request.contextPath}/login'">Back</button>

		</form>
	</div>
</body>
</html>
