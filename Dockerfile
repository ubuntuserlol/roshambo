FROM tomcat:9.0
LABEL maintainer="strsmith@student.neumont.edu"

# Add the WAR file
ADD target/roshambo/roshambo.war /usr/local/tomcat/webapps/

# Add the game.html manually to override the default landing page
ADD src/main/webapp/game.html /usr/local/tomcat/webapps/roshambo/index.html

EXPOSE 8080
CMD ["catalina.sh", "run"]
