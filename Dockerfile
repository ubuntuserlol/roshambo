FROM tomcat:9.0
LABEL maintainer="strsmith@student.neumont.edu"
ADD target/roshambo/roshambo.war /usr/local/tomcat/webapps/
ADD target/roshambo/game.html /usr/local/tomcat/webapps/roshambo/index.html
EXPOSE 8080
CMD ["catalina.sh", "run"]
