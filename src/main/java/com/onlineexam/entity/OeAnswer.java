package com.onlineexam.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (OeAnswer)表实体类
 *
 * @author makejava
 * @since 2023-05-07 22:57:02
 */
@SuppressWarnings("serial")
public class OeAnswer extends Model<OeAnswer>{
    
    private Integer aid;
    //学生试卷id
    private Integer pid;
    //问题id
    private Integer qid;
    //学生答案
    private String ansKey;
    //是否正确
    private Integer status;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;


    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getAnsKey() {
        return ansKey;
    }

    public void setAnsKey(String ansKey) {
        this.ansKey = ansKey;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.aid;
    }
}

