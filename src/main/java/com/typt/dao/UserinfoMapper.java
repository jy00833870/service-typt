package com.typt.dao;

import com.typt.entity.Userinfo;

public interface UserinfoMapper {

    int deleteByPrimaryKey(String id);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Userinfo record);

}