package net.ssln.fangcun.collection.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TaskDetail implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 任务id
     */
    private String taskid;

    /**
     * 图片网络地址
     */
    private String picUrl;

    /**
     * 图片本地名
     */
    private String localName;

    /**
     * 存放位置
     */
    private String saveUrl;

    /**
     * 状态  0待采集      1采集成功   2采集失败
     */
    private String state;

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

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getSaveUrl() {
        return saveUrl;
    }

    public void setSaveUrl(String saveUrl) {
        this.saveUrl = saveUrl;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}