package com.goujia.website.base.ges.vo;

import java.util.List;

public class MaterialsCategoryVO {
    private String categoryName; // 类别名称
    private List<MatterVO> matterList; // 物料列表
    private Integer size; // 物料个数
    private Double cateAmount; // 类别下的价格和
    private String image; // 类别图片

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getCateAmount() {
        return cateAmount;
    }

    public void setCateAmount(Double cateAmount) {
        this.cateAmount = cateAmount;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        // if循环类别图片
        // 类型：给排水管线系统 强弱电管线系统 电气设备安装系统 柜体收纳系统
        // 三墙面造型系统 五金链接系统 灯光照明系统 厨卫阳台系统 移动家具系统 艺术陈设系统
        if (categoryName.contains("给排水管线系统")) {
            setImage("sys_gps.png");
        }
        if (categoryName.contains("强弱电管线系统")) {
            setImage("sys_qrd.png");
        }
        if (categoryName.contains("电气设备安装系统")) {
            setImage("sys_dq.png");
        }
        if (categoryName.contains("柜体收纳系统")) {
            setImage("sys_gt.png");
        }
        if (categoryName.contains("三墙面造型系统")) {
            setImage("sys_dd.png");
        }
        if (categoryName.contains("五金链接系统")) {
            setImage("sys_5j.png");
        }
        if (categoryName.contains("灯光照明系统")) {
            setImage("sys_dg.png");
        }
        if (categoryName.contains("厨卫阳台系统")) {
            setImage("sys_cw.png");
        }
        if (categoryName.contains("移动家具系统")) {
            setImage("sys_yd.png");
        }
        if (categoryName.contains("艺术陈设系统")) {
            setImage("sys_ys.png");
        }
    }

    public List<MatterVO> getMatterList() {
        return matterList;
    }

    public void setMatterList(List<MatterVO> matterList) {
        this.matterList = matterList;
        setSize(matterList.size());
        Double amount = 0.0;
        for (MatterVO mat : matterList) {
            if (null != mat.getPric()) {
                amount = amount + mat.getPric();
            }
        }
        setCateAmount(amount);
    }
}
