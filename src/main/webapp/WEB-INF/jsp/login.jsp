<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>





<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Login and Registration Form with HTML5 and CSS3</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <link href="<c:url value="/resources/css/demo.css" />"
	rel="stylesheet">
	<link href="<c:url value="/resources/css/style.css" />"
	rel="stylesheet">
	<link href="<c:url value="/resources/css/animate-custom.css" />"
	rel="stylesheet">
        
    </head>
    <body>
                   <header>
                
				
            </header>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form action="perform_login" method="post"> 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u" > Your email or username </label>
                                    <input id="username" name="username" required="required" type="text" placeholder="myusername or mymail@mail.com"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                    <input id="password" name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
									<label for="loginkeeping">Keep me logged in</label>
								</p>
                                <p class="login button"> 
                                    <input type="submit" value="login" /> 
								</p>
                                <p class="change_link">
									Not a member yet ?
									<a href="#toregister" class="to_register">Join us</a>
								</p>
                            </form>
                        </div>
                         
                        <div id="register" class="animate form">
                        
                        <h1> Sign up </h1> 
                           
                                <form data-ng-controller="Usercontrol"  data-ng-submit="submit()"   class="sa-innate-form" method="post">
								<label>Name</label>
								<input type="text" class="form-control" data-ng-model="name">
									<div class="form-group">
																			</div>
								<label>USERName</label>
                                       <input type="text" class="form-control" data-ng-model="username">
									 <div class="form-group"> 
											</div>
											<label>EMAIL</label>
                                      <input type="text" class="form-control" data-ng-model="email">
									<div class="form-group">
										
									 </div>
									 <label>PASSWORD</label>
									 <input type="text" class="form-control" data-ng-model="password">
									<div class="form-group">
																			</div>
									<label>MOBILE</label>
									<input type="text" class="form-control" data-ng-model="mobile">
									<div class="form-group">
																	</div>
 
									<input type="submit" value="Sign up"/> 
								
                                <p class="change_link">  
									Already a member ?
									<a href="#tologin" class="to_register"> Go and log in </a>
								</p></form>
											</div>
										</div>
									</div>
									
							
				</section>
	
	                       
    </body>
</html>