package com.mmall.dao;

import com.mmall.pojo.OrderDeail;

public interface OrderDeailMapper {
    int deleteByPrimaryKey(String detailId);

    int insert(OrderDeail record);

    int insertSelective(OrderDeail record);

    OrderDeail selectByPrimaryKey(String detailId);

    int updateByPrimaryKeySelective(OrderDeail record);

    int updateByPrimaryKey(OrderDeail record);
}