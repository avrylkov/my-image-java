FROM registry.redhat.io/redhat-openjdk-18/openjdk18-openshift:latest

MAINTAINER Rylkov Alexander <arylkov70@mail.ru>

ENV PATH /opt/apache-tomcat-8.5.49/bin/:$PATH

#ENV GRADLE_VERSION=4.9

USER root

COPY bin/ /opt/downloads

RUN cd /opt/downloads && chmod +x *.sh && ./install.sh
#RUN apk update && apk add mc

RUN cd /opt/downloads && rm -rf *.tar.gz

#RUN apk update && apk add mc
#CMD /usr/bin/mc
