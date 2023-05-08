package com.onlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineexam.dao.OeTeacherDao;
import com.onlineexam.entity.OeTeacher;
import com.onlineexam.service.OeTeacherService;
import org.springframework.stereotype.Service;

/**
 * (OeTeacher)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 22:57:39
 */
@Service("oeTeacherService")
public class OeTeacherServiceImpl extends ServiceImpl<OeTeacherDao, OeTeacher> implements OeTeacherService {

}

