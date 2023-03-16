package com.stock.service;

import com.stock.entity.SysUser;

public interface SysUserService {

    SysUser findById(String id);

    SysUser findByUserName(String userName);
}
