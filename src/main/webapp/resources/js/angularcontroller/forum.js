var app = angular.module('Myapp', []);
app.controller('forumcontroller',['$scope','$http',function($scope,$http){
	$scope.submit=function()
	{
		var BASE_URL='http://localhost:8081/ChatIMO';
		$scope.forum={
				fid:$scope.fid,
			    name:$scope.name,
		        description:$scope.description
		}
		$http({
			method:'POST',
			url:BASE_URL + '/forum',
			data:$scope.forum
			}).success(function(data, status, headers, config) {
				alert("Success");
				$scope.fid ='';
				$scope.name = '';
				$scope.description='';
			}).error(function(data, status, headers, config) {
				alert("Error");
			});
		};
		$scope.getalldetailsf=function() {
			$http({
				method:'GET',
	            url:'getalldetailsf'
			}).success(function(data,status,headers,config){
				$scope.forums = data;
				console.log($scope.forums);
				
			}).error(function(data,status,headers,config){
				alert("error");
			});
			
			};
			
		$scope.deleteforum=function(fid){
				$http({
					method:'DELETE',
	              url:'deleteforum/'+fid			
				}).success(function(data, status, headers, config) {
				   alert("Success");
				}).error(function(data, status, headers, config) {
					alert("error");
				});
			};
			$scope.editforum=function(fid){
				$http({
					method:'GET',
					url:'editforum/'+fid
				}).success(function(data, status, headers, config) {
					$scope.forum=data;
					$scope.fid=$scope.forum.fid;
					$scope.name=$scope.forum.name;
					$scope.description=$scope.forum.description;
					
					
				}).error(function(data, status, headers, config) {
					alert("error");
				});
				
				
				
			};
			

}]);

		
		
		
		
	
	
	
	
