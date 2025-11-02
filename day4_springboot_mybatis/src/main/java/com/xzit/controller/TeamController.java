package com.xzit.controller;

import com.xzit.service.TeamService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("team")
@Tag(name = "团队管理")
public class TeamController {
    @Resource
    private TeamService service;

    @Operation(summary = "显示团队全部信息")
    @GetMapping
    public Object list(){
        return service.selectList();
    }
}
