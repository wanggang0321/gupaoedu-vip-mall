package com.gupaoedu.vip.mall.goods.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gupaoedu.vip.mall.goods.mapper.CategoryMapper;
import com.gupaoedu.vip.mall.goods.model.Category;
import com.gupaoedu.vip.mall.goods.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wanggang
 * @Date 2021/6/25
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> queryByParentId(Integer pid) {
        // 条件封装
        QueryWrapper<Category> queryWrapper = new QueryWrapper<Category>();
        queryWrapper.eq("parent_id", pid);
        return categoryMapper.selectList(queryWrapper);
    }

}