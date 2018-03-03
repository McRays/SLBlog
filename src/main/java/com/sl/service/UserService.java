package com.sl.service;

import com.sl.model.User;

import java.util.List;

public interface UserService {
    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);

    int delUser(User user);
}
