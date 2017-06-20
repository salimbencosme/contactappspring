/**
 * Created by salim on 6/18/2017.
 */

angular.module("contactmodule")
    .service('contactService', function ($http, $q) {

        this.urlBase = "http://localhost:8081";

        this.getAllContacts = function () {
            var defer = $q.defer();
            $http.get(this.urlBase + "/contacts").
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.reject(error);
                });
            return defer.promise;
        }


        this.saveContact = function (tempForm) {

            var defer = $q.defer();
            $http.post(this.urlBase + '/addcontact/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(null);
                });

            return defer.promise;
        };


        this.updateContact = function (tempForm) {

            var defer = $q.defer();
            $http.put(this.urlBase + '/updatecontact/', tempForm).
                then(function (response) {
                    defer.resolve(response);
                }, function (error) {
                    defer.resolve(null);
                });
            return defer.promise;
        };


        this.deleteContact = function (tempForm) {

            var defer = $q.defer();
            $http.delete(this.urlBase  + '/deletecontact/' + tempForm.idContact, null).
                then(function (response) {
                    defer.resolve(true);
                }, function (error) {
                    defer.resolve(false);
                });

            return defer.promise;
        };


    });