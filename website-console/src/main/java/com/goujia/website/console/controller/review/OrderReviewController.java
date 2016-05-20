package com.goujia.website.console.controller.review;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.entity.comment.OrderReview;
import com.goujia.website.base.vo.comment.OrderReviewSearchParam;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.comment.OrderReviewService;

/**
 * Copyright 2014-2015 www.goujiawang.com All rights reserved.
 * 
 * @project website-console
 * @version 2.0
 * 
 *          方法描述：问题control类
 * 
 * @author zhaoyonglian 15-6-3
 * 
 */

@Controller
@RequestMapping("/order/review")
public class OrderReviewController extends ConsoleController {
    @Autowired
    private OrderReviewService service;

    /**
     * 
     * @Description 添加评论
     * @param review
     *            评论对象
     * @param request
     * @return 添加结果
     * @author zhaoyonglian
     * @date 2015年8月7日 下午2:21:16
     */
    @RequestMapping("/add")
    @ResponseBody
    public Object[] add(OrderReview review, HttpServletRequest request) {
        Object[] obj = new Object[2];
        Boolean isSuccess = Boolean.FALSE;
        String msg = "添加失败！请稍后再试！";
        isSuccess = service.add(review);
        if (isSuccess) {
            msg = "添加成功！";
        }
        obj[0] = isSuccess;
        obj[1] = msg;
        return obj;
    }

    /**
     * 
     * @Description 分页查询
     * @param searchParam
     * @param request
     * @param model
     * @return
     * @author zhaoyonglian
     * @date 2015年8月7日 下午2:21:42
     */
    @RequestMapping("/listPage")
    public String listPage(OrderReviewSearchParam searchParam,
            HttpServletRequest request, Model model) {
        model.addAttribute("page", service.listPage(searchParam));
        if (searchParam.getIsDeleted().contains("y")) {
            return "review/orderReviewDelete";
        } else {
            return "review/orderIndex";
        }
    }

    /**
     * 
     * @Description 单个或者批量软删除评论
     * @param ids
     * @return
     * @author zhaoyonglian
     * @date 2015年8月7日 下午2:22:09
     */
    @RequestMapping("/disable")
    @ResponseBody
    public boolean disable(@RequestParam String ids) {
        return service.disable(ids);
    }

}
