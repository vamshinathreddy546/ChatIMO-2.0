<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div data-ng-controller="indivforum">
	<div style="margin-top: 20px;border: 5px;border-color: blue">
		<c:if test="${!empty forumList}">
			<c:forEach items="${forumList}" var="forum">
				<div  hidden="true">
					<p style="padding: 10px; font-size: large">
						<input type="number" value="${forum.fid}" id="fid">
					</p>
				</div>
				<div style="background-color: lightgrey">
					<p style="padding: 10px; font-size: large;">
						<strong>${forum.name}</strong>
					</p>
				</div>
				<div style="background-color: lightgrey">
					<p style="padding: 10px; font-size: medium">${forum.description}</p>
				</div>
			</c:forEach>
		</c:if>
	</div>
	<br>
	<sec:authorize access="isAuthenticated()">
		<div class="row">
			<form role="form" >
				<div class=" col-sm-11">
					<input type=text data-ng-model="fcdescription" class="form-control" placeholder="Enter Comment">
				</div>
				<div class=" col-sm-1">
					<button type="submit" data-ng-click="Comment()" class="btn btn-success" style="float: right">Comment</button>
				</div>
			</form>
		</div>
	</sec:authorize>
	<br>

<div data-ng-init="getAllComments()">
		<table class="table table-bordered table-hover">
			
			<tbody>
				<tr data-ng-repeat="comment in comments">
					<td width="80%">{{comment.fcdescription}}</td>
					<td width="20%">{{comment.commenttime}}</td>
									</tr>
			</tbody>
		</table>
	</div>


	<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/indivforum.js"></script>
</div>