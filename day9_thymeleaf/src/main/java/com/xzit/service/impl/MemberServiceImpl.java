package com.xzit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzit.entity.Member;
import com.xzit.service.MemberService;
import com.xzit.mapper.MemberMapper;
import org.springframework.stereotype.Service;

/**
* @author 11561
* @description 针对表【member】的数据库操作Service实现
* @createDate 2025-11-06 16:50:23
*/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService{

}




