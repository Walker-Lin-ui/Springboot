package com.xzit.service.impl;

import com.xzit.entity.Team;
import com.xzit.mapper.StudentMapper;
import com.xzit.mapper.TeamMapper;
import com.xzit.service.TeamService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class TeamServiceImpl implements TeamService {

    @Resource
    private TeamMapper mapper;
    @Override
    public List<Team> selectList() {
        return mapper.selectList();
    }
}
