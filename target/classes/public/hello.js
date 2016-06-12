function Hello($scope, $http) {
    $http.get('http://rest-service.guides.spring.io/greeting').
        success(function(data) {
            $scope.greeting = data;
        });
}

function HelloH($scope, $http) {
    $http.get('http://localhost:8080/api/one/question').
        success(function(data) {
            $scope.question = data;
        });
    $scope.chartsType = [
                   {model : "PIECHART", color : "red"},
                   {model : "COLUMNCHART", color : "white"},
                   {model : "LINECHART", color : "black"}
               ];
}