package com.onlineexam.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (OeQuestion)表实体类
 *
 * @author makejava
 * @since 2023-05-07 22:57:40
 */
@SuppressWarnings("serial")
public class OeQuestion extends Model<OeQuestion> {
    
    private Integer qid;
    //考试id
    private Integer eid;
    //题目
    private String title;
    //选项A
    private String optA;
    //选项B
    private String optB;
    //选项C
    private String optC;
    //选项D
    private String optD;
    //正确选项
    private String keyOpt;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;


    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOptA() {
        return optA;
    }

    public void setOptA(String optA) {
        this.optA = optA;
    }

    public String getOptB() {
        return optB;
    }

    public void setOptB(String optB) {
        this.optB = optB;
    }

    public String getOptC() {
        return optC;
    }

    public void setOptC(String optC) {
        this.optC = optC;
    }

    public String getOptD() {
        return optD;
    }

    public void setOptD(String optD) {
        this.optD = optD;
    }

    public String getKeyOpt() {
        return keyOpt;
    }

    public void setKeyOpt(String keyOpt) {
        this.keyOpt = keyOpt;
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
        return this.qid;
    }
    }

