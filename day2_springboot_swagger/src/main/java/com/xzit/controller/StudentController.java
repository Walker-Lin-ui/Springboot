package com.xzit.controller;

import com.xzit.model.Student;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Walker
 * @date 2025/10/29
 * @project springboot_xzit
 */
@RestController
@RequestMapping("/student")
@Tag(name = "学生管理",description = "用户相关api")//用在类上，表示对类的说明   tags表示说明该类的作用
public class StudentController {
    @GetMapping()
    @Operation(summary = "显示全部学生数据")
    //用在方法上，说明方法的用途和作用
    public Object list(){
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"张三","男",20));
        list.add(new Student(2,"李四","女",18));
        list.add(new Student(3,"王五","男",22));
        list.add(new Student(4,"王五","男",22));
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
        return new Student(id,"王某","男",22);
    }
    @DeleteMapping("/{id}")
    @Operation(summary = "按给定ID来删除学生信息")
    public Object deleteById(@Parameter(name = "id",description = "学生id")@PathVariable int id){
        return "已删除给定id为"+id+"的学生对象";
    }
    @PostMapping()
    @Operation(summary = "新增学生")
    public Object save(@Parameter(name = "student",description = "学生对象")@RequestBody Student student){
        return student;
    }
    @PutMapping()//前端   $.ajax{method:put}
    @Operation(summary = "更新学生")
    public Object update(@RequestBody Student student){
        return student;
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