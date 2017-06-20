angular.module("contactmodule")
    .controller("contactcontroller", function ($scope, $http, contactService) {

        $scope.showSaveButton = true;
        $scope.formData = {};

        contactService.getAllContacts().then(function (response) {
            $scope.contacts = response.data;
        });



        $scope.selectContact = function ($temp) {
            $scope.formData = $temp;
            $scope.showSaveButton = false;
        };

        $scope.clean = function () {
            $scope.formData = {};
            $scope.showSaveButton = true;
        };


        $scope.saveContact = function () {
          contactService.saveContact($scope.formData).then(function (response) {
              if(response.data != null){
                  $scope.contacts.push(response.data);
              }else{
                  console.log("It's null");
              }
           });
            $scope.clean();
        };


        $scope.updateContact = function () {
            contactService.updateContact($scope.formData).then(function (response) {
                if(response.data != null){
                    for(var x = 0;x<$scope.contacts.length; x++){
                        if($scope.contacts[x].idContact === response.data.idContact){
                            $scope.contacts[x] = response.data;
                        }
                    }
                }else{
                    console.log("It's null");
                }
            });
        };


        $scope.deleteContact = function () {
            contactService.deleteContact($scope.formData).then(function (response) {
                if(response.data =! false){
                    $scope.contacts = $scope.contacts.filter(function(cTemp){
                        return cTemp !== $scope.formData;
                    });
                    $scope.clean();
                }else{
                    console.log("It's null");
                }
            });
        };
    });