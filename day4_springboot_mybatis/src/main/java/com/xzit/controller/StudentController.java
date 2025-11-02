package com.xzit.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xzit.entity.Student;
import com.xzit.service.StudentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Walker
 * @date 2025/10/29
 * @project springboot_xzit
 */
@RestController
@RequestMapping("student")
@Tag(name = "学生管理控制器",description = "用户相关api")//用在类上，表示对类的说明   tags表示说明该类的作用
public class StudentController {
    @Resource
    private StudentService service;

    @Operation(summary = "分页显示学生信息")
    @GetMapping("/{start}/{size}")
    public Object listByPage(@PathVariable Integer start,@PathVariable Integer size){
        PageHelper.startPage(start,size);
        List<Student> list=service.selectList();
        PageInfo<Student> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @GetMapping()
    @Operation(summary = "显示全部学生数据")
    //用在方法上，说明方法的用途和作用
    public Object list(){
        List<Student> list= service.selectList();
        return list;
    }

    @GetMapping("/{id}")
    @Operation(summary = "按给定Id来查询学生信息")
    @Parameters(
            @Parameter(
                    name = "id", required = true, description = "学生id"
            )
    )
    public Object selectById(@PathVariable int id){
        Student student=service.selectId(id);
        return student;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "按给定ID来删除学生信息")
    public Object delete(@Parameter(name = "id",description = "学生id")@PathVariable int id){
        int i = service.delete(id);
        return i;
    }

    @PostMapping()
    @Operation(summary = "新增学生")
    public Object save(@Parameter(name = "student",description = "学生对象")@RequestBody Student student){
        int i = service.save(student);
        return i;
    }

    @PutMapping()//前端   $.ajax{method:put}
    @Operation(summary = "更改学生")
    public Object update(@RequestBody Student student){
        int i = service.update(student);
        return i;
    }
}
/*
/saveStudent
/selectStudent
/deleleStudent?id=3

restful
学生管理
/student   查询   get
/student   新增   post
/student   更新   put
/student/1 删除   delete
/student/1 根据id查询  get
 */