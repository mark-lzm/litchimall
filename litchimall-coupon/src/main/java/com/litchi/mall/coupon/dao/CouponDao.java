package com.litchi.mall.coupon.dao;

import com.litchi.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 14:33:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
