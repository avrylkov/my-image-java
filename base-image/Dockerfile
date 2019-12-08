FROM registry.redhat.io/redhat-openjdk-18/openjdk18-openshift:latest

MAINTAINER Rylkov Alexander <arylkov70@mail.ru>

ENV PATH=/opt/rh/rh-maven35/root/usr/bin:$PATH
ENV M2_HOME=/opt/rh/rh-maven35/root/usr/bin/mvn
ENV PS1="\s-\u-\w\$"

RUN yum -y install mc

CMD [ "sh" ]