<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="https://opensource.keycdn.com/angularjs/1.5.8/angular.min.js "></script>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/forum.js"></script>
</head>
<body data-ng-controller="forumcontroller">
<div>
<form data-ng-submit="submit()" >
<div class="form-group"><br>
				<label for="formdata">forum name</label> <input type="text"
					placeholder="forumname" data-ng-model="name">
			</div>
			<div class="form-group">
				<label for="formdata">forum Description</label>
				<textarea draggable="false" style="resize: none" id="formdata"
					class="form-control" rows="13" data-ng-model="description"></textarea>
			</div>
			<div align="right">
				<button type="submit" class="btn btn-success">save</button>
			</div>
			</form>
			</div>
			<div data-ng-init="getalldetailsf()">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>FORUM ID</th>
					<th>FORUM Name</th>
					<th>FORUM Description</th>
					
						<th>Delete FORUM</th>
						<th>Edit FORUM</th>
					
				</tr>
			</thead>
			<tbody>
				<tr data-ng-repeat="forum in forums">
					<td>{{forum.fid}}</td>
					<td>{{forum.name}}</td>
					<td>{{forum.description}}</td>
					
						<td><button data-ng-click="deleteforum(forum.fid)"
								class="btn btn-xs btn-danger">Delete</button></td>
						<td><button data-ng-click="editforum(forum.fid)"
								class="btn btn-xs btn-info">Edit</button></td>
								
					
					<td width="5%"><a href="forum/{{forum.fid}}" class="btn btn-primary btn-xs">View</a></td>
				</tr>
				
				
			</tbody>
		</table>
	</div>


</body>
</html>