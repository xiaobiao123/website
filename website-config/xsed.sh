#change ueidt
wpath=/home/goujia/project/goujia/web/website
sed -i 's/PATH_CONTEXT="\/web"/PATH_CONTEXT="http:\/\/t_website.goujiawang.com"/g' $wpath/website/website-console/target/website-console-0.0.1-SNAPSHOT/source/sui/library/ueditor/ueditor.config.js
