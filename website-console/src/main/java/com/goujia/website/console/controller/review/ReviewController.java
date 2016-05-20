/**   
* @Title: ReviewController.java
* @Package com.goujia.website.console.controller.review
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2015年6月11日 上午10:04:03
* @version V1.0   
*/


package com.goujia.website.console.controller.review;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.vo.article.ArticleReviewSearchParam;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.article.ArticleReviewService;

/**
 * @ClassName: ReviewController
 * @Description: TODO(评论管理controller)
 * @author 庄友权
 * @date 2015年6月11日 上午10:04:03
 * 
 */
@Controller
@RequestMapping("/review")
public class ReviewController extends ConsoleController{
        @Autowired
        private ArticleReviewService articleReviewService;
        /**
         * 
        * @Title: index 
        * @Description: TODO(评论管理首页) 
        * @param @param searchParam
        * @param @param request
        * @param @param response
        * @param @param mode
        * @param @return    设定文件 
        * @return String    返回类型 
        * @throws
         */
        @RequestMapping("/index")
        public String index(ArticleReviewSearchParam searchParam,HttpServletRequest request,
                HttpServletResponse response, Model mode){
            String url="review/index";
            if(searchParam.getIsDeleted().equals("y")){
                url="review/reviewDelete";
            }
            mode.addAttribute("page", articleReviewService.reviewManager(searchParam));
            mode.addAttribute("searchParam",searchParam);
            return url;
        }
        
        /**
         * 方法描述:批量或者单个作废问题
         * 
         * @param ids
         *            问题答案ID字符串
         * @return 成功/失败提醒
         * @author zyq 
         */
        @RequestMapping("/disableByIds")
        @ResponseBody
        public String disableByIds(String ids) {
            return articleReviewService.disableByIds(ids);
        }
}
