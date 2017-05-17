package com.etong.mall.dao;

import com.etong.mall.domain.CommonGoodsVO;

public interface CommonGoodsVOMapper {
    int deleteByPrimaryKey(String deptNo);

    int insert(CommonGoodsVO record);

    int insertSelective(CommonGoodsVO record);

    CommonGoodsVO selectByPrimaryKey(String deptNo);

    int updateByPrimaryKeySelective(CommonGoodsVO record);

    int updateByPrimaryKey(CommonGoodsVO record);
}