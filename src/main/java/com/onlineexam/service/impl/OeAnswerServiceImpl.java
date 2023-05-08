package com.onlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineexam.dao.OeAnswerDao;
import com.onlineexam.entity.OeAnswer;
import com.onlineexam.service.OeAnswerService;
import org.springframework.stereotype.Service;

/**
 * (OeAnswer)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 22:57:03
 */
@Service("oeAnswerService")
public class OeAnswerServiceImpl extends ServiceImpl<OeAnswerDao, OeAnswer> implements OeAnswerService {

}

