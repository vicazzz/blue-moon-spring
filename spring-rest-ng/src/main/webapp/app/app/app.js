'use strict';

// Declare app level module which depends on views, and components
var app=angular.module('myApp', [
	'ngRoute',
	'ngAnimate',
	'ngResource',
	'toaster',
	'angularMoment',
	'myApp.version'
	])
.constant('APPURL', "/spring-rest-ng")
.config(['$routeProvider', function($routeProvider) {

	$routeProvider
	.when('/', {
		templateUrl: 'views/browse.html'		
	})
	.otherwise({ redirectTo: '/' })

}]);
