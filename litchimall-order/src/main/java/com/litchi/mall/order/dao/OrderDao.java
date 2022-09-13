package com.litchi.mall.order.dao;

import com.litchi.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 14:43:38
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
