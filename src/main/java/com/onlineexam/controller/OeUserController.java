package com.onlineexam.controller;

import com.onlineexam.entity.OeUser;
import com.onlineexam.service.OeUserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (OeUser)表控制层
 *
 * @author makejava
 * @since 2023-05-08 00:31:00
 */
@RestController
@RequestMapping("oeUser")
public class OeUserController {
    /**
     * 服务对象
     */
    @Resource
    private OeUserService oeUserService;

    /**
     * 分页查询
     *
     * @param oeUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<OeUser>> queryByPage(OeUser oeUser, PageRequest pageRequest) {
        return ResponseEntity.ok(this.oeUserService.queryByPage(oeUser, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<OeUser> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.oeUserService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param oeUser 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<OeUser> add(OeUser oeUser) {
        return ResponseEntity.ok(this.oeUserService.insert(oeUser));
    }

    /**
     * 编辑数据
     *
     * @param oeUser 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<OeUser> edit(OeUser oeUser) {
        return ResponseEntity.ok(this.oeUserService.update(oeUser));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.oeUserService.deleteById(id));
    }

}

