FROM openjdk:8

ARG container_path=./container
COPY $container_path /opt

WORKDIR /opt

ENV JMX_PORT=9020
ENV JMX_HOST=localhost

CMD java -Dcom.sun.management.jmxremote\ 
         -Djava.rmi.server.hostname=${JMX_HOST}\ 
         -Dcom.sun.management.jmxremote.port=${JMX_PORT}\ 
         -Dcom.sun.management.jmxremote.rmi.port=${JMX_PORT}\ 
         -Dcom.sun.management.jmxremote.local.only=false\ 
         -Dcom.sun.management.jmxremote.authenticate=false\ 
         -Dcom.sun.management.jmxremote.ssl=false\ 
         -cp "./*:lib/*:conf"\
         ${package}.App