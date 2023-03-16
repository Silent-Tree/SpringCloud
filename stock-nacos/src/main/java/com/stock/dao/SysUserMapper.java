package com.stock.dao;

import com.stock.entity.SysUser;

public interface SysUserMapper {

    SysUser findById(String id);

    SysUser findByUserName(String userName);
}
