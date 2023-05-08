package com.onlineexam.controller;

import com.onlineexam.entity.OeExam;
import com.onlineexam.service.OeExamService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OeExam)表控制层
 *
 * @author makejava
 * @since 2023-05-08 00:30:58
 */
@RestController
@RequestMapping("oeExam")
public class OeExamController {
    /**
     * 服务对象
     */
    @Resource
    private OeExamService oeExamService;

    /**
     * 分页查询
     *
     * @param oeExam 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OeExam>> queryByPage(OeExam oeExam, PageRequest pageRequest) {
        return ResponseEntity.ok(this.oeExamService.queryByPage(oeExam, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OeExam> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.oeExamService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param oeExam 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OeExam> add(OeExam oeExam) {
        return ResponseEntity.ok(this.oeExamService.insert(oeExam));
    }

    /**
     * 编辑数据
     *
     * @param oeExam 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OeExam> edit(OeExam oeExam) {
        return ResponseEntity.ok(this.oeExamService.update(oeExam));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.oeExamService.deleteById(id));
    }

}

