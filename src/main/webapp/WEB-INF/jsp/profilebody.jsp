<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/javascript"></script>
</head>
<body >
	<div class="container text-center">
		<div class="row">
			<div class="col-sm-3 well ">
				<div class="well" data-ng-init="profileimage()" data-ng-controller="ProfileImage">
					<p><a href="#">My Profile</a></p>
					<img data-ng-src="data:image/JPEG;base64,{{img}}" class="img-circle" height="65px" width="65px" alt="Avatar">
				</div>
				<div class="well">
				<a data-toggle="tab" href="#home" class="active">Home</a> ||
				<a data-toggle="tab" href="#new" class="btn btn-primary">Settings</a>
				</div>
			</div>

			<div class="col-sm-9">
				<div class="tab-content">
					<div id="home" class="tab-pane fade in active">
						<%@include file="/WEB-INF/jsp/profilewall.jsp"%>
					</div>
					<div id="new" class="tab-pane fade">
						<h3>Image Upload</h3>
						<%@include file="/WEB-INF/jsp/Settings.jsp"%>
					</div>
				</div>
			</div>
		</div>
	</div>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/Profile.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/Settings.js"></script>
</body>
</html>