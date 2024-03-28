package com.jian.mall.tiny.dao;

import com.jian.mall.tiny.domain.UmsResourceCategoryExt;

public interface UmsResourceCategoryDao {
    /**
     * 根据分类ID获取分类及对应资源
     */
    UmsResourceCategoryExt selectCategoryWithResource(Long id);
}
