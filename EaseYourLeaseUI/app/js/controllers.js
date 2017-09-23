'use strict';

/* Controllers */

angular.module('myApp.controllers', [])


    .controller('HelloController',function($scope,$http){
        $http.get('http://localhost:8080/FirstSpringMVCProject/welcome')
        .then(function(response) {
            $scope.greeting = response.data;
                console.log('Response from server : ' + data)
            });
    })

  .controller('MyCtrl2', function($scope,$routeParams) {
      $scope.firstname=$routeParams.firstname;
      $scope.lastname=$routeParams.lastname;
  });