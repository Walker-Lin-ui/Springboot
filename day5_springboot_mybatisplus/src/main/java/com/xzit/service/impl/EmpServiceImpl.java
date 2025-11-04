package com.xzit.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzit.entity.Emp;
import com.xzit.mapper.EmpMapper;
import com.xzit.service.EmpService;
import org.springframework.stereotype.Service;

@Service
@DS("slave")
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService {
}
