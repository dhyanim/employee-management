Employee management application has 2 parts

1. employee-management-service - A backend application which gives employees data. It is developed using Spring Boot, Spring Rest, Spring JPA, H2- Inmemory database.

2. employee-management-frontend - A front-end/UI appication developed using React JS, Bootstrap CSS, which communicate  with employee-management-service for data.


To Run both the applications please follow below steps

1. Take git checkout of repo https://github.com/dhyanim/employee-management.git

2. Then navigate inside employee-management-service directory in your local checkout. 
      a. Run command mvn clean install 
      b. Then run command java -jar target/employee-service-0.0.1-SNAPSHOT.jar
      c. service will start running on port 8080 . Can be verified by checking http://localhost:8080/employees in browser
 
 3. Then navigate to   employee-management-frontend directory in your local checkout
      a. Run command npm install
      b. Then  run command npm start
      c. application will start running on port 3000. Can be verified by checking http://localhost:3000 in browser
      
     

