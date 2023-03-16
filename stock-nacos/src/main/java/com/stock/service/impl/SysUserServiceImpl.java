package com.stock.service.impl;

import com.stock.dao.SysUserMapper;
import com.stock.entity.SysUser;
import com.stock.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser findById(String id) {
        SysUser user = sysUserMapper.findById(id);
        System.out.println(user);
        return null;
    }

    @Override
    public SysUser findByUserName(String userName) {
        SysUser user = sysUserMapper.findByUserName(userName);
        System.out.println(user);
        return null;
    }
}
