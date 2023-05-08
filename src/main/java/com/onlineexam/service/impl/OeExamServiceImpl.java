package com.onlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineexam.dao.OeExamDao;
import com.onlineexam.entity.OeExam;
import com.onlineexam.service.OeExamService;
import org.springframework.stereotype.Service;

/**
 * (OeExam)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 22:57:39
 */
@Service("oeExamService")
public class OeExamServiceImpl extends ServiceImpl<OeExamDao, OeExam> implements OeExamService {

}

