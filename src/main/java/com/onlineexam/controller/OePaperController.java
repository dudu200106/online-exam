package com.onlineexam.controller;

import com.onlineexam.entity.OePaper;
import com.onlineexam.service.OePaperService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OePaper)表控制层
 *
 * @author makejava
 * @since 2023-05-08 00:30:59
 */
@RestController
@RequestMapping("oePaper")
public class OePaperController {
    /**
     * 服务对象
     */
    @Resource
    private OePaperService oePaperService;

    /**
     * 分页查询
     *
     * @param oePaper 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OePaper>> queryByPage(OePaper oePaper, PageRequest pageRequest) {
        return ResponseEntity.ok(this.oePaperService.queryByPage(oePaper, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OePaper> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.oePaperService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param oePaper 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OePaper> add(OePaper oePaper) {
        return ResponseEntity.ok(this.oePaperService.insert(oePaper));
    }

    /**
     * 编辑数据
     *
     * @param oePaper 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OePaper> edit(OePaper oePaper) {
        return ResponseEntity.ok(this.oePaperService.update(oePaper));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.oePaperService.deleteById(id));
    }

}

