angular.module( 'ngBoilerplate.account', ['ui.router'])

.config(['$stateProvider', function($stateProvider) {
	
	$stateProvider.state('login', {
		url: '/login',
		views: {
			'main':{
				templateUrl: 'account/login.tpl.html',
				controller: 'LoginCtrl'
			}
		},

		data: {pageTitle: "Login"}
	})

	.state('register', {
		url: '/register',
		views: {
			'main':{
				templateUrl: 'account/register.tpl.html',
				controller: 'RegisterCtrl'
			}
		},

		data: {pageTitle: "Register"}
	});

}])

.factory('AccountService', function () {
	var Account = {

		foo: function() {
			alert('foo hit');
		}

	};

	return Account;
})

.controller('LoginCtrl', ['$scope','AccountService', function($scope, AccountService) {

	$scope.login = function(user) {
		AccountService.foo();
	};
	

}])

.controller('RegisterCtrl', ['$scope', function($scope) {

	$scope.register = function(account) {
		console.log("Registering With");
		console.log(account.name);
		console.log(account.password);
	};
	

}]);