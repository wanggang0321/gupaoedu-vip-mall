package com.gupaoedu.vip.mall.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gupaoedu.vip.mall.goods.model.Category;

import java.util.List;

/**
 * @Description TODO
 * @Author wanggang
 * @Date 2021年06月25日
 */
public interface CategoryService extends IService<Category> {

    /**
     * 根据父ID查询子分类
     */
    List<Category> queryByParentId(Integer pid);

}
