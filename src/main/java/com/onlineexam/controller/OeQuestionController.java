package com.onlineexam.controller;

import com.onlineexam.entity.OeQuestion;
import com.onlineexam.service.OeQuestionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OeQuestion)表控制层
 *
 * @author makejava
 * @since 2023-05-08 00:30:59
 */
@RestController
@RequestMapping("oeQuestion")
public class OeQuestionController {
    /**
     * 服务对象
     */
    @Resource
    private OeQuestionService oeQuestionService;

    /**
     * 分页查询
     *
     * @param oeQuestion 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OeQuestion>> queryByPage(OeQuestion oeQuestion, PageRequest pageRequest) {
        return ResponseEntity.ok(this.oeQuestionService.queryByPage(oeQuestion, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OeQuestion> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.oeQuestionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param oeQuestion 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OeQuestion> add(OeQuestion oeQuestion) {
        return ResponseEntity.ok(this.oeQuestionService.insert(oeQuestion));
    }

    /**
     * 编辑数据
     *
     * @param oeQuestion 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OeQuestion> edit(OeQuestion oeQuestion) {
        return ResponseEntity.ok(this.oeQuestionService.update(oeQuestion));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.oeQuestionService.deleteById(id));
    }

}

