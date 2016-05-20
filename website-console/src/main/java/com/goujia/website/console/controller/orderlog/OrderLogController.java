package com.goujia.website.console.controller.orderlog;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.entity.orderlog.OrderLog;
import com.goujia.website.base.entity.orderlog.OrderVideo;
import com.goujia.website.base.ges.entity.Order;
import com.goujia.website.base.vo.BaseSearchParam;
import com.goujia.website.base.vo.orderlog.OrderLogSearchParam;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.article.LabelService;
import com.goujia.website.service.ges.OrderService;
import com.goujia.website.service.orderlog.OrderLogService;

/**
 * 
* @Description: 直播家日志
* @author  zhaoyonglian
* @date 2015年8月15日 下午3:47:08
*
 */
@Controller
@RequestMapping("/order/log")
public class OrderLogController extends ConsoleController {
	@Autowired
	private OrderLogService service;
	@Autowired
	private OrderService orderService;
	@Autowired
	private LabelService labelService;
	
	/**
	 * 
	* @Description  日志增加/详情页
	* @param id
	* @param request
	* @param model
	* @return
	* @author zhaoyonglian   
	* @date 2015年8月18日 下午1:53:30
	 */
	@RequestMapping("/detail")
	public String deatil(Integer id,Integer orderId, HttpServletRequest request, Model model){
	    if(null != id){
	        model.addAttribute("log", service.getById(id));
	    }else{
	        model.addAttribute("log", new OrderLog());
	    }
	    model.addAttribute("orderId", orderId);
	    return "orderlog/logDetail";
	}
	
	/**
	 * 
	* @Description  日志相册
	* @param log_id
	* @param request
	* @param model
	* @return
	* @author zhaoyonglian   
	* @date 2015年8月18日 下午2:47:06
	 */
//	@RequestMapping("/imageList")
//	public String imageList(Integer logId,HttpServletRequest request, Model model){
//	    model.addAttribute("images", service.getAllByLog(logId));
//	    return "orderlog/imageList";
//	}
	/**
	 *  
	* @Description  添加日志信息
	* @param log
	* @param request
	* @return
	* @author zhaoyonglian   
	* @date 2015年8月15日 下午4:02:50
	 */
	@RequestMapping("/save")
	@ResponseBody
	public Object[] add(OrderLog log,
            HttpServletRequest request){
	    boolean result = false;
	    Object[] obj = new Object[2];
        String message= null;
	    if(null != log.getId()){
	        result = service.update(log);
	    }else{
	        result = service.add(log);
	    }
	    if(result){
            message = "保存成功";
        }else{
            message = "保存失败";
        }
	    obj[0] = result;
	    obj[1] = message;
	    return obj;
	}
	
	/**
	 *  
	* @Description  编辑视频地址
	* @param video  视频对戏
	* @param request
	* @return
	* @author zhaoyonglian   
	* @date 2015年8月24日 上午11:07:44
	 */
	@RequestMapping("/saveVideo")
    @ResponseBody
    public Object[] saveVideo(OrderVideo video,
            HttpServletRequest request){
        boolean result = false;
        Object[] obj = new Object[2];
        String message= null;
        result = service.editVideo(video);
        if(result){
            message = "保存成功";
        }else{
            message = "保存失败";
        }
        obj[0] = result;
        obj[1] = message;
        return obj;
    }
	
	/**
	 * 
	* @Description  分页查看订单列表
	* @param order  搜索条件
	* @param searchParam
	* @param request
	* @param model
	* @return
	* @author zhaoyonglian   
	* @date 2015年8月15日 下午4:12:46
	 */
	@RequestMapping("/orderListPage")
	public String orderListPage(Order order, BaseSearchParam searchParam,
	        HttpServletRequest request,Model model){
	    model.addAttribute("page", orderService.orderListPage(order, searchParam));
	    model.addAttribute("baseSearch", searchParam);
	    return "orderlog/orderList";
	}
	
	
	/**
	 * 
	* @Description  分页查看直播家订单列表中订单的日志列表
	* @param searchParam
	* @param request
	* @param model
	* @return
	* @author zhaoyonglian   
	* @date 2015年8月15日 下午4:06:05
	 */
	@RequestMapping("/logListPage")
	public String logListPage(OrderLogSearchParam searchParam,
            HttpServletRequest request,Model model){
	    model.addAttribute("page", service.listPage(searchParam));
	    OrderVideo video = service.getVideoByOrder(searchParam.getOrderId());
	    model.addAttribute("video", video);
        model.addAttribute("searchParam", searchParam);
        model.addAttribute("orderId", searchParam.getOrderId());
        return "orderlog/logList";
	}
	
	/**
	 * 
	* @Description  批量删除
	* @param ids  ids字符串
	* @param request
	* @return
	* @author zhaoyonglian   
	* @date 2015年8月17日 下午8:06:09
	 */
	@RequestMapping("deleteList")
	@ResponseBody
	public Object[] deleteLog(String ids,HttpServletRequest request){
	    boolean result = service.deleteList(ids);
        Object[] obj = new Object[2];
        String message= null;
        if(result){
            message = "删除成功";
        }else{
            message = "删除失败";
        }
        obj[0] = result;
        obj[1] = message;
        return obj;
	}
	
	/**
	 * 
	* @Description  传递变量i
	* @param i
	* @param request
	* @param model
	* @return
	* @author zhaoyonglian   
	* @date 2015年8月28日 下午2:09:28
	 */
	@RequestMapping("/addImageUpload")
	public String addImageUpload(Integer i,HttpServletRequest request,Model model){
	    model.addAttribute("i", i);
	    return "orderlog/image";
	}

}
