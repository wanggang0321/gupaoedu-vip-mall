package com.gupaoedu.vip.mall.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gupaoedu.vip.mall.goods.Brand;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandMapper extends BaseMapper<Brand> {

    //根据分类ID查询品牌集合
    @Select("select brand_id from category_brand where category_id=#{id}")
    List<Integer> queryBrandIds(Integer id);

}
