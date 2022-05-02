# Description

this program creates an api of that uses a mysql database to make http request to GET POST PUT and DELETE infotmation on said database .

Dependencies
To be able to try the program, you need ..

to install an Integrated development environment(we used intellij code for this one(best IDE so far in my opinion)).

you also need to install the latest version of JAVA.


-you also need to set up the application with spring boot (needed to set up the token)
Usage

-To use the api , you ll need to use postman to test the api calls.

-first you need to authenticate the user using the api.
(sadly a had issues connecting to my users table so to test 
i created a mock user (username : test@test.com , password : password).
if you do not authenticate and you try any of the api calls they will not work.

-after getting your user authenticated you ll get a token that you r gonna have to to use in your api calls headers to make it work.

some api calls you can try are https://darlyaavaapi.herokuapp.com/interventions/customer/4
to get the interventions by a customer.

you can also try https://darlyaavaapi.herokuapp.com/batteries/building/4
to get the batteries by building id.