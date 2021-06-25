package com.gupaoedu.vip.mall.goods.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.gupaoedu.vip.mall.goods.Brand;

import java.util.List;

public interface BrandService extends IService<Brand> {

    /**
     * 条件查询
     */
    List<Brand> queryList(Brand brand);

    /**
     * 分页查询
     */
    Page<Brand> queryPageList(Long currentPage, Long size, Brand brand);

    /**
     * 根据分类ID查询品牌
     */
    List<Brand> queryByCategoryId(Integer id);

}
