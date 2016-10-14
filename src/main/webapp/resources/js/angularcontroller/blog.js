var app = angular.module('Myapp',[])
app.controller('blogcontroller', [ '$scope', '$http', function($scope, $http) {
	
	$scope.submit = function(){
		var BASE_URL='http://localhost:8081/ChatIMO';
		$scope.blog= {
				bid:$scope.bid,
				name:$scope.name,
				description:$scope.description
				
		}
		$http({
			method:'POST',
			url:BASE_URL + '/Blog',
			data:$scope.blog
		}).success(function(data, status, headers, config) {
			alert("Success");
			$scope.bid ='';
			$scope.name = '';
			$scope.description='';
		}).error(function(data, status, headers, config) {
			alert("Error");
		});
	};
	
	$scope.getalldetails=function() {
		$http({
			method:'GET',
            url:'getalldetails'
		}).success(function(data,status,headers,config){
			$scope.blogs = data;
			console.log($scope.blogs);
			
		}).error(function(data,status,headers,config){
			alert("error");
		});
		
		};
		
	$scope.deleteblog=function(bid){
			$http({
				method:'DELETE',
              url:'deleteblog/'+bid			
			}).success(function(data, status, headers, config) {
			   alert("Success");
			}).error(function(data, status, headers, config) {
				alert("error");
			});
		};
		$scope.editblog=function(bid){
			$http({
				method:'GET',
				url:'editblog/'+bid
			}).success(function(data, status, headers, config) {
				$scope.blog=data;
				$scope.bid=$scope.blog.bid;
				$scope.name=$scope.blog.name;
				$scope.description=$scope.blog.description;
				
				
			}).error(function(data, status, headers, config) {
				alert("error");
			});
			
			
			
		};
		

}]);
