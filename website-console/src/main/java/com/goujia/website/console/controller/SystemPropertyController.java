package com.goujia.website.console.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.entity.system.SystemProperty;
import com.goujia.website.base.vo.BaseSearchParam;
import com.goujia.website.service.system.SystemPropertyService;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-console
 * @author Wangfeng
 * @version 2.0
 * @date 2015年5月28日
 */
@Controller
@RequestMapping("/system")
public class SystemPropertyController extends ConsoleController {
    @Autowired
    private SystemPropertyService service;
    
    /**
     * 
    * @Description  系统属性列表
    * @param request
    * @param response
    * @param model
    * @param param
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月20日 下午5:02:25
     */
    @RequestMapping("/index")
    public String index(HttpServletRequest request,
            HttpServletResponse response, Model model,BaseSearchParam param) {
        model.addAttribute("page", service.pageList(param));
        return "system/systemProperty";
    }
    
    /**
     * 
    * @Description  详情页
    * @param request
    * @param id
    * @param response
    * @param model
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月20日 下午5:02:51
     */
    @RequestMapping("/detail")
    public String detail(HttpServletRequest request,Integer id,
            HttpServletResponse response, Model model){
        if(null != id && !id.equals(0)){
            model.addAttribute("info", service.getById(id));
        }else{
            model.addAttribute("info", new SystemProperty());
        }
        return "system/detail";
    }
    
    /**
     * 
    * @Description  修改属性值
    * @param request
    * @param property
    * @param response
    * @param model
    * @return
    * @author zhaoyonglian   
    * @date 2015年11月20日 下午5:03:34
     */
    @RequestMapping("/update")
    @ResponseBody
    public Object[] update(HttpServletRequest request,SystemProperty property,
            HttpServletResponse response, Model model){
        Object[] obj = new Object[2];
        Boolean isSuccess = Boolean.FALSE;
        String msg = "修改失败！请稍后再试！";
        if (null != property) {
            isSuccess = service.update(property);
        }
        if (isSuccess) {
            msg = "修改成功！";
        }
        obj[0] = isSuccess;
        obj[1] = msg;
        return obj;
    }
}
