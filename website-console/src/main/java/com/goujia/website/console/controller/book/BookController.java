package com.goujia.website.console.controller.book;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.goujia.website.base.vo.BaseSearchParam;
import com.goujia.website.base.vo.system.BookSearchParam;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.system.BookService;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-console
 * @version 2.0
 * 
 *          方法描述：预约管理control类
 * 
 * @author liqingfeng  15-6-4
 * 
 */

@Controller
@RequestMapping("/book/info")
public class BookController extends ConsoleController{
    @Autowired
    private BookService bookService;
    /**
     * 获取预约数据列表
     * @param name
     * @param model
     * @param param
     * @return list
     */
    @RequestMapping("/index")
    public String  index(BookSearchParam param,Model model){
          model.addAttribute("page", null);
          model.addAttribute("page", bookService.search(initSearchParam(param)));
          model.addAttribute("searchParam", param);
        return "book/book-info";
    }
    
    private BookSearchParam initSearchParam(BookSearchParam param) {
        if(param == null){
            param = new BookSearchParam();
        }
        return param;
    }
}
