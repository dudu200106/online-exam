package com.onlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineexam.dao.OeFeedbackDao;
import com.onlineexam.entity.OeFeedback;
import com.onlineexam.service.OeFeedbackService;
import org.springframework.stereotype.Service;

/**
 * (OeFeedback)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 22:57:39
 */
@Service("oeFeedbackService")
public class OeFeedbackServiceImpl extends ServiceImpl<OeFeedbackDao, OeFeedback> implements OeFeedbackService {

}

