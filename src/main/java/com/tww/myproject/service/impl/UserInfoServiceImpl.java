package com.tww.myproject.service.impl;

import com.tww.myproject.dao.UserInfoDao;
import com.tww.myproject.entity.UserInfo;
import com.tww.myproject.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo getUserInfo(String loginName, String loginpwd, boolean isDel) {
        return userInfoDao.queryUserInfo(loginName,loginpwd,isDel);
    }

    @Transactional
    @Override
    public boolean addUserInfo(UserInfo userInfo) {
        if(null !=userInfo.getLoginName() && "" !=userInfo.getLoginName()){
            userInfo.setUserId("20180811001");
            userInfo.setUserName("MM");
            userInfo.setLoginName("MMMMM");
            userInfo.setLoginPwd("99000");
            userInfo.setPhone("7889996555");
            userInfo.setCreateTime(new Date());
            userInfo.setDel(false);
            userInfo.setSex(true);
            userInfo.setBirthday(new Date());
            userInfo.setPhoto("jjjjjjjjj");
            int effectNum=userInfoDao.insertUserInfo(userInfo);
            try{
                if(effectNum > 0){
                    return  true;
                }else{
                    throw new RuntimeException("插入用户信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("插入用户信息失败！" + e.getMessage());
            }
        }else{
            throw new RuntimeException("插入的用户信息不能为空！");
        }
    }

    @Override
    public boolean modifyUserInfo(UserInfo userInfo) {
        if(null != userInfo.getUserId() && "" !=userInfo.getUserId()){
            userInfo.setUserId("20180809002");
            userInfo.setUserName("w");
            userInfo.setSex(false);
            userInfo.setCreateTime(new Date());
            userInfo.setBirthday(new Date());
            userInfo.setLoginPwd("789");
            userInfo.setLoginName("ccc");
            userInfo.setPhone("1332434435");
            int effectNum=userInfoDao.updateUserInfo(userInfo);
            try{
                if(effectNum >0){
                    return true;
                }else{
                    throw new RuntimeException("更新用户信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("更新用户信息失败！" + e.getMessage());
            }
        }else{
            throw new RuntimeException("更新的用户信息不能为空！");
        }
    }

    @Override
    public boolean deleteUserInfo(String userId) {
        if(null != userId && "" != userId){
            int effectNum = userInfoDao.deleteUserInfo(userId);
            try{
                if(effectNum > 0){
                    return  true;
                }else{
                    throw new RuntimeException("删除用户信息失败！");
                }
            }catch (Exception e){
                throw new RuntimeException("删除用户信息失败！" + e.getMessage());
            }
        }else{
            throw new RuntimeException("删除的用户信息不能为空！");
        }
    }
}
