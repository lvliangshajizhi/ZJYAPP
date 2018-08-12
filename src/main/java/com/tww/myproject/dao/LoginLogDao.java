package com.tww.myproject.dao;

import com.tww.myproject.entity.LoginLog;

import java.util.Date;
import java.util.List;

public interface LoginLogDao {
    /**
     *
     * @description: 查询登录日志
     *
     * @author: TWW
     *
     * @return :LoginLogList
     *
     * @create: 2018-8-9
     **/
    List<LoginLog> queryLoginLogs(String userId);

    /**
     *
     * @description: ??根据时间,参数默认开始时间，当前时间为结束时间??查询登录日志
     *
     * @author: TWW
     *
     * @return :LoginLogList
     *
     * @create: 2018-8-9
     **/
    LoginLog queryLoginLog(Date loginTime);

    /**
     *
     * @description: 插入登录日志
     *
     * @author: TWW
     *
     * @return :LoginLog
     *
     * @create: 2018-8-9
     **/
    int insertLoginLog(LoginLog loginLog);
}
