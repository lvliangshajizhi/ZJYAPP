package com.tww.myproject.web;

import com.tww.myproject.entity.UserInfo;
import com.tww.myproject.service.UserInfoService;
import net.sf.json.JSONObject;
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
    private String getUser(){
        UserInfo userInfo=userInfoService.getUserInfo("ccc","789",false);
        Map<String,Object> userInfoMap=new HashMap<String,Object>();
        userInfoMap.put("MsgId","8888888");
        userInfoMap.put("userId",userInfo.getUserId());
        userInfoMap.put("Msgbody",userInfo);
        userInfoMap.put("Msgtype","随机");
        //java对象变成json对象
        JSONObject jsonObject=JSONObject.fromObject(userInfoMap);
        //json对象转换成json字符串
        String jsonStr=jsonObject.toString();
        return jsonStr;
    }

}
