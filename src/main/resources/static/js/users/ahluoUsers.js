/**
 * Created by LF on 2016-8-28.
 */
angular.module('ahluoApp', []).controller('ahluoController', function ($scope) {
    $scope.userName = '';
    $scope.age = 0;
    $scope.users = [
        {id: 1, userName: 'Centos', age: 101},
        {id: 2, userName: 'Linux', age: 102},
        {id: 3, userName: 'Unix', age: 103}
    ];
    $scope.edit = true;
    $scope.error = false;
    $scope.incomplete = false;

    $scope.editUser = function (id) {
        if (id == 'new') {
            $scope.edit = true;
            $scope.incomplete = true;
            $scope.userName = '';
            $scope.age = 0;
        } else {
            $scope.edit = false;
            $scope.userName = $scope.users[id - 1].userName;
            $scope.age = $scope.users[id - 1].age;
        }
    };

    $scope.$watch('userName', function () {
        $scope.test();
    });

    $scope.$watch('age', function () {
        $scope.test();
    });

    $scope.test = function () {
        $scope.incomplete = false;
        if ($scope.edit && (!$scope.userName.length || !$scope.age <= 0)) {
            $scope.incomplete = true;
        }
    };
});