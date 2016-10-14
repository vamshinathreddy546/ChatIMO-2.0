var app = angular.module('Myapp',[])
app.controller('Usercontrol', [ '$scope', '$http', function($scope, $http) {
	
	$scope.submit = function(){
		var BASE_URL='http://localhost:8081/ChatIMO/';
		$scope.user= {
				name:$scope.name,
				username:$scope.username,
				email:$scope.email,
				password:$scope.password,
				mobile:$scope.mobile,
				gender:$scope.gender
				
				
		}
		$http({
			method:'POST',
			url:BASE_URL + '/userdetails',
			data:$scope.user
		}).success(function(data, status, headers, config) {
			alert("Success");
			$scope.name ='';
			$scope.username = '';
			$scope.email='';
			$scope.password='';
			$scope.mobile='';
			$scope.gender='';
			
		}).error(function(data, status, headers, config) {
			alert("Error");
		});
	};
	}]);
