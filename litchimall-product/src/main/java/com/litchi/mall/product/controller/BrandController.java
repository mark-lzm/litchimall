package com.litchi.mall.product.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.litchi.common.valid.AddGroup;
import com.litchi.common.valid.UpdateGroup;
import com.litchi.common.valid.UpdateStatusGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.litchi.mall.product.entity.BrandEntity;
import com.litchi.mall.product.service.BrandService;
import com.litchi.common.utils.PageUtils;
import com.litchi.common.utils.R;

import javax.validation.Valid;


/**
 * 品牌
 *
 * @author mark
 * @email lizhiming596@126.com
 * @date 2022-09-13 12:59:51
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = brandService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId) {
        BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }

    /**
     * 保存
     */
//    @RequestMapping("/save")
//    //@RequiresPermissions("product:brand:save")
//    public R save(@Valid @RequestBody BrandEntity brand, BindingResult result) {
//        if (result.hasErrors()) {
//            Map<String, String> map = new HashMap<>();
//            //1.获取错误的校验结果
//            result.getFieldErrors().forEach((item) -> {
//                //获取发生错误时的message
//                String message = item.getDefaultMessage();
//                //获取发生错误的字段
//                String field = item.getField();
//                map.put(field, message);
//            });
//            return R.error(400, "提交的数据不合法").put("data", map);
//        } else {
//            brandService.save(brand);
//        }
//        return R.ok();
//    }
    @RequestMapping("/save")
    //@RequiresPermissions("product:brand:save")
    public R save(@Validated({AddGroup.class}) @RequestBody BrandEntity brand) {
        brandService.save(brand);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("product:brand:update")
    public R update(@Validated({UpdateGroup.class}) @RequestBody BrandEntity brand) {
        brandService.updateById(brand);

        return R.ok();
    }
    /**
     * 修改状态
     */
    @RequestMapping("/update/status")
    //@RequiresPermissions("product:brand:update")
    public R updateStatus(@Validated({UpdateStatusGroup.class}) @RequestBody BrandEntity brand) {
        brandService.updateById(brand);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds) {
        brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

}
