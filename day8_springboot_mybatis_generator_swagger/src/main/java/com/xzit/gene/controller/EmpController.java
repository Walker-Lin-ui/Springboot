package com.xzit.gene.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xzit.gene.entity.Emp;
import com.xzit.gene.service.IEmpService;
import com.xzit.gene.util.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Walker
 * @since 2025-11-05
 */
@RestController
@RequestMapping("/gene/emp")
@Schema(description = "员工管理")
public class EmpController {
    @Resource
    private IEmpService service;
    @Operation(summary = "查询全部数据")
    @GetMapping
    public Result select(){
        List<Emp> list = service.testSelect();//service.list();
        /*HashMap<String, Object> map = new HashMap<>();
        map.put("list",list);*/
        return Result.success().setData("list",list);
    }

    @Operation(summary = "按给定ID查询数据")
    @GetMapping("/{id}")
    public Result selectById(@PathVariable Integer id){
        Emp emp = service.getById(id);
        return Result.success().setData("emp",emp);
    }

    @Operation(summary = "分页查询数据")
    @GetMapping("/{current}/{size}")
    public Result selectPage(@PathVariable int current,@PathVariable int size){
        Page<Emp> page = new Page<>(current, size);
        service.page(page);
        return Result.success().setData("page",page);
    }

    @Operation(summary = "保存员工信息")
    @PostMapping
    public Result save(@RequestBody Emp emp){
        return service.save(emp)?Result.success():Result.error();
    }

    @Operation(summary = "更改员工信息")
    @PutMapping
    public Result update(@RequestBody Emp emp){
        return service.updateById(emp)?Result.success():Result.error();
    }

    @Operation(summary = "删除员工信息")
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        return service.removeById(id)?Result.success():Result.error();
    }

}
