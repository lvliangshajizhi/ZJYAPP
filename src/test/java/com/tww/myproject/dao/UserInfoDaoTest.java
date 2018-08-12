package com.tww.myproject.dao;

import com.tww.myproject.entity.UserInfo;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoDaoTest {
    @Autowired
    private UserInfoDao userInfoDao;
    @Test
    @Ignore
    public void queryUserInfo() throws Exception {
        UserInfo userInfo=userInfoDao.queryUserInfo("aaa","111",false);
        assertEquals(true,userInfo.isDel);
    }

    @Test
    public void insertUserInfo() throws Exception {
        UserInfo userInfo=new UserInfo();
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
        assertEquals(1,effectNum);
    }

    @Test
    public void updateUserInfo() throws Exception {
        UserInfo userInfo=new UserInfo();
        userInfo.setUserId("20180809002");
        userInfo.setUserName("w");
        userInfo.setSex(false);
        userInfo.setCreateTime(new Date());
        userInfo.setBirthday(new Date());
        userInfo.setLoginPwd("789");
        userInfo.setLoginName("ccc");
        userInfo.setPhone("1332434435");
        int effectNum=userInfoDao.updateUserInfo(userInfo);
        assertEquals(1,effectNum);
    }

    @Test
    @Ignore
    public void deleteUserInfo() throws Exception {
        int effectNum=userInfoDao.deleteUserInfo("20180809002");
        assertEquals(1,effectNum);
    }

}