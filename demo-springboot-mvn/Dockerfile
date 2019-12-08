FROM registry.redhat.io/redhat-openjdk-18/openjdk18-openshift:latest

MAINTAINER Rylkov Alexander <arylkov70@mail.ru>

ENV PATH=/opt/rh/rh-maven35/root/usr/bin:$PATH
ENV M2_HOME=/opt/rh/rh-maven35/root/usr/bin/mvn
ENV PS1="\s-\u-\w\$"

USER root
COPY . /opt/build_dir

RUN cd /opt/build_dir && rpm -i bin/mc-4.8.23-1.1.x86_64.rpm && mvn -DskipTests package

RUN cd /opt/build_dir && cp target/demo.springboot.mvn-0.0.1-SNAPSHOT.jar /deployments/demo.springboot.jar

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /deployments/demo.springboot.jar" ]
