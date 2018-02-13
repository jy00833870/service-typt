package com.typt.service;

import com.typt.dao.UserinfoMapper;
import com.typt.entity.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinfoServcie {

    @Autowired
    UserinfoMapper userinfoMapper;

    public int addUserinfo(Userinfo userinfo){
        return userinfoMapper.insertSelective(userinfo);
    }
}
