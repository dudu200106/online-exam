package com.onlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineexam.dao.OePaperDao;
import com.onlineexam.entity.OePaper;
import com.onlineexam.service.OePaperService;
import org.springframework.stereotype.Service;

/**
 * (OePaper)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 22:57:38
 */
@Service("oePaperService")
public class OePaperServiceImpl extends ServiceImpl<OePaperDao, OePaper> implements OePaperService {

}

