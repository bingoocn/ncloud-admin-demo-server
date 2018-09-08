package com.cngc.admin.demo.dao;

import com.cngc.admin.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, String> {

}
