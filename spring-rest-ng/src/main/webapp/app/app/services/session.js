'use strict';

app.factory('SessionService', ['$http','APPURL', function($http,APPURL) {
	
	var session = {};

	session.login =function(user) {
		return $http.post(APPURL+'/login',"username="+user.email+"&password="+user.password,{
			headers: {'Content-Type': 'application/x-www-form-urlencoded'}
		}).then(function(data) {
			alert("login Successfully");
			localStorage.setItem("session", {});
		}, function(data){
			alert("login Failed");
		});
	};

	session.logout =function(){
		localStorage.removeItem("session");
	};

	session.isLoggedIn = function() {
		return localStorage.getItem("session") !== null;
	};	

	return session;
	
}]);