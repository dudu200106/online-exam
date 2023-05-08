package com.onlineexam.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * (OeCourse)表实体类
 *
 * @author makejava
 * @since 2023-05-07 22:57:40
 */
@SuppressWarnings("serial")
public class OeCourse extends Model<OeCourse> {
    //课程id
    private Integer cno;
    //教师id
    private Integer tid;
    //课程名称
    private String courseName;
    //课程邀请码
    private String courseCode;
    //创建时间
    private Date createTime;
    //修改时间
    private Date updateTime;


    public Integer getCno() {
        return cno;
    }

    public void setCno(Integer cno) {
        this.cno = cno;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
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
        return this.cno;
    }
    }

