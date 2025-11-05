package com.xzit.mybatisX.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.xzit.mybatisX.entity.Dept;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author 11561
* @description 针对表【com_dept】的数据库操作Mapper
* @createDate 2025-11-05 21:22:01
* @Entity com.xzit.mybatisX.entity.Dept
*/
public interface DeptMapper extends BaseMapper<Dept> {
    //判断Dept中的属性，如果不为空，则插入数据库中 保存
    int insertSelective(Dept dept);
    //查询
    List<Dept> selectCreateYearOrderByCreateYearDesc();

    List<Dept> selectAllByDeptName(@Param("deptName") String deptName);

    List<Dept> selectByDeptNameAndLocal(@Param("deptName") String deptName, @Param("local") String local);

    //修改
    int updateCreateYearByCreateYearBetween(@Param("createYear") Integer createYear, @Param("beginCreateYear") Integer beginCreateYear, @Param("endCreateYear") Integer endCreateYear);

    //删除
    int delByLocalAndLocalLike(@Param("local") String local, @Param("oldLocal") String oldLocal);
}




