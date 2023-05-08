package com.onlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineexam.dao.OeUserDao;
import com.onlineexam.entity.OeUser;
import com.onlineexam.service.OeUserService;
import org.springframework.stereotype.Service;

/**
 * (OeUser)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 22:57:38
 */
@Service("oeUserService")
public class OeUserServiceImpl extends ServiceImpl<OeUserDao, OeUser> implements OeUserService {

}

