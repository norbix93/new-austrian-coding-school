Chapter 1: Driver Setup

Ticket: Database Connection
Problem:

Task

MFlix will use MongoDB as a storage layer, so for this ticket you'll be required to perform some application setup.

First, make sure you've created a user on your Atlas cluster with read and write access to any database.
The user name should be m220student and the password should be m220password
Don't forget to whitelist your IP address!
Copy the connection string by clicking on Connect in the Atlas cluster. Select that you'd like to connect with MongoDB Compass, and select Compass 1.12 or later - this will give you the srv connection string. Make sure this URI string contains your username and password!

Locate the file called src/main/resources/application.properties within the mflix java project, and replace the information within with your own mongodb uri srv connection string, set in property value spring.mongodb.uri:

spring.mongodb.uri=mongodb+srv://YOUR_CLUSTER_URI
It's highly recommended you also change the jwtSecret to some very long, very random string. While this application is only meant for local use during this course, software has a strange habit of living a long time:

jwtSecret=SUPER_SECRET_KEY_YOU_WANT_TO_REPLACE_THIS
