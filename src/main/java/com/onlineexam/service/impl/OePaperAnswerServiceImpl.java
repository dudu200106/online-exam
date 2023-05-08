package com.onlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineexam.dao.OePaperAnswerDao;
import com.onlineexam.entity.OePaperAnswer;
import com.onlineexam.service.OePaperAnswerService;
import org.springframework.stereotype.Service;

/**
 * (OePaperAnswer)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 22:57:39
 */
@Service("oePaperAnswerService")
public class OePaperAnswerServiceImpl extends ServiceImpl<OePaperAnswerDao, OePaperAnswer> implements OePaperAnswerService {

}

