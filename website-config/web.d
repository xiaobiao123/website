#database config
jdbc.driver=com.mysql.jdbc.Driver
jdbc.url=jdbc:mysql://rdse5ucfalrjt44ec8wya.mysql.rds.aliyuncs.com:3306/WEBSITE3?characterEncoding=utf-8
jdbc.username=goujia
jdbc.password=goujia0991
pool.maxPoolSize=10
pool.minPoolSize=3

#databaseGes config
jdbc.driverGes=com.mysql.jdbc.Driver
jdbc.urlGes=jdbc:mysql://rdsbzf6z2emzeyj.mysql.rds.aliyuncs.com:3306/tdiy?characterEncoding=utf-8
jdbc.usernameGes=goujia
jdbc.passwordGes=goujia0512
pool.maxPoolSizeGes=10
pool.minPoolSizeGes=3

#goujiabao
goujiabao.noticeURL=http://dwww.goujiawang.com/alert/notice.html
goujiabao.tradePath=web.zj.icbc.com.cn/cashier/
goujiabao.merid=gjw
goujiabao.mername=goujiawang
goujiabao.password=lAPWosnVn8jwisqrQTcXLA2eyeCdkJnV
#goujiabao.password=lAPWosnVn8jwisqrQTcXLA2eyeCdkJnV
goujiabao.jumpUrl=http://dwww.goujiawang.com/personOrder/orderListView.html
goujiabao.privateKey=/home/goujia/project/web/deve/website/key/gjw.private.key
goujiabao.publicKey=/home/goujia/project/web/deve/website/key/gjw.public.key
goujiabao.confirmUrl=http://12.1.1.1:12074

#cas-server url
sso.url=https://dsso.goujiawang.com

#server url
server.url=http://dwww.goujiawang.com

#recommend code
banner=banner
rec_sj=SJArticle
rec_zx=ZXArticle
rec_jc=JCArticle
topic=topic
question=sayanything
indexBanner=indexBanner

#label peroperty
peroperty_sj=100104
peroperty_zx=100102
peroperty_jc=100103

#url
store.image=/home/goujia/project/html/store/dwebsite
review.image=http://cdn.goujiawang.com/store/dwebsite
review.ges.image=http://cdn.goujiawang.com/store
remote.url=http://dsync.goujiawang.com
review.ges.image=http://cdn.goujiawang.com/store

# recommend address
rectopic_one=437
rectopic_two=439
rectopic_three=438
#question category
question_one=437
quesiton_two=438
quesiton_three=439
#website column
website_column=436
#新闻标签的id
news.label.id=863


remote.url=http://dsync.goujiawang.com

ges.review.image=http://cdn.goujiawang.com/store/
#goujiabao.confirmUrl=444

#ucenter地址
ucenter.url=http://ducenter.goujiawang.com
#当前平台在ucenter中的编号，官网为0，GES为0
current.platform.number=0
#rabbitmq
rabbitmq.addr=10.51.20.172
rabbitmq.username=test
rabbitmq.password=test123
rabbitmq.vhost=/test


#版本号
v=GJWv3.1.4
