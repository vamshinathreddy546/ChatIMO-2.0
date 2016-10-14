<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript"
	src="https://opensource.keycdn.com/angularjs/1.5.8/angular.min.js "></script>
<script
	src="${pageContext.request.contextPath}/resources/js/angularcontroller/blog.js"></script>
<%-- <script
			src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
			 --%>
</head>
<body data-ng-controller="blogcontroller">
	<div>
		<form data-ng-submit="submit()">
			<div class="form-group"><br>
				<label for="formdata">blog name</label> <input type="text"
					placeholder="blogname" data-ng-model="name">
			</div>
			<div class="form-group">
				<label for="formdata">blog Description</label>
				<textarea draggable="false" style="resize: none" id="formdata"
					class="form-control" rows="13" data-ng-model="description"></textarea>
			</div>

			<div align="right">
				<button type="submit" class="btn btn-success">save</button>
			</div>

		</form>
	</div>

	<div data-ng-init="getalldetails()">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>BLOG ID</th>
					<th>BLOG Name</th>
					<th>BLOG Description</th>

					<th>Delete BLOG</th>
					<th>Edit BLOG</th>

				</tr>
			</thead>
			<tbody>
				<tr data-ng-repeat="blog in blogs">
					<td>{{blog.bid}}</td>
					<td>{{blog.name}}</td>
					<td>{{blog.description}}</td>

					<td><button data-ng-click="deleteblog(blog.bid)"
							class="btn btn-xs btn-danger">Delete</button></td>
					<td><button data-ng-click="editblog(blog.bid)"
							class="btn btn-xs btn-info">Edit</button></td>

				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>