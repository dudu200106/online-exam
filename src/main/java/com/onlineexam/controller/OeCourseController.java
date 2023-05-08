package com.onlineexam.controller;

import com.onlineexam.entity.OeCourse;
import com.onlineexam.service.OeCourseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OeCourse)表控制层
 *
 * @author makejava
 * @since 2023-05-08 00:30:57
 */
@RestController
@RequestMapping("oeCourse")
public class OeCourseController {
    /**
     * 服务对象
     */
    @Resource
    private OeCourseService oeCourseService;

    /**
     * 分页查询
     *
     * @param oeCourse 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OeCourse>> queryByPage(OeCourse oeCourse, PageRequest pageRequest) {
        return ResponseEntity.ok(this.oeCourseService.queryByPage(oeCourse, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OeCourse> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.oeCourseService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param oeCourse 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OeCourse> add(OeCourse oeCourse) {
        return ResponseEntity.ok(this.oeCourseService.insert(oeCourse));
    }

    /**
     * 编辑数据
     *
     * @param oeCourse 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OeCourse> edit(OeCourse oeCourse) {
        return ResponseEntity.ok(this.oeCourseService.update(oeCourse));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.oeCourseService.deleteById(id));
    }

}

