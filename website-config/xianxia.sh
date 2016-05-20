path=/home/goujia/project/goujia/web/website

cd $path/website

#git pull origin `git branch -a |tail -1 |awk -F'/' '{print $NF}'`
git pull origin developer

mvn clean package

#modify some file
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"http:\/\/t_website.goujiawang.com\";/g" $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"\"\;/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js

#config log4j.xml
sed -i "s/debug/warn/g" $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
sed -i "s/debug/warn/g" $path/website/website-sync/target/website-sync-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
sed -i "s/debug/warn/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml

#copy application
cp -Rf $path/website/website-config/application.properties.console.test $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $path/website/website-config/application.properties.web.test $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $path/website/website-config/application.properties.sync.test $path/website/website-sync/target/website-sync-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties

function jrestart()
{
#	rm -rf $1/logs/*
	cd $1
	./bin/jetty.sh restart
}

jrestart $path/bin/jetty
jrestart $path/bin/jettyweb
jrestart $path/bin/jettysync

