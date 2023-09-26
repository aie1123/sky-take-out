package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SetmealMapper {

    /**
     * 根据分类id查询套餐的数量
     * @param id
     * @return
     */
    //TODO 待修改#{categoryId}
    @Select("select count(id) from setmeal where category_id = #{id}")
    Integer countByCategoryId(Long id);
}