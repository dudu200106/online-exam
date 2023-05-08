package com.onlineexam.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (OeCourseUser)表实体类
 *
 * @author makejava
 * @since 2023-05-07 22:57:40
 */
@SuppressWarnings("serial")
public class OeCourseUser extends Model<OeCourseUser> {
    //id
    private Integer cuid;
    //课程id
    private Integer cno;
    //学生id
    private Integer uid;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;


    public Integer getCuid() {
        return cuid;
    }

    public void setCuid(Integer cuid) {
        this.cuid = cuid;
    }

    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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
        return this.cuid;
    }
    }

