package com.litchi.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.litchi.common.utils.PageUtils;
import com.litchi.mall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 14:40:33
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

