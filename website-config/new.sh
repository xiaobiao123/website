wpath=/home/goujia/project/goujia/web/www
ppath=/home/goujia/project/goujia/web/www/deploy


cd $ppath

#git pull origin `git branch -a |tail -1 |awk -F'/' '{print $NF}'`
git pull origin master

mvn clean package -DskipTests

#modify some file
#sed -i "s/\(var PATH_CONTEXT=\).*/\1\"http:\/\/tmanage.goujiawang.com\";/g" $ppath/website-console/target/website-console-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"\"\;/g" $ppath/website-web/target/website-web-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"\"\;/g" $ppath/website-console/target/website-console-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
#sed -i "s/www/dwww/g" $ppath/website-web/target/website-web-0.0.1-SNAPSHOT/error/404
#sed -i "s/project\/goujia/project/g" $ppath/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/ehcache.xml
sed -i "s/\(diskStore path=\).*/\1\"\/home\/goujia\/project\/goujia\/web\/deve\/cache\"\ \/>/g" $ppath/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/ehcache.xml
#sed -i "s/www.goujiawang.com/dwww.goujiawang.com/g" $ppath/website-web/target/website-web-0.0.1-SNAPSHOT/goujia/js/activity/activities.min.js
#sed -i "s/localhost:8081\/website-web/dwww.goujiawang.com/g" $ppath/website-web/target/website-web-0.0.1-SNAPSHOT/goujia/js/activity/activities.min.js

#config log4j.xml
sed -i "s/debug/warn/g" $ppath/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
sed -i "s/debug/warn/g" $ppath/website-sync/target/website-sync-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
sed -i "s/debug/warn/g" $ppath/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml

#copy application
cp -Rf $ppath/website-config/console $ppath/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $ppath/website-config/web $ppath/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $ppath/website-config/sync $ppath/website-sync/target/website-sync-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $ppath/website-config/web.xml $ppath/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/web.xml

#copy robots.txt
#cp -Rf $ppath/website-config/robots.txt $ppath/website-sync/target/website-sync-0.0.1-SNAPSHOT/
#cp -Rf $ppath/website-config/robots.txt $ppath/website-web/target/website-web-0.0.1-SNAPSHOT/
#cp -Rf $ppath/website-config/robots.txt $ppath/website-console/target/website-console-0.0.1-SNAPSHOT/


function jrestart()
{
	cd $1
	./bin/jetty.sh restart
}

jrestart $path/bin/jetty
jrestart $path/bin/jettyweb
jrestart $path/bin/jettysync
