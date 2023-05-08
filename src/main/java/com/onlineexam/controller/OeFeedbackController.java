package com.onlineexam.controller;

import com.onlineexam.entity.OeFeedback;
import com.onlineexam.service.OeFeedbackService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OeFeedback)表控制层
 *
 * @author makejava
 * @since 2023-05-08 00:30:59
 */
@RestController
@RequestMapping("oeFeedback")
public class OeFeedbackController {
    /**
     * 服务对象
     */
    @Resource
    private OeFeedbackService oeFeedbackService;

    /**
     * 分页查询
     *
     * @param oeFeedback 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OeFeedback>> queryByPage(OeFeedback oeFeedback, PageRequest pageRequest) {
        return ResponseEntity.ok(this.oeFeedbackService.queryByPage(oeFeedback, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OeFeedback> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.oeFeedbackService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param oeFeedback 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OeFeedback> add(OeFeedback oeFeedback) {
        return ResponseEntity.ok(this.oeFeedbackService.insert(oeFeedback));
    }

    /**
     * 编辑数据
     *
     * @param oeFeedback 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OeFeedback> edit(OeFeedback oeFeedback) {
        return ResponseEntity.ok(this.oeFeedbackService.update(oeFeedback));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.oeFeedbackService.deleteById(id));
    }

}

