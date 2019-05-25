package com.mmall.dao;

import com.mmall.pojo.Categroy;

public interface CategroyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Categroy record);

    int insertSelective(Categroy record);

    Categroy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Categroy record);

    int updateByPrimaryKey(Categroy record);
}