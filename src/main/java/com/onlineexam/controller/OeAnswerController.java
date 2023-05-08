package com.onlineexam.controller;

import com.onlineexam.entity.OeAnswer;
import com.onlineexam.service.OeAnswerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * (OeAnswer)表控制层
 *
 * @author makejava
 * @since 2023-05-08 00:30:55
 */
@Slf4j
@RestController
@RequestMapping("answer/")

public class OeAnswerController {
    /**
     * 服务对象
     */
    @Autowired
    private OeAnswerService oeAnswerService;

    /**
     * 分页查询
     *
     * @param oeAnswer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OeAnswer>> queryByPage(OeAnswer oeAnswer, PageRequest pageRequest) {
        return ResponseEntity.ok(this.oeAnswerService.queryByPage(oeAnswer, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OeAnswer> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.oeAnswerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param oeAnswer 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OeAnswer> add(OeAnswer oeAnswer) {
        return ResponseEntity.ok(this.oeAnswerService.insert(oeAnswer));
    }

    /**
     * 编辑数据
     *
     * @param oeAnswer 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OeAnswer> edit(OeAnswer oeAnswer) {
        return ResponseEntity.ok(this.oeAnswerService.update(oeAnswer));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.oeAnswerService.deleteById(id));
    }

}

