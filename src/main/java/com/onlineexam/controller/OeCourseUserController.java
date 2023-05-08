package com.onlineexam.controller;

import com.onlineexam.entity.OeCourseUser;
import com.onlineexam.service.OeCourseUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OeCourseUser)表控制层
 *
 * @author makejava
 * @since 2023-05-08 00:30:58
 */
@RestController
@RequestMapping("oeCourseUser")
public class OeCourseUserController {
    /**
     * 服务对象
     */
    @Resource
    private OeCourseUserService oeCourseUserService;

    /**
     * 分页查询
     *
     * @param oeCourseUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OeCourseUser>> queryByPage(OeCourseUser oeCourseUser, PageRequest pageRequest) {
        return ResponseEntity.ok(this.oeCourseUserService.queryByPage(oeCourseUser, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OeCourseUser> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.oeCourseUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param oeCourseUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OeCourseUser> add(OeCourseUser oeCourseUser) {
        return ResponseEntity.ok(this.oeCourseUserService.insert(oeCourseUser));
    }

    /**
     * 编辑数据
     *
     * @param oeCourseUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OeCourseUser> edit(OeCourseUser oeCourseUser) {
        return ResponseEntity.ok(this.oeCourseUserService.update(oeCourseUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.oeCourseUserService.deleteById(id));
    }

}

