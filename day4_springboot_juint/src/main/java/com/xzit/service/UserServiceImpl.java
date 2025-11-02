package com.xzit.service;

import com.xzit.dao.UsersDao;
import com.xzit.entity.Users;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UsersDao dao;

    @Override
    public List<Users> list() {
        return dao.selectList();
    }
}
