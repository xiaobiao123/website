package com.goujia.website.console.controller.specialTopic;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goujia.website.base.entity.question.Question;
import com.goujia.website.base.entity.specialtopic.SpecialTopic;
import com.goujia.website.base.vo.BaseSearchParam;
import com.goujia.website.base.vo.article.ArticleVO;
import com.goujia.website.base.vo.question.QuestionSearchParam;
import com.goujia.website.base.vo.specialtopic.SpecialTopicSearchParam;
import com.goujia.website.base.vo.topic.TopicSearchParam;
import com.goujia.website.base.vo.topic.TopicVo;
import com.goujia.website.console.controller.ConsoleController;
import com.goujia.website.service.article.ArticleService;
import com.goujia.website.service.article.LabelService;
import com.goujia.website.service.question.QuestionService;
import com.goujia.website.service.specialtopic.SpecialTopicAssociationService;
import com.goujia.website.service.specialtopic.SpecialTopicService;
import com.goujia.website.service.topic.TopicService;

@Controller
@RequestMapping("specialTopic")
public class SpecialTopicController extends ConsoleController {

    @Autowired
    private SpecialTopicService specialTopicService;
    @Autowired
    private SpecialTopicAssociationService specialTopicAssociationService;
    // 标签service
    @Autowired
    private LabelService labelService;
    // 问题service
    @Autowired
    private QuestionService questionService;
    // 话题service
    @Autowired
    private TopicService topicService;
    // 文章service
    @Autowired
    private ArticleService articleService;

    /**
     * 方法描述：专题分页查询列表
     * 
     * @param model
     * @param searchParam
     *            搜索条件
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model, SpecialTopicSearchParam searchParam) {
        if (searchParam == null) {
            searchParam = new SpecialTopicSearchParam();
        }
        model.addAttribute("searchParam", searchParam);
        model.addAttribute("page", specialTopicService.search(searchParam));
        return "specialTopic/index";
    }

    /**
     * 方法描述： 批量作废专题
     * 
     * @param ids
     *            专题id字符串
     * @return
     */
    @RequestMapping("/batchInvalid")
    public String batchInvalid(String ids) {
        String[] idArray = ids.split(",");
        List<Integer> list = new ArrayList<Integer>();
        for (String id : idArray) {
            list.add(Integer.parseInt(id));
        }
        specialTopicService.batchInvalid(list);
        return "redirect:/specialTopic/index.htm";
    }

    /**
     * 方法描述新增和编辑专题界面
     * 
     * @param id
     *            专题id
     * @param model
     * @return
     */
    @RequestMapping("/detail")
    public String detail(int id, Model model) {
        if (0 != id) {
            SpecialTopic specialTopic = specialTopicService.get(id);
            model.addAttribute("specialTopic", specialTopic);
            model.addAttribute("specialTopicId", id);
            model.addAttribute("isDeleted", specialTopic.getIsDeleted());
        } else {
            model.addAttribute("specialTopic", new SpecialTopic());
            model.addAttribute("specialTopicId", 0);
            model.addAttribute("isDeleted", "n");
        }
        return "specialTopic/detail";
    }

    /**
     * 保存并退出
     * 
     * @param entity
     * @return
     */
    @RequestMapping(value = "saveAndQuit")
    @ResponseBody
    public Object[] saveAndQuit(SpecialTopic entity, HttpServletRequest request) {
        int id = entity.getId();
        if (0 == id) {// 表示是新增
            Object[] obj = new Object[3];
            Boolean isSuccess = Boolean.FALSE;
            String msg = "保存失败！请稍后再试！";
            entity.setImagePath(entity.getInfoImage());
            entity.setOwnerId(1);
            isSuccess = specialTopicService.create(entity);
            if (isSuccess) {
                msg = "保存成功";
            }
            obj[0] = isSuccess;
            obj[1] = msg;
            obj[2] = entity.getId();
            return obj;
        } else {// 表示修改
            Object[] obj = new Object[3];
            Boolean isSuccess = Boolean.FALSE;
            String msg = "保存失败！请稍后再试！";
            entity.setImagePath(entity.getInfoImage());
            isSuccess = specialTopicService.update(entity);
            if (isSuccess) {
                msg = "保存成功";
            }
            obj[0] = isSuccess;
            obj[1] = msg;
            obj[2] = entity.getId();
            return obj;
        }

    }

    /**
     * 方法描述：查看关联文章列表
     * 
     * @param id
     *            主题id
     * @param model
     * @return 关联文章列表
     * @author zhaoyonglian 15-6--10
     */
    @RequestMapping(value = "recommendArticle")
    public String recommendArticle(int id, String isDeleted, Model model) {
        if (null == isDeleted) {
            isDeleted = "n";
        }
        List<ArticleVO> articleList = null;
        if (0 != id) {
            articleList = specialTopicAssociationService
                    .findAssociationArticle(id);
        }
        model.addAttribute("articleList", articleList);
        model.addAttribute("specialTopicId", id);
        model.addAttribute("isDeleted", isDeleted);
        return "specialTopic/recommendArticle";
    }

    /**
     * 方法描述：查看在线文章列表
     * 
     * @param name
     *            文章名字
     * @param param
     *            搜索条件
     * @param specialTopicId
     *            专题id
     * @param request
     * @param model
     * @return
     */
    @RequestMapping(value = "articleList")
    public String articleList(String name, BaseSearchParam param,
            int specialTopicId, Model model) {
        model.addAttribute("searchParam", param);
        model.addAttribute("page", articleService.findFormalByName(name, param));
        model.addAttribute("specialTopicId", specialTopicId);
        return "specialTopic/articleList";
    }

    /**
     * 方法描述：查看关联的话题 列表
     * 
     * @param id
     *            专题id
     * @param model
     * @return 关联话题列表
     */
    @RequestMapping(value = "recommendTopic")
    public String recommendTopic(int id, String isDeleted, Model model) {
        if (null == isDeleted) {
            isDeleted = "n";
        }
        List<TopicVo> topicList = null;
        if (0 != id) {
            topicList = specialTopicAssociationService.findAssociationTopic(id);
        }
        model.addAttribute("topicList", topicList);
        model.addAttribute("specialTopicId", id);
        model.addAttribute("isDeleted", isDeleted);
        return "specialTopic/recommendTopic";
    }

    /**
     * 方法描述：分页查看在线问题列表
     * 
     * @param searchParam
     *            搜索条件
     * @param model
     * @return 问题列表
     * @author zhaoyonglian 15-6-11
     */
    @RequestMapping(value = "topicList")
    public String topicList(TopicSearchParam searchParam, int specialTopicId,
            Model model) {
        model.addAttribute("searchParam", searchParam);
        model.addAttribute("page", topicService.page(searchParam));
        model.addAttribute("specialTopicId", specialTopicId);
        return "specialTopic/topicList";
    }

    /**
     * 方法描述：查看关联的问题列表
     * 
     * @param id
     *            专题id
     * @param model
     * @return 关联问题列表
     */
    @RequestMapping(value = "recommendQuestion")
    public String recommendQuestion(int id, String isDeleted, Model model) {
        if (null == isDeleted) {
            isDeleted = "n";
        }
        List<Question> questionList = null;
        if (0 != id) {
            questionList = specialTopicAssociationService
                    .findAssociationQuestion(id);
        }
        model.addAttribute("questionList", questionList);
        model.addAttribute("specialTopicId", id);
        model.addAttribute("isDeleted", isDeleted);
        return "specialTopic/recommendQuestion";
    }

    /**
     * 方法描述：分页查看在线问题列表
     * 
     * @param searchParam
     *            搜索条件
     * @param model
     * @return 问题列表
     * @author zhaoyonglian 15-6-11
     */
    @RequestMapping(value = "questionList")
    public String questionList(QuestionSearchParam searchParam,
            int specialTopicId, Model model) {
        searchParam.setIsDeleted("n");
        model.addAttribute("searchParam", searchParam);
        model.addAttribute("page", questionService.search(searchParam));
        model.addAttribute("specialTopicId", specialTopicId);
        return "specialTopic/questionList";
    }

    /**
     * 方法描述：单个 或者 批量增加关联关系
     * 
     * @param specialTopicId
     *            专题id
     * @param associationIds
     *            关联id字符串
     * @param contentType
     *            类型 文章，话题，问题
     * @return 调整页面
     * @author zhaoyonglian 15-6-11
     */
    @RequestMapping("/addAssociation")
    public String addAssociation(int specialTopicId, String associationIds,
            String contentType,Model model) {
        if (StringUtils.isNotBlank(associationIds)) {
            if (!associationIds.isEmpty() && !associationIds.equals("")) {
                String[] ids = associationIds.split(",");
                List<Integer> list = new ArrayList<Integer>();
                for (String id : ids) {
                    list.add(Integer.parseInt(id));
                }
                specialTopicAssociationService.batchCreate(specialTopicId,
                        contentType, list);
            }
        }
        switch (contentType) {
        case "article":
            return this.recommendArticle(specialTopicId, "n",model);
        case "topic":
            return this.recommendTopic(specialTopicId, "n", model);
        case "question":
            return this.recommendQuestion(specialTopicId, "n", model);
        }
        return "";
    }

    /**
     * 移除一条/批量移除关联记录
     * 
     * @param contentType
     * @param AssociationId
     * @return
     */
    @RequestMapping(value = "removeAssociation")
    public String removeAssociation(int specialTopicId, String associationId,
            String contentType) {

        if (StringUtils.isNotBlank(associationId)) {
            if (!associationId.isEmpty() && !associationId.equals("")) {
                String[] ids = associationId.split(",");
                List<Integer> list = new ArrayList<Integer>();
                for (String id : ids) {
                    list.add(Integer.parseInt(id));
                }
                specialTopicAssociationService.batchDelete(list, contentType);
            }
        }
        switch (contentType) {
        case "article":
            return "redirect:/specialTopic/recommendArticle.htm?id="
                    + specialTopicId + "&isDeleted=n";
        case "topic":
            return "redirect:/specialTopic/recommendTopic.htm?id="
                    + specialTopicId + "&isDeleted=n";
        case "question":
            return "redirect:/specialTopic/recommendQuestion.htm?id="
                    + specialTopicId + "&isDeleted=n";
        }
        return "";
    }

}
