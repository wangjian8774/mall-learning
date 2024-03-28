package com.jian.mall.tiny.domain;

import com.jian.mall.tiny.model.UmsResource;
import com.jian.mall.tiny.model.UmsResourceCategory;
import lombok.Data;

import java.util.List;

/**
 * UmsResourceCategory扩展类
 */
@Data
public class UmsResourceCategoryExt extends UmsResourceCategory {
    private List<UmsResource> resourceList;
}
