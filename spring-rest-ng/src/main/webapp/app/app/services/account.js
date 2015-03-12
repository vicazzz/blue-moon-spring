'use strict';
app.factory('AccountService', ['$resource','SessionService','APPURL',function($resource,SessionService,APPURL) {

	var service ={};

	service.register = function(user, success, failure){
		var Account = $resource(APPURL+'/rest/accounts');
		Account.save({}, user, success, failure);

	};

	service.getAccountById =function(accountId) {
		var Account = $resource(APPURL+'/rest/accounts/:paramAccountId');
		return Account.get({paramAccountId:accountId}).$promise;
	};

	service.userExits = function(account, success, failure){
		var Account = $resource(APPURL+'/rest/accounts');
	};
	return service;

	
}]);