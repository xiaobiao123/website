package com.goujia.website.console.controller.enter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goujia.website.base.vo.system.EnterSearchParam;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.system.EnterService;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-console
 * @version 2.0
 * 
 *          方法描述：入驻管理control类
 * 
 * @author liqingfeng  15-6-4
 * 
 */

@Controller
@RequestMapping("/enter/info")
public class EnterController extends ConsoleController{
    @Autowired
    private EnterService enterService;
    /**
     * 获取预约数据列表
     * @param name
     * @param model
     * @param param
     * @return list
     */
    @RequestMapping("/index")
    public String  index(EnterSearchParam param,Model model){
          model.addAttribute("page", null);
          model.addAttribute("page", enterService.search(initSearchParam(param)));
          model.addAttribute("searchParam", param);
        return "enter/enter-info";
    }
    
    private EnterSearchParam initSearchParam(EnterSearchParam param) {
        if(param == null){
            param = new EnterSearchParam();
        }
        return param;
    }
}

