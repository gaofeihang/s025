#!/bin/bash
cd /home/workspace/git/s025/
git pull
mvn clean package -Dmaven.test.skip
mv /home/workspace/git/s025/s025-web/target/s025-web-0.0.1-SNAPSHOT.war /home/server/tomcat/apache-tomcat-8.0.12/webapps/ROOT.war
sh /home/server/tomcat/script/restart-app.sh /