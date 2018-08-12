package com.tww.myproject.service;

import com.tww.myproject.entity.UserInfo;

public interface UserInfoService {

    /**
     *
     * @description: 根据登录名和登录密码查询用户信息
     *
     * @author: TWW
     *
     * @return: UserInfo
     *
     * @create: 2018-8-9
     **/
    UserInfo getUserInfo(String loginName,String loginpwd,boolean isDel);

    /**
     *
     * @description:  添加用户信息
     *
     * @author: TWW
     *
     * @return: 添加是否成功
     *
     * @create: 2018-8-9
     **/
    boolean addUserInfo(UserInfo userInfo);

    /**
     *
     * @description:  编辑用户信息
     *
     * @author: TWW
     *
     * @return: 编辑是否成功
     *
     * @create: 2018-8-9
     **/
    boolean modifyUserInfo(UserInfo userInfo);

    /**
     *
     * @description:  删除用户信息
     *
     * @author: TWW
     *
     * @return: 删除是否成功
     *
     * @create: 2018-8-9
     **/
    boolean deleteUserInfo(String userId);
}
