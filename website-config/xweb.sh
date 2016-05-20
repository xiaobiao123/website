path=/home/goujia/project/goujia/web/website

cd $path/website

#git pull origin `git branch -a |tail -1 |awk -F'/' '{print $NF}'`
git pull origin master

cd $path/website/website-web
mvn clean package

#config log4j.xml
sed -i "s/debug/warn/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"\"\;/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js

#copy application
cp -Rf $path/website/website-config/application.properties.web.test $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties


#reboot jetty

rm -rf $path/bin/jettyweb/logs/*
cd $path/bin/jettyweb
./bin/jetty.sh restart

