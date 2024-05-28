package com.jian.mall.tiny.dao;

import com.jian.mall.tiny.domain.AdminRoleDto;
import com.jian.mall.tiny.domain.ResourceWithCateDto;
import com.jian.mall.tiny.domain.RoleStatDto;
import com.jian.mall.tiny.mbg.model.UmsAdmin;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 自定义实现SQL，UmsAdmin自定义Dao
 */
public interface UmsAdminDao {
    List<RoleStatDto> groupList();

    AdminRoleDto selectWithRoleList(@Param("id") Long id);

    List<UmsAdmin> subList(@Param("roleId") Long roleId);

    ResourceWithCateDto selectResourceWithCate(@Param("id") Long id);
}
