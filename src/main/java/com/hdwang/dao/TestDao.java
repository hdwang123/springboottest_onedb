package com.hdwang.dao;

/**
 * Created by hdwang on 2017/6/16.
 * 手动操作数据库
 */
public interface TestDao {

    void testTransactionManually(boolean throwEx);

    void testJdbcTemplate();
}
