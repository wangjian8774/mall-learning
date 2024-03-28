package com.jian.mall.tiny.service;

import com.github.pagehelper.PageInfo;
import com.jian.mall.tiny.model.UmsResource;

/**
 * UmsResource的Service接口
 */
public interface UmsResourceService {
    PageInfo<UmsResource> page(Integer pageNum, Integer pageSize, Long categoryId);
}
