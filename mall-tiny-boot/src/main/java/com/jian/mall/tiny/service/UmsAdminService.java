package com.jian.mall.tiny.service;

import com.jian.mall.tiny.domain.AdminUserDetails;

// 后台管理Service
public interface UmsAdminService {
    // 根据用户名获取用户信息
    AdminUserDetails getAdminByUsername(String username);

    // 用户民密码登陆
    String login(String username, String password);
}
