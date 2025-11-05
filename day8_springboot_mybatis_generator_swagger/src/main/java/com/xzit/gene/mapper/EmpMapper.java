package com.xzit.gene.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xzit.gene.entity.Emp;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Walker
 * @since 2025-11-05
 */
public interface EmpMapper extends BaseMapper<Emp> {
    List<Emp> testSelect();
}
