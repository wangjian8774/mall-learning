package com.jian.mall.tiny.service;

import com.jian.mall.tiny.domain.AdminRoleDto;
import com.jian.mall.tiny.domain.ResourceWithCateDto;
import com.jian.mall.tiny.domain.RoleStatDto;
import com.jian.mall.tiny.mbg.model.UmsAdmin;

import java.util.List;

/**
 * 管理后台用户的Service
 */
public interface UmsAdminService {
    void create(UmsAdmin entity);

    void update(UmsAdmin entity);

    void delete(Long id);

    UmsAdmin select(Long id);

    List<UmsAdmin> listAll(Integer pageNum, Integer pageSize);

    List<UmsAdmin> list(Integer pageNum, Integer pageSize, String username, List<Integer> statusList);

    List<UmsAdmin> subList(Long roleId);

    List<RoleStatDto> groupList();

    void deleteByUsername(String username);

    void updateByIds(List<Long> ids, Integer Status);

    AdminRoleDto selectWithRoleList(Long id);

    ResourceWithCateDto selectResourceWithCate(Long id);
}
