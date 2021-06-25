package com.gupaoedu.vip.mall.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gupaoedu.vip.mall.goods.mapper.SkuAttributeMapper;
import com.gupaoedu.vip.mall.goods.model.SkuAttribute;
import com.gupaoedu.vip.mall.goods.service.SkuAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wanggang
 * @Date 2021/6/25
 */
@Service
public class SkuAttributeServiceImpl extends ServiceImpl<SkuAttributeMapper, SkuAttribute> implements SkuAttributeService {

    @Autowired
    private SkuAttributeMapper skuAttributeMapper;

    @Override
    public List<SkuAttribute> queryList(Integer id) {
        return skuAttributeMapper.queryByCategoryId(id);
    }
}
