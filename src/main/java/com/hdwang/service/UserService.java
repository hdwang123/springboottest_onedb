package com.hdwang.service;

import com.hdwang.entity.User;

/**
 * Created by hdwang on 2017/6/15.
 */
public interface UserService {

    User getById(int id);

    User getByNumber(String number);

    int addUser(User user);

    void deleteUserById(int id);

    User updateUser(User user,boolean throwEx);
}
