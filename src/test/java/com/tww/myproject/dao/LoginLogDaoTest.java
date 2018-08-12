package com.tww.myproject.dao;

import com.tww.myproject.entity.LoginLog;
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
public class LoginLogDaoTest {
    @Autowired
    private  LoginLogDao loginLogDao;
    @Test
    public void queryLoginLogs() throws Exception {
        LoginLog loginLog=new LoginLog();

    }

    @Test
    public void insertLoginLog() throws Exception {
        LoginLog loginLog=new LoginLog();
        Date date=new Date();
        loginLog.setUserId("20180809001");
        loginLog.setId("20180810001");
        loginLog.setLoginTime(date);
        loginLog.setMobileName("8t");
        loginLog.setMobileNum("6");
        int effectNum=loginLogDao.insertLoginLog(loginLog);
        assertEquals(1,effectNum);
    }

}