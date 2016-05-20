package com.goujia.website.base.vo.system;

import java.io.Serializable;

import com.goujia.website.base.entity.system.User;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-base
 * @author Wangfeng
 * @version 2.0
 * @date 2015年5月28日
 */
public class UserVO extends User implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    /**
     * RoleName
     */
    private String roleName;

    /**
     * RoleId
     */
    private int roleId;

    /**
     * deptId
     */
    private Integer deptId;

    /**
     * 是否管理
     */
    private String isBoss;

    /**
     * 姓名
     */
    private String name;

    /**
     * 角色
     */
    private String roles;

    /**
     * 创建时间起始
     */
    private String gmtCreateFrom;

    /**
     * 创建时间结束
     */
    private String gmtCreateTo;

    private String openKey; // 链接key

    public String getOpenKey() {
        return openKey;
    }

    public void setOpenKey(String openKey) {
        this.openKey = openKey;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setIsBoss(String isBoss) {
        this.isBoss = isBoss;
    }

    public String getIsBoss() {
        return isBoss;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getGmtCreateFrom() {
        return gmtCreateFrom;
    }

    public void setGmtCreateFrom(String gmtCreateFrom) {
        this.gmtCreateFrom = gmtCreateFrom;
    }

    public String getGmtCreateTo() {
        return gmtCreateTo;
    }

    public void setGmtCreateTo(String gmtCreateTo) {
        this.gmtCreateTo = gmtCreateTo;
    }
}
