<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/
bootstrap.min.css"
	rel="stylesheet">
<title>Register</title>
</head>
<body>
    <div class="container">
        <div class="section">
            <div class="row justify-content-center">
                <div class="col-12 col-md-7">
                    <div class="register-form shadow-sm p-4">
                        <h2 class="text-center mb-4">Create new account</h2>
                        <form action="${pageContext.request.contextPath}/register" method="post">
                            <c:if test="${alert != null}">
                                <h3 class="alert alert-danger">${alert}</h3>
                            </c:if> 

                            <div class="mb-3">
                                <label for="username" class="form-label">User Name</label>
                                <div class="input-group">
                                    <span class="input-group-text"><i class="fa fa-user"></i></span> 
                                    <input type="text" class="form-control" id="username" name="username" placeholder="Nhập tài khoản" required>
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="fullname" class="form-label">Full name</label> 
                                <input type="text" class="form-control" id="fullname" name="fullname" placeholder="Nhập họ tên" required>
                            </div>

                            <div class="mb-3">
                                <label for="email" class="form-label">Email</label> 
                                <input type="email" class="form-control" id="email" name="email" placeholder="Nhập Email" required>
                            </div>

                            <div class="mb-3">
                                <label for="password" class="form-label">Password</label> 
                                <input type="password" class="form-control" id="password" name="password" placeholder="Nhập mật khẩu" required>
                            </div>

                            <div class="mb-3">
                                <label for="confirmPassword" class="form-label">ConfirmPassword</label> 
                                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Nhập lại mật khẩu" required>
                            </div>

                            <div class="d-grid">
                                <button type="submit" class="btn btn-primary">Create</button>
                            </div>

                            <div class="mt-3 text-center">
                                <p>If you already have an account? <a href="${pageContext.request.contextPath}/login">Login</a></p>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>