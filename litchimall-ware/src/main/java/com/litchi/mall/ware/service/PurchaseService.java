package com.litchi.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.litchi.common.utils.PageUtils;
import com.litchi.mall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 14:46:47
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

