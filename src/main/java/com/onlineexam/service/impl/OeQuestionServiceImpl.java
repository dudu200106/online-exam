package com.onlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineexam.dao.OeQuestionDao;
import com.onlineexam.entity.OeQuestion;
import com.onlineexam.service.OeQuestionService;
import org.springframework.stereotype.Service;

/**
 * (OeQuestion)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 22:57:40
 */
@Service("oeQuestionService")
public class OeQuestionServiceImpl extends ServiceImpl<OeQuestionDao, OeQuestion> implements OeQuestionService {

}

