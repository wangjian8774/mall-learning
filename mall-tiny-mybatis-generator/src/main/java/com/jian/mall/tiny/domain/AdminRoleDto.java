package com.jian.mall.tiny.domain;

import com.jian.mall.tiny.mbg.model.UmsRole;

import java.util.List;

public class AdminRoleDto {
    private List<UmsRole> roleList;

    public List<UmsRole> getRoleLIst() {
        return roleList;
    }

    public void setRoleList(List<UmsRole> roleList) {
        this.roleList = roleList;
    }
}
