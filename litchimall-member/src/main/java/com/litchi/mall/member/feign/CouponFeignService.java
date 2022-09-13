package com.litchi.mall.member.feign;

import com.litchi.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author Mark
 * @Date 2022/9/13 15:57
 */
@FeignClient("litchimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
