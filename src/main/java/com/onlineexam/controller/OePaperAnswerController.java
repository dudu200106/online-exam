package com.onlineexam.controller;

import com.onlineexam.entity.OePaperAnswer;
import com.onlineexam.service.OePaperAnswerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OePaperAnswer)表控制层
 *
 * @author makejava
 * @since 2023-05-08 00:30:59
 */
@RestController
@RequestMapping("oePaperAnswer")
public class OePaperAnswerController {
    /**
     * 服务对象
     */
    @Resource
    private OePaperAnswerService oePaperAnswerService;

    /**
     * 分页查询
     *
     * @param oePaperAnswer 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OePaperAnswer>> queryByPage(OePaperAnswer oePaperAnswer, PageRequest pageRequest) {
        return ResponseEntity.ok(this.oePaperAnswerService.queryByPage(oePaperAnswer, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OePaperAnswer> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.oePaperAnswerService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param oePaperAnswer 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OePaperAnswer> add(OePaperAnswer oePaperAnswer) {
        return ResponseEntity.ok(this.oePaperAnswerService.insert(oePaperAnswer));
    }

    /**
     * 编辑数据
     *
     * @param oePaperAnswer 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OePaperAnswer> edit(OePaperAnswer oePaperAnswer) {
        return ResponseEntity.ok(this.oePaperAnswerService.update(oePaperAnswer));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.oePaperAnswerService.deleteById(id));
    }

}

