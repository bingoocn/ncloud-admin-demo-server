package com.cngc.admin.demo.service;

import com.cngc.admin.demo.dao.UserDao;
import com.cngc.admin.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ServerService {
    @Autowired
    private UserDao userDao;

    public User getUser(String id) {
        return userDao.findById(id).get();
    }

    @Transactional(rollbackFor = Exception.class)
    public void addUser(User user) {
        userDao.save(user);
    }
}
