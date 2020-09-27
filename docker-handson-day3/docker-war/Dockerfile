FROM tomcat:8.5-alpine

LABEL maintainer="vijinells@gmail.com"

WORKDIR /usr/local/tomcat

ADD ./target/war-test.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
