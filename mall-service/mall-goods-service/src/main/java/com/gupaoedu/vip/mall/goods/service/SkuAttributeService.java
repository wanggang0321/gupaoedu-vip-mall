package com.gupaoedu.vip.mall.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gupaoedu.vip.mall.goods.model.SkuAttribute;

import java.util.List;

/**
 * @Description TODO
 * @Author wanggang
 * @Date 2021年06月25日
 */
public interface SkuAttributeService extends IService<SkuAttribute> {

    //根据分类ID查询属性集合
    List<SkuAttribute> queryList(Integer id);

}
