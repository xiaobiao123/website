package com.goujia.website.base.utils;

import java.net.URLEncoder;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import com.rabbitmq.client.AMQP.Basic.GetOk;

public class MailUtil {
	private static final String MAIL_HOST="smtp.exmail.qq.com";
	private static final String MAIL_USERNAME="goujia@goujiawang.com";
	private static final String MAIL_PASSWORD="gjw123";
	private static Session session=null;
	private static Transport transport=null;
	private static String email_validate_content="<style type='text/css'>#content{font-size:20px;font-weight:20px;color:#888;padding:40px;}a{text-decoration:none;color:#c66;}.title a{color:#d88;font-size:30px;}a:hover{color:#f88;}.sign{margin-right:100px;}</style><meta charset='UTF-8' name='renderer' content='webkit'><meta http-equiv='Content-Type' content='text/html; charset=UTF-8'></meta><div id='content'><p class='title'><a  href='http://www.goujiawang.com'>构家网</a></p><p>帐户需要验证你的电子邮件地址来完成此构家网帐户的设置，我们只需确保这是您的电子邮件地址。</p><p>验证地址：<a href='%s'>%s</a></p>如果你没有提出此请求，请不要点击。谢谢!<br><p align='right'><span class='sign'>构家网 团队</span></p><div>";
	private static String reset_password="<!DOCTYPE html> <html lang='en'>  <head>     <meta charset='UTF-8'>     <title>系统邮件找密码</title>     <style>         * {             margin: 0;             padding: 0;         }                  body {             font-family: '微软雅黑';         }                  em {             font-style: normal;         }                  .word_e {             border-left: #CCC 1px solid;             margin-top: 20px;             height: 50px;         }                  .mail-top {             margin: 0 auto;             padding-top: 50px;             height: 94px;         }                  .mail-top span {             float: left;             padding: 0px 20px 0px 20px;         }                  .mail-box {             padding-left: 80px;             width: 500px;             font-family: '宋体';         }                  .mail-txt-box {             padding-left: 30px;             padding-top: 50px;         }                  .mail-title1 {             font-size: 14px;             color: #333;         }                  .mail-title2 {             font-size: 14px;             color: #333;             padding-top: 20px;         }                  .mail-title3 {             padding-top: 10px;         }                  .mail-title3 a {             color: #9a9a9a;         }                  .mail-title4 {             padding-top: 30px;             color: #333;             font-size: 14px;             padding-bottom: 50px;             border-bottom: 1px solid #ccc;         }                  .mail-title5 {             color: #333;             font-size: 14px;             padding-top: 15px;             padding-bottom: 100px;         }      </style> </head>  <body>     <div class='mail-box'>         <div class='mail-top'>             <span>                 <a href='www.goujiawang.com'>                     <img src='http://www.goujiawang.com/goujiaV3.0/images/common/logo.png' alt='构家网' border='0' />                 </a>             </span>             <span class='word_e'>                 <em style='padding-top:7px;display:block;height:32px;font-size:22px;color:#000;line-height:32px;'>密码重置</em>             </span>         </div>         <div class='mail-txt-box'>             <p class='mail-title1'>您好!</p>             <p class='mail-title2'>请点击以下链接来重置您的密码，为了安全起见，该链接有效期为24小时：</p>             <p class='mail-title3'><a href='%s'>%s</a></p>             <p class='mail-title4'>构家网团队</p>             <p class='mail-title5'>系统发信，请忽回复</p>         </div>     </div> </body>  </html> ";
	private static synchronized void init() throws Exception{
		if(transport!=null)
			return ;
		Properties prop=new Properties();
		prop.setProperty("mail.host",MAIL_HOST);
		prop.setProperty("mail.transport.protocol", "smtp");
		prop.setProperty("mail.smtp.auth", "true");
		prop.setProperty("mail.debug", "true");
		session = Session.getInstance(prop, new Authenticator() {  
            // 在session中设置账户信息，Transport发送邮件时会使用
            protected PasswordAuthentication getPasswordAuthentication() {  
                return new PasswordAuthentication(MAIL_USERNAME, MAIL_PASSWORD);  
            }  
        });
		transport=session.getTransport();
		transport.connect();
	}
	public static void  send(String mailAddress,String subject,String content) throws Exception{
		if(transport==null)
			init();
		if(!transport.isConnected())
			transport.connect();
		subject=MimeUtility.encodeWord(subject,"utf-8","B");
		Message message=createSimpleMail(mailAddress,subject,content);
		transport.sendMessage(message, message.getAllRecipients());
	}
	public static void sendValidate(String mailAddress,String url) throws Exception{
		send(mailAddress,"构家网邮箱验证",String.format(email_validate_content, url,url));
	}
	public static void resetPassword(String mailAddress,String url) throws Exception{
		send(mailAddress,"构家网重置密码",String.format(reset_password, url,url));
	}
	private static MimeMessage createSimpleMail(String mailAddress,String subject,String content)
            throws Exception {
        //创建邮件对象
        MimeMessage message = new MimeMessage(session);
        //指明邮件的发件人
        message.setFrom(new InternetAddress(MAIL_USERNAME));
        //指明邮件的收件人，现在发件人和收件人是一样的，那就是自己给自己发
        message.setRecipient(Message.RecipientType.TO, new InternetAddress(mailAddress));
        //邮件的标题
        message.setSubject(subject);
        //邮件的文本内容
        message.setContent(content, "text/html;charset=UTF-8");
        //返回创建好的邮件对象
        return message;
    }
	public static String getValidateUrl(String ctx,String email,String code,Integer user) throws Exception{
	    email=email.replace(".","*");
	    return ctx+"/user/validate/email.htm?c="+URLEncoder.encode(code,"utf-8")+"&e="+URLEncoder.encode(email,"utf-8")+"&u="+user;
	}
	public  static String getResetPasswordUrl(String ctx,String email,String code) throws Exception{
		 email=email.replace(".","*");
		 return ctx+"/user/reset/password/step3/email?c="+URLEncoder.encode(code,"utf-8")+"&e="+URLEncoder.encode(email,"utf-8");
	}
}
