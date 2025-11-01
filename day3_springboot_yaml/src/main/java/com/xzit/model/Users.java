package com.xzit.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Walker
 * @date 2025/11/1
 * @project springboot_xzit
 */
@Data
@Component
@ConfigurationProperties(prefix = "com.xzit.model.users")
public class Users {
    private String userName;
    private String gender;
    private int age;
    private double money;
    private LocalDate birth;
    private List<Student> studentList;
    private List<Student> studentList1;
    /*private List<String> likes;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Map<String,String> map1;*/

}
