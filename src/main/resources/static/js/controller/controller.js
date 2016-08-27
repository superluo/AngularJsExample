/**
 * Created by LF on 2016-8-27.
 */
angular.module('ahluoApp', []).controller('ahluoController', function ($scope) {
    $scope.persons = [
        {name: 'linux', age: 102},
        {name: 'centos', age: 101},
        {name: 'unix', age: 103}
    ];
});