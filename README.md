# Description

this program creates an api of that uses a mysql database to make http request to GET POST PUT and DELETE infotmation on said database .

# Dependencies

To be able to try the program, you need ..

To install an Integrated development environment(we used intellij code for this one(best IDE so far in my opinion)).

You also need to install the latest version of JAVA.


-You also need to set up the application with spring boot (needed to set up the token)
Usage

# How to use

-To use the api , you ll need to use postman to test the api calls.

-First you need to authenticate the user using the api.
(sadly a had issues connecting to my users table so to test 
i created a mock user (username : test@test.com , password : password).
if you do not authenticate and you try any of the api calls they will not work.

-After getting your user authenticated you ll get a token that you r gonna have to to use in your api calls headers to make it work.

Some api calls you can try are https://darlyaavaapi.herokuapp.com/interventions/customer/4
to get the interventions by a customer.

You can also try https://darlyaavaapi.herokuapp.com/batteries/building/4
to get the batteries by building id.

# Deployment of the api

-The api was deployed using heroku. 

-To deploy you need to download the heroku cli then use the command to set up a remote git repository

-from there 
-we git add .

-we git commmit

-and finally we git push heroku main