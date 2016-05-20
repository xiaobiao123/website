

/**   
* @Title: EmailCode.java
* @Package com.goujia.website.base.entity.code.email
* @Description: TODO(用一句话描述该文件做什么)
* @author chenghao   
* @date Sep 23, 2015 4:05:03 PM
* @version V1.0   
*/
package com.goujia.website.base.entity.code.email;

import java.util.Date;



/**
 * @Description: 
 * @author  chenghao
 * @date Sep 23, 2015 4:05:03 PM
 * 
 */
public class EmailCode {
    private Integer id;
    private Integer user;
    private String code;
    private String email;
    private Date pubdate;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getUser() {
        return user;
    }
    public void setUser(Integer user) {
        this.user = user;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Date getPubdate() {
        return pubdate;
    }
    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }
}
