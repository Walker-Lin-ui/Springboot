package com.xzit.controller;

import com.xzit.entity.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController 返回json
@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("title","校园官网");
        Users user=new Users();
        user.setName("张三");
        model.addAttribute("user",user);
        return "index";
    }
}
