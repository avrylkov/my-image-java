#FROM 172.30.1.1:5000/myproject/openshift-java-base-image:latest
FROM openjdk:8-jre

MAINTAINER Rylkov Alexander <arylkov70@mail.ru>

USER root
#COPY . /opt/build_dir
# from Idea
COPY target/demo.springboot.mvn-0.0.1-SNAPSHOT.jar /deployments/demo.springboot.jar

# mvn build
#RUN cd /opt/build_dir && mvn -DskipTests package
#RUN cd /opt/build_dir && cp target/demo.springboot.mvn-0.0.1-SNAPSHOT.jar /deployments/demo.springboot.jar

# binary bin/jar
# RUN cd /opt/build_dir && cp bin/demo.springboot.mvn-0.0.1-SNAPSHOT.jar /deployments/demo.springboot.jar

# binary target/jar
#RUN cd /opt/build_dir && cp target/demo.springboot.mvn-0.0.1-SNAPSHOT.jar /deployments/demo.springboot.jar

ENV JAVA_OPTS="$JAVA_OPTS -Xms500m -Xmx2048m"

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /deployments/demo.springboot.jar" ]
#CMD [ "java $JAVA_OPTS -jar /deployments/demo.springboot.jar" ]
