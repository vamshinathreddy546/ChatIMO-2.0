###Controller
 All the classes are annotated with @Controller and @RestController so that they can be scanned by spring MVC
 -	Navigate.java :  Contains MVC controller methods for basic navigation.
 -	Blogcontroller : Contains RestWebServices related to Blog.
 -	forumcontroller: Contains RestWebServices related to Forum.
 - Forumcommentcontrol: Contains RestWebServices related to ForumComments.

 -	usercontrol : Contains RestWebServices related to Users.
 
 ###models
 Contains all model classes.These models will be scanned by hibernate, so as to facilitate easy data manipulation using Hibernate ORM.
 -   Blog.java
 -   Forum.java
 -   Forumcomment.java
 -   userdetails.java
 -   Message.java
 -   OutputMessage.java         	
 
 ###DAO 
 Contains all DAO interfaces and DAOImpls containing RAW persistence Logic. 
 - Blogdao.java
 - Blogdaoimpl.java
 - Forumdao.java
 - Forumdaoimpl.java
 - Forumcommentdao.java
 - Forumcommentdaoimpl.java
 - Usersdao.java
 - Usersdaoimpl.java
 
 ###Service
 Contains all service interfaces with are accessed from Controllers and ServiceImpl containing business logic.
 - blogservicedao.java
 - servicedaoimpl.java
 - forumservicedao.java
 - forumservicedaoimpl.java
 - Forumcdao.java
 - Forumcdaoimpl.java
 - Userservice.java
 - Userservicedaoimpl.java
