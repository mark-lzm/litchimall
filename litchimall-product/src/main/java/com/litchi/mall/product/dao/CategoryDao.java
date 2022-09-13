package com.litchi.mall.product.dao;

import com.litchi.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 12:38:16
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
