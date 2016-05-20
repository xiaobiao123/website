/**
 * Copyright 2014-2015 www.goujiawang.com
 * All rights reserved.
 * 
 * @project
 * @author jipengfei
 * @version 2.0
 * @date 2015-01-04
 */
package com.goujia.website.console.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.goujia.website.base.constants.image.ResPPE;
import com.goujia.website.base.utils.Image;
import com.goujia.website.base.utils.ImageHelper;
import com.goujia.website.base.utils.JSONUtils;
import com.goujia.website.base.utils.ListUtil;

/**
 * Created by Wangfeng 2015.6.1
 */

@Controller
@RequestMapping("store")
public class StoreController extends ConsoleController {

    @Value("${store.image}")
    private String storeImagePath;
    @Value("${review.image}")
    private String reviewImagePath;

    private final Logger LOG = LoggerFactory.getLogger(StoreController.class);

    /**
     * 上传图片
     * 
     * @param width
     *            宽
     * @param height
     *            高
     * @param maxSize
     *            图片大小
     * @param rates
     *            比例尺 s,m
     */
    @RequestMapping(value = "upload_pic", produces = "text/html; charset=UTF-8")
    public @ResponseBody
    String uploadPic(HttpServletRequest request, int width, int height,
            Integer uploadType) {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile pic = multipartRequest.getFile("pic");

        String path = null;
        try {
            ImageHelper imageHelper = new ImageHelper();
            BufferedImage bi = javax.imageio.ImageIO.read(pic.getInputStream());
            if (bi == null) {
                // 文件不是图片
                throw new RuntimeException("上传的文件不是图片");
            } else {
                Image img = imageHelper.addUploadedPic(storeImagePath, pic,
                        width, height, bi, uploadType);
                if (img == null)
                    throw new RuntimeException("服务器繁忙!");

                ResPPE rp = (ResPPE) img.getOriginal();

                if (rp != null) {
                    path = rp.getRelaDirPath() + "/" + rp.getPicName() + "."
                            + rp.getExt();
                }

                if (width == 0 && height == 0) {
                    return "{\"path\":\"" + path + "\"}";
                }

                List<ResPPE> list_thumb = (List<ResPPE>) img.getThumbnails();
                if (!ListUtil.isEmpty(list_thumb)) {
                    for (ResPPE res : list_thumb) {
                        if (res.getWidth() == width
                                && res.getHeight() == height) {
                            path = res.getRelaDirPath() + "/"
                                    + res.getPicName() + "_" + res.getScale()
                                    + "." + res.getExt();
                            break;
                        }
                    }
                }
            }
            return "{\"path\":\"" + path + "\"}";

        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
            // throw new ErrorCodeException(BECode.photo_300001);
            throw new RuntimeException("图片格式错误或大小受限！");
        }

    }

    /**
     * 编辑器上传图片
     * 
     * @reutrn string
     */
    @RequestMapping("edit_upload_pic")
    public @ResponseBody
    String uploadPic(HttpServletRequest request) {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile pic = multipartRequest.getFile("pic");
        HashMap<String, String> map = new HashMap<String, String>();

        try {
            if (pic.getSize() > 1024 * 1024 * 2) {
                map.put("error", "1");
                map.put("message", "单张图片大小不能超过2M");
            } else {
                ImageHelper imageHelper = new ImageHelper();
                BufferedImage bi = javax.imageio.ImageIO.read(pic
                        .getInputStream());

                if (bi == null) {
                    // 文件不是图片
                    map.put("error", "1");
                    map.put("message", "不是有效的图片格式文件");
                } else {
                    Image img = imageHelper.addUploadedPic(storeImagePath, pic);
                    if (img == null) {
                        map.put("error", "1");
                        map.put("message", "图片上传超时，或服务器繁忙");
                    } else {
                        String path = null;
                        ResPPE rp = (ResPPE) img.getOriginal();
                        if (rp != null) {
                            path = reviewImagePath + "/" + rp.getRelaDirPath()
                                    + "/" + rp.getPicName() + "." + rp.getExt();
                            map.put("error", "0");
                            map.put("url", path);
                        } else {
                            map.put("error", "1");
                            map.put("message", "上传发生错误");
                        }
                    }
                }
            }

            return JSONUtils.toJSONString(map);

        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
            map.put("error", "1");
            map.put("message", "上传发生错误");
            return JSONUtils.toJSONString(map);
        }
    }

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        return "store/index";
    }
}