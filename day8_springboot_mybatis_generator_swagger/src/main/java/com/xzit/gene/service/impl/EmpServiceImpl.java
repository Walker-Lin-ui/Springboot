package com.xzit.gene.service.impl;

import com.xzit.gene.entity.Emp;
import com.xzit.gene.mapper.EmpMapper;
import com.xzit.gene.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Walker
 * @since 2025-11-05
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {
    @Resource
    private EmpMapper mapper;
    @Override
    public List<Emp> testSelect() {
        return mapper.testSelect();
    }
}
