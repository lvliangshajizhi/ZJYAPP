package com.tww.myproject.dao;

import com.tww.myproject.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoDao {

    /**
     *
     * @description: 根据登录名和登录密码查询用户信息
     *
     * @author: TWW
     *
     * @return :UserInfo
     *
     * @create: 2018-8-9
     **/
    UserInfo queryUserInfo(@Param("loginName") String loginName,@Param("loginPwd") String loginPwd,@Param("isdel") boolean isdel);

    /**
     *
     * @description: 插入用户信息
     *
     * @author: TWW
     *
     * @return :影响行
     *
     * @create: 2018-8-9
     **/
    int insertUserInfo(UserInfo userInfo);

    /**
     *
     * @description: 更新用户信息
     *
     * @author: TWW
     *
     * @return :影响行
     *
     * @create: 2018-8-9
     **/
    int updateUserInfo(UserInfo userInfo);

    /**
     *
     * @description: 根据ID找到用户信息，并将Isdel字段改为true
     *
     * @author: TWW
     *
     * @return :影响行
     *
     * @create: 2018-8-9
     **/
    int deleteUserInfo(String userId);

}
