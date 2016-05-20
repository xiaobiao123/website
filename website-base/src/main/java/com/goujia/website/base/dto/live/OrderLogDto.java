

/**   
* @Title: OrderLogDto.java
* @Package com.goujia.website.base.dto.live
* @Description: TODO(用一句话描述该文件做什么)
* @author chenghao   
* @date Sep 22, 2015 11:59:45 AM
* @version V1.0   
*/
package com.goujia.website.base.dto.live;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.goujia.website.base.entity.article.Label;
import com.goujia.website.base.vo.orderlog.OrderLogVO;



/**
 * @Description: 
 * @author  chenghao
 * @date Sep 22, 2015 11:59:45 AM
 * 
 */
public class OrderLogDto implements Serializable{

    /**
     * 
     */
    public OrderLogDto(){
        
    }
    public OrderLogDto(Label label){
        this.label=label;
        this.logs=new ArrayList<OrderLogVO>();
    }
    private static final long serialVersionUID = 1220056976339485881L;
    private Label label;
    private List<OrderLogVO> logs;
    public Label getLabel() {
        return label;
    }
    public void setLabel(Label label) {
        this.label = label;
    }
    public List<OrderLogVO> getLogs() {
        return logs;
    }
    public void setLogs(List<OrderLogVO> logs) {
        this.logs = logs;
    }

}
