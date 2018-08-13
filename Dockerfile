FROM registry.saas.hand-china.com/hap-cloud/base
ADD start.sh ./start.sh
COPY target/JavaTest5-1.0-SNAPSHOT.jar  /JavaTest5-1.0-SNAPSHOT.jar
CMD ["./start.sh"]

