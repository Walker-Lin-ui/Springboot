package com.xzit.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzit.entity.Teacher;
import com.xzit.mapper.TeacherMapper;
import com.xzit.service.TeacherService;
import org.springframework.stereotype.Service;

@Service
@DS("master")//不写也可以 .yml已经指定
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {
}
