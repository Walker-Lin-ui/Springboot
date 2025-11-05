package com.xzit.gene.service;

import com.xzit.gene.entity.Emp;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Walker
 * @since 2025-11-05
 */
public interface IEmpService extends IService<Emp> {
    List<Emp> testSelect();
}
