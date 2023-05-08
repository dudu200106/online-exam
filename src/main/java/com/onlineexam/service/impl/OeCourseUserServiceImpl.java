package com.onlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineexam.dao.OeCourseUserDao;
import com.onlineexam.entity.OeCourseUser;
import com.onlineexam.service.OeCourseUserService;
import org.springframework.stereotype.Service;

/**
 * (OeCourseUser)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 22:57:40
 */
@Service("oeCourseUserService")
public class OeCourseUserServiceImpl extends ServiceImpl<OeCourseUserDao, OeCourseUser> implements OeCourseUserService {

}

