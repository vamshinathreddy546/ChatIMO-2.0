<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand " style="color: red">CHATIMO</a>
			</div>
			<div class="collapse navbar-collapse" id="myNavbar">
				<ul class="nav navbar-nav navbar-right">
				
					
					<li><a href="${pageContext.request.contextPath}/Blog" style="color: red">Blog</a></li>
					<li><a href="${pageContext.request.contextPath}/forum" style="color: red">Forum</a></li>
					
					
					<sec:authorize access="!isAuthenticated()">
					<li><a href="${pageContext.request.contextPath}/login" style="color: red"><span
								class="glyphicon glyphicon-log-out"></a></li>
					</sec:authorize>
					
					 <sec:authorize access="isAuthenticated()">
						<li><a style="color: red">Hello <b><sec:authentication
										property="principal.username" /></b></a></li>
						<li><a href="${pageContext.request.contextPath}/perform_logout"><span
								class="glyphicon glyphicon-log-out"></span></a></li>
					</sec:authorize>
					<%-- <sec:authorize access="!isAuthenticated()">
						 <li><a href="#log" data-toggle="modal" data-target="#login"><span
								class="glyphicon glyphicon-log-in lg-red"></span></a></li>
						<li><a href="#reg" data-toggle="modal"
							data-target="#registration"> <span
								class="glyphicon glyphicon-user"></span>
						</a></li> 
					</sec:authorize> --%>
				</ul>
			</div>
		</div>
	</nav>
</body>
</html>	
					
					