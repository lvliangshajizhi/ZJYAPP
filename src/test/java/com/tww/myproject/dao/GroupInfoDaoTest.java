package com.tww.myproject.dao;

import com.tww.myproject.entity.GroupInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupInfoDaoTest {

    @Autowired
    private GroupInfoDao groupInfoDao;
    @Test
    public void queryGroupInfo() throws Exception {
        GroupInfo groupInfo=new GroupInfo();
    }


}