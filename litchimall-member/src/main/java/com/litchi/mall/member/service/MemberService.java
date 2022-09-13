package com.litchi.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.litchi.common.utils.PageUtils;
import com.litchi.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 14:40:32
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

