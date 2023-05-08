package com.onlineexam.controller;

import com.onlineexam.entity.OeTeacher;
import com.onlineexam.service.OeTeacherService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OeTeacher)表控制层
 *
 * @author makejava
 * @since 2023-05-08 00:31:00
 */
@RestController
@RequestMapping("oeTeacher")
public class OeTeacherController {
    /**
     * 服务对象
     */
    @Resource
    private OeTeacherService oeTeacherService;

    /**
     * 分页查询
     *
     * @param oeTeacher 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OeTeacher>> queryByPage(OeTeacher oeTeacher, PageRequest pageRequest) {
        return ResponseEntity.ok(this.oeTeacherService.queryByPage(oeTeacher, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OeTeacher> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.oeTeacherService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param oeTeacher 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OeTeacher> add(OeTeacher oeTeacher) {
        return ResponseEntity.ok(this.oeTeacherService.insert(oeTeacher));
    }

    /**
     * 编辑数据
     *
     * @param oeTeacher 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OeTeacher> edit(OeTeacher oeTeacher) {
        return ResponseEntity.ok(this.oeTeacherService.update(oeTeacher));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.oeTeacherService.deleteById(id));
    }

}

