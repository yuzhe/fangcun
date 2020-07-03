package net.ssln.fangcun.collection.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Task implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 链接地址
     */
    private String url;

    /**
     * 标题
     */
    private String title;

    /**
     * 页数
     */
    private String pageNum;

    /**
     * 图片数量
     */
    private String picNum;

    /**
     * 状态  0 待采集    1采集中     2采集完成  3采集失败
     */
    private String status;

    /**
     * 插入时间
     */
    private Date insertTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPageNum() {
        return pageNum;
    }

    public void setPageNum(String pageNum) {
        this.pageNum = pageNum;
    }

    public String getPicNum() {
        return picNum;
    }

    public void setPicNum(String picNum) {
        this.picNum = picNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}