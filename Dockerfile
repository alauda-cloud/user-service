FROM spring-cloud-demo/java

COPY target/*.jar /app/app.jar

CMD /bin/bash -c 'export JAVA_OPTS=${JAVA_OPTS}" -Djava.security.egd=file:/dev/./urandom" && java $JAVA_OPTS -jar /app/app.jar'