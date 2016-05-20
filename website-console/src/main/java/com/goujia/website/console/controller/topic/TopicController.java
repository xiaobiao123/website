package com.goujia.website.console.controller.topic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.goujia.website.base.entity.topic.Topic;
import com.goujia.website.base.entity.topic.TopicArticle;
import com.goujia.website.base.utils.Page;
import com.goujia.website.base.vo.BaseSearchParam;
import com.goujia.website.base.vo.topic.TopicSearchParam;
import com.goujia.website.base.vo.topic.TopicVo;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.article.ArticleService;
import com.goujia.website.service.topic.TopicArticleService;
import com.goujia.website.service.topic.TopicService;

@Controller
@RequestMapping("/topic")
public class TopicController extends ConsoleController {

    @Autowired
    private TopicService topicService;
    @Autowired
    private TopicArticleService topicArticleService;
    @Autowired
    private ArticleService articleService;

    /**
     * 方法描述：查看话题列表
     * 
     * @param searchParam
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("index")
    public String index(TopicSearchParam searchParam,
            HttpServletRequest request, Model model) {

        model.addAttribute("listPage", topicService.page(searchParam));
        model.addAttribute("recovery", topicService.recoverylist(searchParam));
        model.addAttribute("searchParam", searchParam);
        return "topic/index";
    }

    /**
     * 方法描述：进入编辑或者新增界面
     * 
     * @param id
     *            话题id
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/detail")
    public String detail(int id, HttpServletRequest request, Model model) {
        if (0 != id) {
            model.addAttribute("topic", topicService.get(id));
            model.addAttribute("topicId", id);
            return "topic/detail";
        } else {
            model.addAttribute("topic", new Topic());
            model.addAttribute("topicId", 0);
            return "topic/add";
        }
    }

    /**
     * 方法描述：查看相关文章列表
     * 
     * @param id
     * @param request
     * @param model
     * @return
     * @author zhaoyonglian 15-7-6
     */
    @RequestMapping("/relationedArticle")
    public String relationedArticle(int id, Model model) {
        model.addAttribute("topicId", id);
        if (0 != id) {
            model.addAttribute("articleList", topicArticleService.list(id));
        } else {
            model.addAttribute("articleList", null);
        }
        return "topic/relationedArticle";
    }

    /**
     * 方法描述：文章列表
     * 
     * @param topicId
     * @param name
     * @param param
     * @param model
     * @return zhaoyonglian 15-7-6
     */
    @RequestMapping("/articleList")
    public String articleList(int topicId, String name, BaseSearchParam param,
            Model model) {
        model.addAttribute("searchParam", param);
        model.addAttribute("page", articleService.findFormalByName(name, param));
        model.addAttribute("topicId", topicId);
        return "topic/articleList";
    }

    @RequestMapping("/addAssociation")
    public String addAssociation(int topicId, String associationIds, Model model) {
        if (!associationIds.isEmpty() && !associationIds.equals("")) {
            String[] ids = associationIds.split(",");
            List<TopicArticle> list = new ArrayList<TopicArticle>();
            for (String id : ids) {
                TopicArticle obj = new TopicArticle();
                obj.setArticleId(Integer.parseInt(id));
                obj.setTopicId(topicId);
                list.add(obj);
            }
            topicArticleService.batchCreate(list);
        }
        return this.relationedArticle(topicId, model);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public String delete(@RequestParam String ids) {
        return topicService.delete(ids);
    }

    /** 话题查询 */
    @RequestMapping("query")
    public @ResponseBody
    Topic queryTopic(Integer id) {
        return topicService.queryById(id);

    }

    /** 恢复废除话题 */
    @RequestMapping("recoveryMessage")
    public String recoveryMessage(Integer[] idstr) {
        if (idstr != null) {

            for (Integer id : idstr) {
                topicService.recoveryMessage(id);
            }
        }

        // return topicService.delbatch(id);
        return "redirect:index.htm";

    }

    /** 删除话题 */
    @RequestMapping("delArticle")
    @ResponseBody
    public String delArticle(@RequestParam String idstr) {
        return topicService.delArticle(idstr);

    }

    /**
     * 保存并退出
     * 
     * @param entity
     * @return
     */
    @RequestMapping(value = "saveAndQuit")
    @ResponseBody
    public Object[] saveAndQuit(Topic topic, HttpServletRequest request) {
        int id = topic.getId();
        topic.setImagePath(topic.getInfoImage());
        if (0 == id) {// 表示是新增
            Object[] obj = new Object[3];
            Boolean isSuccess = Boolean.FALSE;
            String msg = "保存失败！请稍后再试！";
            /*
             * entity.setImagePath(entity.getInfoImage()); entity.setOwnerId(1);
             */
            isSuccess = topicService.creat(topic);
            if (isSuccess) {
                msg = "保存成功";
            }
            obj[0] = isSuccess;
            obj[1] = msg;
            obj[2] = topic.getId();
            return obj;
        } else {// 表示修改
            Object[] obj = new Object[3];
            Boolean isSuccess = Boolean.FALSE;
            String msg = "保存失败！请稍后再试！";
            isSuccess = topicService.update(topic);
            if (isSuccess) {
                msg = "保存成功";
            }
            obj[0] = isSuccess;
            obj[1] = msg;
            obj[2] = topic.getId();
            return obj;
        }

    }

    @RequestMapping("listWithCount")
    public String listWithCount(String name, String json, Model model,
            BaseSearchParam param) {
        Gson gson = new Gson();
        List<Topic> hadList = gson.fromJson(json, new TypeToken<List<Topic>>() {
        }.getType());
        Set<Integer> set = new HashSet<Integer>();
        for (Topic t : hadList) {
            set.add(t.getId());
        }
        Page<TopicVo> list = topicService.findAllWithCountByName(name, param);
        Long count = list.getTotalCount();
        for (int i = list.getResult().size() - 1; i >= 0; i--) {
            if (set.contains(list.getResult().get(i).getId())) {
                list.getResult().remove(i);
                count--;
            }
        }
        list.setTotalCount(count);
        model.addAttribute("list", list);
        return "article/topicPanel";
    }
}
