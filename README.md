# matrix-marketing-java-test

backend
	there database can be found here:
		postgresql://abul.db.elephantsql.com:5432/ojhbqubz?apikey=3bf0160e-3f6f-4e74-8806-f1cb33d7dd72
	there is only one user:
		username: user1
		password: pass1
	the sql table has one table defined as:
		user_tbl(username,pass)
	if you want to test the backend with a headless client (eg. postman)
	start the spring boot server by running the file:
		-with and ide of your choice:
			matrix-marketing-java-test/assignment1/backend/src/main/java/com/example/backend/BackendApplication.java
		-or directly in terminal by entering:(note that you need Java Runtime (class file version 61.0))
		 	java -jar backend.jar
	hit the following endpoint (with a post request) to find a user by user name
		localhost:8080/api/v1/user/find
	to view all users hit (with a get request)
		localhost:8080/api/v1/user
	
frontend
	the frontend is written in vue
		
		
