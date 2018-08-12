package com.tww.myproject.web;

import com.tww.myproject.entity.UserInfo;
import com.tww.myproject.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class UserController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/getUserInfo",method= RequestMethod.GET)
    private Map<String,UserInfo> getUser(){
        UserInfo userInfo=userInfoService.getUserInfo("ccc","789",false);
        Map<String,UserInfo> userInfoMap=new HashMap<String,UserInfo>();
        userInfoMap.put("user",userInfo);
        return userInfoMap;
    }

}
