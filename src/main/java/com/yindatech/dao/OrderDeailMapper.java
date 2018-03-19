package com.yindatech.dao;

import com.yindatech.pojo.OrderDeail;

public interface OrderDeailMapper {
    int deleteByPrimaryKey(String detailId);

    int insert(OrderDeail record);

    int insertSelective(OrderDeail record);

    OrderDeail selectByPrimaryKey(String detailId);

    int updateByPrimaryKeySelective(OrderDeail record);

    int updateByPrimaryKey(OrderDeail record);
}