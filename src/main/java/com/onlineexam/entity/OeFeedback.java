package com.onlineexam.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (OeFeedback)表实体类
 *
 * @author makejava
 * @since 2023-05-07 22:57:39
 */
@SuppressWarnings("serial")
public class OeFeedback extends Model<OeFeedback> {
    
    private Integer fid;
    
    private Integer uid;
    
    private Integer eid;
    
    private String description;


    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.fid;
    }
    }

