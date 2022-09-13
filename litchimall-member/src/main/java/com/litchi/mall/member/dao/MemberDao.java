package com.litchi.mall.member.dao;

import com.litchi.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 14:40:32
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
