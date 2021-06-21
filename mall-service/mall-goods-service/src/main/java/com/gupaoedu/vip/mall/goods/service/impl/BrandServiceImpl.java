package com.gupaoedu.vip.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gupaoedu.vip.mall.goods.Brand;
import com.gupaoedu.vip.mall.goods.mapper.BrandMapper;
import com.gupaoedu.vip.mall.goods.service.BrandService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> queryList(Brand brand) {
        // 多条件构造器
        QueryWrapper<Brand> queryWrapper = new QueryWrapper<Brand>();
        if (StringUtils.isNotEmpty(brand.getName())) {
            queryWrapper.like("name", brand.getName());
        }
        if (StringUtils.isNotEmpty(brand.getInitial())) {
            queryWrapper.eq("initial", brand.getInitial());
        }
        return brandMapper.selectList(queryWrapper);
    }

    @Override
    public Page<Brand> queryPageList(Long currentPage, Long size, Brand brand) {
        // 封装查询条件
        Page<Brand> page = brandMapper.selectPage(
                new Page<Brand>(currentPage, size),
                new QueryWrapper<Brand>()
                        .like("name", brand.getName()));
        return page;
    }

}
