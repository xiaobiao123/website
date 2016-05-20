package com.goujia.website.console.controller.review;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.vo.comment.ImageReviewSearchParam;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.comment.ImageReviewService;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-console
 * @version 2.0
 * 
 *          方法描述：图片评论control类
 * 
 * @author liqingfeng 15-8-10
 * 
 */

@Controller
@RequestMapping("/image/review")
public class ImageReviewController extends ConsoleController{
    @Autowired
    private ImageReviewService service;
    /**
     * 
     * @Description 分页查询
     * @param searchParam
     * @param request
     * @param model
     * @return
     * @author liqingfng
     * @date 2015年8月10日 下午2:21:42
     */
    @RequestMapping("/listPage")
    public String listPage(ImageReviewSearchParam searchParam,
            Model model) {
        model.addAttribute("page", service.listPage(searchParam));
        if (searchParam.getIsDeleted().contains("y")) {
            return "review/imageReviewDelete";
        } else {
            return "review/imageIndex";
        }
    }

    /**
     * 
     * @Description 单个或者批量软删除评论
     * @param ids
     * @return
     * @author liqingfeng
     * @date 2015年8月10日
     */
    @RequestMapping("/disable")
    @ResponseBody
    public boolean disable(@RequestParam String ids) {
        return service.disable(ids);
    }
}
