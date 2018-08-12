package com.tww.myproject.dao;

import com.tww.myproject.entity.UserGroupRel;

import java.util.List;

public interface UserGroupRelDao {
    /**
     *
     * @description: 根据用户ID查询分组对应的ID
     *
     * @author: TWW
     *
     * @return :UserGroupRel
     *
     * @create: 2018-8-9
     **/
    List<UserGroupRel> queryUserGroups(String userId);

}
