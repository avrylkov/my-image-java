FROM registry.redhat.io/redhat-openjdk-18/openjdk18-openshift:latest

MAINTAINER Rylkov Alexander <arylkov70@mail.ru>

ENV PATH=/opt/rh/rh-maven35/root/usr/bin:$PATH
ENV M2_HOME=/opt/rh/rh-maven35/root/usr/bin/mvn

USER root
COPY . /opt/build_dir

RUN cd /opt/build_dir && mvn -DskipTests package
#RUN cd /opt/build_dir && ls -l

RUN chmod +x /opt/build_dir/target && cd /opt/build_dir && ls /target -l

COPY target/demo.springboot.mvn-0.0.1-SNAPSHOT.jar /deployments/demo.springboot.jar

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /deployments/demo.springboot.jar" ]
