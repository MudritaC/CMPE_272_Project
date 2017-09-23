'use strict';

/* Controllers */

angular.module('myApp.apartment.controllers', [])

    .controller('ApartmentController', function($scope) {
        $scope.apartmentDetails=[
            {name:'Apartment1',location:'Santaclara'},
            {name:'Apartment2',location:'Sunnyvale'},
            {name:'Apartment3',location:'MountainView'},
            {name:'Apartment4',location:'sunnyvale'}
            ];
        /*$scope.now = new Date();
        $scope.helloMessages = ['Hello', 'Bonjour', 'Hola', 'Ciao', 'Hallo'];
        $scope.greeting = $scope.helloMessages[0];
        $scope.getRandomHelloMessage = function() {
            $scope.greeting = $scope.helloMessages[parseInt((Math.random() * $scope.helloMessages.length))];
        }*/
        })
