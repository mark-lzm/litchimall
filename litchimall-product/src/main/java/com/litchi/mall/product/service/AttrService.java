package com.litchi.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.litchi.common.utils.PageUtils;
import com.litchi.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 12:38:16
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

