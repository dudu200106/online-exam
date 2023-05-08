package com.onlineexam.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (OeTeacher)表实体类
 *
 * @author makejava
 * @since 2023-05-07 22:57:39
 */
@SuppressWarnings("serial")
public class OeTeacher extends Model<OeTeacher> {
    
    private Integer tid;
    //教师用户名
    private String username;
    //教师密码
    private String password;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return this.tid;
    }
    }

