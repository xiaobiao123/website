package com.goujia.website.base.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagUtil {
    public static void main(String[] args) {
        String str = "<ul style='list-style-type: none;' class=' list-paddingleft-2'><li><p><img src='http://image.goujiawang.com/store/website/ueditor/upload/image/20150720/1437372370944049231.jpg' title='1437372370944049231.jpg' alt='1.jpg'/><br/></p></li><li><p><span style='font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;'>近几年，木门成为了不少人装点居室的首选。但同时，大家都会比较担心一个问题，那就是要怎么保养才能保证木门使用寿命更长?</span></p><p><a href='http://jingyan.citytogo.cn/wp-content/uploads/2014/07/mm.jpg'><img class='aligncenter size-full wp-image-730' data-original='http://jingyan.citytogo.cn/wp-content/uploads/2014/07/mm.jpg' src='http://image.goujiawang.com/store/website/ueditor/jsp/upload/image/20150720/1437372354327021919.jpg' alt='mm' width='700' height='300' style='border: none;vertical-align: middle;text-align: center;display: none'/></a></p><p><span style='font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;'>1、污迹清理<br style='display: inline;line-height: 2px !important'/>在清除木门表面污迹时，应采用比较软的棉布擦试。当污迹太重时，可使用中性清洗剂、牙膏或家具专用清洗剂，去污迹后，再干擦，切忌用清水冲洗。</span></p><p><span style='font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;'>2、门锁维护<br style='display: inline;line-height: 2px !important'/>对于合页、门锁等经常活动的五金配件，发生松动时要立即拧紧，在门锁开启不灵时，可以往钥匙孔中加入适量的铅笔芯沫，但不可随便注油。</span></p><p><span style='font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;'>3、色泽维持<br style='display: inline;line-height: 2px !important'/>若想保持木门的光亮色泽，可以定期打蜡为其保养。</span></p><p><span style='font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;'>4、使用力度适宜<br style='display: inline;line-height: 2px !important'/>要考虑门的受重能力，尽量少在门扇上悬挂过重的物品，避免尖锐器物的磕碰、划伤、在开启或关闭门扇时，不要用力过猛，不要撞击木门。</span></p><p><span style='font-family: 微软雅黑, &#39;Microsoft YaHei&#39;; font-size: 14px;'>Tips:<br style='display: inline;line-height: 2px !important'/>为避免日后木门保养中出现的麻烦事，就要在选购的时候多下功夫。对于原木门，首先要考虑的是选好品牌，分辨市场上出现的一些偷天换日，以假乱真的“原木门”。</span></p></li></ul><p><br/></p>";
        List<String> list = getSrc(str, "<img", "/>", "src='");
        List<String> li = getImages(str, "<img", "/>");
        System.out.println(li.toString());
        System.out.println(list.toString());
    }

    public static List<String> getSrc(String content, String tagBegin,
            String tagEnd, String innerStart) {
        String str = new String();
        List<String> list = new ArrayList<String>();
        if (null == content)
            return list;
        Pattern pattern = Pattern.compile(tagBegin + "([^>]*)" + tagEnd);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            String s = matcher.group();
            if (!s.contains("display: none")) {
                str = str + s;
            }
        }
        Pattern pat = Pattern.compile(innerStart + "([^\"]*)\"");
        Matcher mat = pat.matcher(str);
        while (mat.find()) {
            list.add(mat.group());
        }
        return list;
    }

    public static List<String> getImages(String content, String tagBegin,
            String tagEnd) {
        List<String> list = new ArrayList<String>();
        if (null == content)
            return list;
        Pattern pattern = Pattern.compile(tagBegin + "([^>]*)" + tagEnd);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }

    public static List<String> getNoSizeImages(String content) {
        List<String> list = new ArrayList<String>();
        String str = new String();
        if (null == content)
            return list;
        Pattern pattern = Pattern.compile("<img(?![^<>]*?height[^<>]*?>).*?>");
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            str = str + matcher.group();
        }
        Pattern pat = Pattern.compile("<img(?![^<>]*?width[^<>]*?>).*?>");
        Matcher mat = pat.matcher(str);
        while (mat.find()) {
            list.add(mat.group());
        }
        return list;
    }
}
