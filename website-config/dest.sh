path=/home/goujia/project/web/deve

cd $path/website

#git pull origin `git branch -a |tail -1 |awk -F'/' '{print $NF}'`
git pull origin dev

mvn clean package -DskipTests

#modify some file
#sed -i "s/\(var PATH_CONTEXT=\).*/\1\"http:\/\/tmanage.goujiawang.com\";/g" $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"\"\;/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
sed -i "s/\(var PATH_CONTEXT=\).*/\1\"\"\;/g" $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
sed -i "s/www/dwww/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/error/*
echo "modify config.js"
sed -i "s/ges.goujiawang.com/tges.goujiawang.com/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/goujiaDIY/js/config.js
sed -i "s/project\/goujia/project/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/ehcache.xml
sed -i "s/\(diskStore path=\).*/\1\"\/home\/goujia\/project\/web\/deve\/cache\"\ \/>/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/ehcache.xml
#sed -i "s/www.goujiawang.com/dwww.goujiawang.com/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/goujia/js/activity/activities.min.js
#sed -i "s/localhost:8081\/website-web/dwww.goujiawang.com/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/goujia/js/activity/activities.min.js

#config log4j.xml
#sed -i "s/debug/warn/g" $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
#sed -i "s/debug/warn/g" $path/website/website-sync/target/website-sync-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml
#sed -i "s/debug/warn/g" $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml

#copy application
cp -Rf $path/website/website-config/console.d $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $path/website/website-config/web.d $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $path/website/website-config/sync.d $path/website/website-sync/target/website-sync-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties
cp -Rf $path/website/website-config/dweb.xml $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/WEB-INF/web.xml

#copy robots.txt
cp -Rf $path/website/website-config/robots.txt $path/website/website-sync/target/website-sync-0.0.1-SNAPSHOT/
cp -Rf $path/website/website-config/robots.txt $path/website/website-web/target/website-web-0.0.1-SNAPSHOT/
cp -Rf $path/website/website-config/robots.txt $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/


function jrestart()
{
	cd $1
	./bin/jetty.sh restart
}

jrestart $path/bin/jetty
jrestart $path/bin/jettyweb
jrestart $path/bin/jettysync
