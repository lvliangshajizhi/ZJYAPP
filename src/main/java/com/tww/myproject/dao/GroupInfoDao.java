package com.tww.myproject.dao;

import com.tww.myproject.entity.GroupInfo;

import java.util.List;

public interface GroupInfoDao {
    /**
     * @return :GroupInfo
     * @description: 根据id查询分组信息
     * @author: TWW
     * @create: 2018-8-9
     **/
    GroupInfo queryGroupInfo(String Id);

    /**
     * @return :int
     * @description: 根据id删除分组信息
     * @author: TWW
     * @create: 2018-8-9
     **/
    int deleteGroupInfo(String Id);
}