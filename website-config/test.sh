path=/home/goujia/project/web/website

cd $path/website

#git pull origin `git branch -a |tail -1 |awk -F'/' '{print $NF}'`
git pull origin developer

mvn clean package

#modify some file
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"http:\/\/tmanage.goujiawang.com\";/g" $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"\"\;/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
sed -i "s/www/twww/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/error/404
sed -i "s/project\/goujia/project/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/ehcache.xml

#config log4j.xml
#sed -i "s/debug/warn/g" $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
#sed -i "s/debug/warn/g" $path/website/website-sync/target/website-sync-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
#sed -i "s/debug/warn/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml

#copy application
cp -Rf $path/website/website-config/console.t $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $path/website/website-config/web.t $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $path/website/website-config/sync.t $path/website/website-sync/target/website-sync-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties

#restart jetty
#rm -rf $path/bin/jetty/logs/*
#cd $path/bin/jetty
#./bin/jetty.sh restart
#
#rm -rf $path/bin/jettyweb/logs/*
#cd $path/bin/jettyweb
#./bin/jetty.sh restart
#
#rm -rf $path/bin/jettysync/logs/*
#cd $path/bin/jettysync
#./bin/jetty.sh restart


function jrestart()
{
#	rm -rf $1/logs/*
	cd $1
	./bin/jetty.sh restart
}

jrestart $path/bin/jetty
jrestart $path/bin/jettyweb
jrestart $path/bin/jettysync
