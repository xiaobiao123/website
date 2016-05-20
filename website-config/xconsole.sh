path=/home/goujia/project/goujia/web/website

cd $path/website

#git pull origin `git branch -a |tail -1 |awk -F'/' '{print $NF}'`
git pull origin master

cd $path/website/website-console
mvn clean package

#modify some file
sed -i 's/PATH_CONTEXT="\/web"/PATH_CONTEXT="http:\/\/t_website.goujiawang.com"/g' $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js

#config log4j.xml
sed -i "s/debug/warn/g" $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/log4j.xml

#copy application
cp -Rf $path/website/website-config/application.properties.console.test $path/website/website-console/target/website-console-0.0.1-SNAPSHOT/WEB-INF/classes/application.properties


#reboot jetty
rm -rf $path/bin/jetty/logs/*
cd $path/bin/jetty
./bin/jetty.sh restart
