/**
 * Created by salim on 6/18/2017.
 */
angular.module("contactmodule")
.config(function($routeProvider){

        $routeProvider
            .when("/",{
               templateUrl: "/app/components/contact/view.html",
                controller: "contactcontroller"

            });


    })
