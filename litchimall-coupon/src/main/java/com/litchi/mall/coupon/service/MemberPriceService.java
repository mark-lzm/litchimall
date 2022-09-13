package com.litchi.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.litchi.common.utils.PageUtils;
import com.litchi.mall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 14:33:37
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

