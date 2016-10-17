app.controller('indivforum', [ '$scope', '$http', function($scope, $http) {
	var BASE_URL = 'http://localhost:8081/ChatIMO';
	    $scope.fcdescription = '';
	    $scope.fcid=document.getElementById("fid").value;  
	    
	    $scope.Comment = function() {
	    	$scope.comment = {	
					fid : $scope.fcid,
					fcdescription : $scope.fcdescription ,
				}
			$http({
				method : 'POST',
				url : BASE_URL + '/ForumComment',
				data : $scope.comment
			}).success(function(data, status, headers, config) {
				alert("Success");
			    $scope.fcdescription  = '';
			}).error(function(data, status, headers, config) {
				alert("Error");
			});	
		};
		$scope.getAllComments = function() {
			$http({
				method : 'GET',
				url : BASE_URL + '/getAllComments/'+ $scope.fcid
			}).success(function(data, status, headers, config) {
				$scope.comments = data;// alert(data); 
			}).error(function(data, status, headers, config) {
				alert("Error");
			});
		};
}]);