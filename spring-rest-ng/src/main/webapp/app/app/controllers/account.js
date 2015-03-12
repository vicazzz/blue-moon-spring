'use strict';

app.controller('RegisterCtrl', ['$scope','AccountService','SessionService','$location', function($scope,AccountService,SessionService,$location){

	$scope.register = function(user) {
		AccountService.register(user, function(result){
			SessionService.login(user).then(function() {
				$location.path("#/");	
			});
		}, function(){
			alert("Error Registering User");
		});		

	};

	
	
}])