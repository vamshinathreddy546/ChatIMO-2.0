<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en-US" data-ng-app="Myapp">
<head>
<%-- <%@include file="/WEB-INF/includes/Frameworks.jsp"%>
 --%>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 
 <script type="text/javascript" src="https://opensource.keycdn.com/angularjs/1.5.8/angular.min.js "></script>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/blog.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/forum.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/user.js"></script>

 <title>HACK</title>
</head>
<body style="padding-top: 50px; margin-bottom: 75px">
	<header><%@include file="/WEB-INF/includes/Header.jsp"%></header>


	<c:choose>
	 <c:when test="${Loginclicked}">
	<c:import url="/WEB-INF/jsp/login.jsp"></c:import>
	</c:when> 
		<c:when test="${BlogClicked}">
			<div class="container">
				<c:import url="/WEB-INF/jsp/blog.jsp">
				</c:import>
			</div>
		</c:when>
		<c:when test="${ForumClicked}">
			<div class="container">
				<c:import url="/WEB-INF/jsp/forum.jsp">
				</c:import>
			</div>
		 </c:when>
		  <c:when test="${RegisterClicked}">
			<div class="container">
				<c:import url="/WEB-INF/jsp/login.jsp">
				</c:import>
			</div> 
		</c:when> 
		<c:when test="${IndividualForum}">
				<div class="container">
					<c:import url="/WEB-INF/jsp/individualforum.jsp">
					</c:import>
				</div>
			</c:when>
	</c:choose>
		
				