[![CircleCI](https://circleci.com/gh/danish878/spring-mvc-xml.svg?style=svg)](https://circleci.com/gh/danish878/spring-mvc-xml)

# Java Blog Aggregator

##To run in development mode (using embedded HSQL database)

Run this application using embedded Jetty server: `>mvn jetty:run -Dspring.profiles.active=dev`

This will start embedded Jetty server on port 8080 and you can access your application here: `http://localhost:8080`

##To deploy on Heroku:

1. `heroku create`
2. `mvn clean heroku:deploy-war`
3. `heroku open`