<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Stocker - Stock Market Website Template</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="" name="keywords">
<meta content="" name="description">

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin="">
<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@100..900&amp;family=Roboto:wght@400;500;700;900&amp;display=swap"
	rel="stylesheet">

<!-- Icon Font Stylesheet -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">

<!-- Libraries Stylesheet -->
<link rel="stylesheet"
	href="<c:url value = "/templates/lib/animate/animate.min.css"/>">
<link href="<c:url value = "/templates/lib/lightbox/css/lightbox.min.css"/>"
	rel="stylesheet">
<link
	href="<c:url value = "/templates/lib/owlcarousel/assets/owl.carousel.min.css" />"
	rel="stylesheet">


<!-- Customized Bootstrap Stylesheet -->
<link href="<c:url value = "/templates/css/bootstrap.min.css"/>"
	rel="stylesheet">

<!-- Template Stylesheet -->
<link href="<c:url value="/templates/css/style.css" />" rel="stylesheet">

</head>
<body>
	<div>
		<%@include file="/commons/web/header.jsp"%>
	</div>
	<div>
		<sitemesh:write property="body" />
	</div>
	<div>
		<%@include file="/commons/web/footer.jsp"%>
	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="<c:url value = "/templates/lib/wow/wow.min.js"/>"></script>
	<script src="<c:url value = "/templates/lib/easing/easing.min.js"/>"></script>
	<script src="<c:url value = "/templates/lib/waypoints/waypoints.min.js"/>"></script>
	<script src="<c:url value = "/templates/lib/counterup/counterup.min.js"/>"></script>
	<script src="<c:url value = "/templates/lib/lightbox/js/lightbox.min.js"/>"></script>
	<script src="<c:url value = "/templates/lib/owlcarousel/owl.carousel.min.js"/>"></script>

	<script src="<c:url value = "/templates/js/main.js"/>"></script>
	<div id="lightboxOverlay" tabindex="-1" class="lightboxOverlay"
		style="display: none;"></div>
	<div id="lightbox" tabindex="-1" class="lightbox"
		style="display: none;">
		<div class="lb-outerContainer">
			<div class="lb-container">
				<img class="lb-image"
					src="data:image/gif;base64,R0lGODlhAQABAIAAAP///wAAACH5BAEAAAAALAAAAAABAAEAAAICRAEAOw=="
					alt="">
				<div class="lb-nav">
					<a class="lb-prev" role="button" tabindex="0"
						aria-label="Previous image" href=""></a><a class="lb-next"
						role="button" tabindex="0" aria-label="Next image" href=""></a>
				</div>
				<div class="lb-loader">
					<a class="lb-cancel" role="button" tabindex="0"></a>
				</div>
			</div>
		</div>
		<div class="lb-dataContainer">
			<div class="lb-data">
				<div class="lb-details">
					<span class="lb-caption"></span><span class="lb-number"></span>
				</div>
				<div class="lb-closeContainer">
					<a class="lb-close" role="button" tabindex="0"></a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>