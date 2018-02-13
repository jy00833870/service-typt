package com.typt.web;


import com.typt.entity.Userinfo;
import com.typt.service.UserinfoServcie;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userinfo")
@MapperScan("com.typt.dao")
public class UserinfoController {

    @Autowired
    UserinfoServcie userinfoServcie;

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUserinfo(Userinfo userinfo){
        return userinfoServcie.addUserinfo(userinfo);
    }

}
