package com.yangzhuo.service;

import com.yangzhuo.domain.User;

import java.util.List;

public interface UserService {
     void save(User user);
     void update(User user);
     void delete(Integer id);
     User findById(Integer id);
     List<User> findAll();
}
