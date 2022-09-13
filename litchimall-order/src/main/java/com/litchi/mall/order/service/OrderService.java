package com.litchi.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.litchi.common.utils.PageUtils;
import com.litchi.mall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 14:43:38
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

