package com.gupaoedu.vip.mall.goods.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gupaoedu.vip.mall.goods.model.SkuAttribute;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description TODO
 * @Author wanggang
 * @Date 2021年06月25日
 */
@Repository
public interface SkuAttributeMapper extends BaseMapper<SkuAttribute> {

    /***
     * 根据分类ID查询属性集合
     * @param id
     * @return
     */
    @Select("SELECT * FROM sku_attribute WHERE id IN(SELECT attr_id FROM category_attr WHERE category_id=#{id})")
    List<SkuAttribute> queryByCategoryId(Integer id);

}
