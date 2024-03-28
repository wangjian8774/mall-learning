package com.jian.mall.tiny.domain;

import com.jian.mall.tiny.model.UmsResource;
import com.jian.mall.tiny.model.UmsResourceCategory;
import lombok.Data;

/**
 * UmsResource扩展类
 */
@Data
public class UmsResourceExt extends UmsResource {
    private UmsResourceCategory category;
}
