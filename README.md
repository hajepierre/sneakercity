# RUNNING SNEAKERCITY CODE

## Introduction

This code was writen using netbeans. But it can be imported into any IDE of your choice. 

Here are the steps to be able to run this code:

1. Ensure that you have postgresql db running on your machine
1. Execute the following maven column to create the executable fo the code:
```
$ mvn install (- to download dependencies) and 
$ mvn clean package (- to create package)
```
1. Change directory to target and run following column to launch the application
```
$ cd target
$ java -jar sneakercity
```

Tables will be automatically created in the database.
