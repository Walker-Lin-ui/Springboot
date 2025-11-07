package com.xzit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzit.entity.Member;
import com.xzit.service.MemberService;
import com.xzit.mapper.MemberMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService{

}




