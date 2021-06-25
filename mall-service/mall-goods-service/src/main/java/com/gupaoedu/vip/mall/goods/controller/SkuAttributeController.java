package com.gupaoedu.vip.mall.goods.controller;

import com.gupaoedu.mall.util.RespResult;
import com.gupaoedu.vip.mall.goods.model.SkuAttribute;
import com.gupaoedu.vip.mall.goods.service.SkuAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author wanggang
 * @Date 2021/6/25
 */
@RestController
@RequestMapping("/sku-attribute")
@CrossOrigin
public class SkuAttributeController {

    @Autowired
    private SkuAttributeService skuAttributeService;

    /**
     * 根据分类ID查询属性
     * @param id
     * @return
     */
    @GetMapping(value = "/category/{id}")
    public RespResult<SkuAttribute> categoryAttributeList(@PathVariable(value = "id") Integer id) {
        // 根据分类ID查询属性参数
        List<SkuAttribute> skuAttributes = skuAttributeService.queryList(id);
        return RespResult.ok(skuAttributes);
    }

}
