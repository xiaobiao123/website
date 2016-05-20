path=/home/goujia/project/goujia/web/website

cd $path/website

#git pull origin `git branch -a |tail -1 |awk -F'/' '{print $NF}'`
git pull origin master

mvn clean package

#modify some file
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"http:\/\/test_manage.goujiawang.com\";/g" $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"\"\;/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js

#config log4j.xml
sed -i "s/debug/warn/g" $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
sed -i "s/debug/warn/g" $path/website/website-sync/target/website-sync-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
sed -i "s/debug/warn/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml

#copy application
cp -Rf $path/website/website-config/application.properties.console $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $path/website/website-config/application.properties.web $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $path/website/website-config/application.properties.sync $path/website/website-sync/target/website-sync-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties

#restart jetty
rm -rf $path/bin/jetty/logs/*
cd $path/bin/jetty
./bin/jetty.sh restart

rm -rf $path/bin/jettyweb/logs/*
cd $path/bin/jettyweb
./bin/jetty.sh restart

rm -rf $path/bin/jettysync/logs/*
cd $path/bin/jettysync
./bin/jetty.sh restart
