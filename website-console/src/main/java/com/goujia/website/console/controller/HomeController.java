package com.goujia.website.console.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.constants.base.SysConstants;
import com.goujia.website.base.entity.system.Menu;
import com.goujia.website.base.entity.system.UserAdmin;
import com.goujia.website.base.utils.encrypt.MD5;
import com.goujia.website.base.vo.system.UserVO;
import com.goujia.website.service.system.MenuService;
import com.goujia.website.service.system.UserService;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-console
 * @author Wangfeng
 * @version 2.0
 * @date 2015年5月28日
 */
@Controller
@RequestMapping("/home")
public class HomeController extends ConsoleController {

    @Autowired
    private MenuService menuService;
    @Autowired
    private UserService userService;
    @RequestMapping("index")
    public String index(HttpServletRequest request,
            HttpServletResponse response, Model mode) {

        return "index";
    }
    /**
    * @Title: login 
    * @Description: TODO(后台账号登录并存在session里) 
    * @param @param request
    * @param @param response
    * @param @param mode
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    @RequestMapping("login")
    public String login(HttpServletRequest request,
            HttpServletResponse response, Model mode) {
        String url="home/index";
        String msg="";
        UserAdmin user = new UserAdmin();
        user.setUserName(request.getParameter("userName"));
        user.setPasswordKey(MD5.encryptMD5(request.getParameter("passWord")));
        UserAdmin realUser=userService.getUserAdmin(user);
        if(null==realUser){
            msg="账号或密码错误";
            mode.addAttribute("msg", msg);
            url="index";
        }else{
            request.getSession().setAttribute(SysConstants.SESSION_MEMBER_USER, realUser);
        }
        return url;
    }

    /**
     * 
     * @Title: passwd
     * @Description: TODO(跳去修改密码)
     * @param @param request
     * @param @param response
     * @param @param mode
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    @RequestMapping("passwd")
    public String passwd(HttpServletRequest request,
            HttpServletResponse response, Model mode) {
        return "pwd";
    }
    /**
     * 
    * @Title: updateUserPwd 
    * @Description: TODO(执行密码修改) 
    * @param @param request
    * @param @param response
    * @param @param mode
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    @RequestMapping("updateUserPwd")
    @ResponseBody
    public Object[] updateUserPwd(HttpServletRequest request,
            HttpServletResponse response, Model mode){
        Object[] obj = new Object[2];
        Boolean isSuccess = Boolean.FALSE;
        String msg = "修改失败";
        UserAdmin user=(UserAdmin) request.getSession().getAttribute(SysConstants.SESSION_MEMBER_USER);
        String oldPwd=MD5.encryptMD5(request.getParameter("oldPwd"));
        if(user.getPasswordKey().equals(oldPwd)){
            String newPwd=MD5.encryptMD5(request.getParameter("newPwd"));
            user.setPasswordKey(newPwd);
            userService.updataUserAdmin(user);
            isSuccess=Boolean.TRUE;
            msg = "密码修改成功，请重新登入";
        }else{
            msg="原密码输入错误";
        }
        obj[0] = isSuccess;
        obj[1] = msg;
        return obj;
    }
    /**
     * 
     * @Title: logout
     * @Description: TODO(后台管理员登出)
     * @param @param servletRequest
     * @param @param response
     * @param @param mode
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    @RequestMapping("logout")
    public String logout(HttpServletRequest request,
            HttpServletResponse response, Model mode) {
        request.getSession().setAttribute(SysConstants.SESSION_MEMBER_USER,
                null);
        return "index";
    }

    /**
     * 
     * @param mode
     * @return
     */
    @RequestMapping("left")
    public String left(HttpServletRequest request,
            HttpServletResponse response, Map<String, Object> mode) {
        List<Menu> menus = menuService.list();

        List<Menu> mainMenu = new ArrayList<Menu>();
        Map<String, List<Menu>> childMenus = new HashMap<String, List<Menu>>();

        setMenu(menus, mainMenu, childMenus);

        mode.put("mainMenus", mainMenu);
        mode.put("childMenus", childMenus);

        return "home/left";
    }

    /**
     * @param
     */
    @RequestMapping("404")
    public String notFound() {

        return "error/404";
    }

    /**
     * 组装父级、子级菜单
     */
    private void setMenu(List<Menu> permissionList, List<Menu> mainMenu,
            Map<String, List<Menu>> childMenus) {
        List<Menu> childMenu = new ArrayList<Menu>();

        for (Menu mu : permissionList) {
            if (mu.getParentId() == 0) {
                mainMenu.add(mu);
            } else {
                childMenu.add(mu);
            }
        }

        for (Menu mu : mainMenu) {
            List<Menu> temp = new ArrayList<Menu>();
            for (Menu child : childMenu) {
                if (mu.getId().equals(child.getParentId())) {
                    temp.add(child);
                }
            }
            childMenus.put(mu.getId().toString(), temp);
        }
    }
}
