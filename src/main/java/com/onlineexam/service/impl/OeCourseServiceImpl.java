package com.onlineexam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.onlineexam.dao.OeCourseDao;
import com.onlineexam.entity.OeCourse;
import com.onlineexam.service.OeCourseService;
import org.springframework.stereotype.Service;

/**
 * (OeCourse)表服务实现类
 *
 * @author makejava
 * @since 2023-05-07 22:57:40
 */
@Service("oeCourseService")
public class OeCourseServiceImpl extends ServiceImpl<OeCourseDao, OeCourse> implements OeCourseService {

}

