package com.cngc.admin.demo.web;

import com.cngc.admin.demo.entity.User;
import com.cngc.admin.demo.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class ServerController {

    @Autowired
    private ServerService bService;

    /**
     * jpa提供web支持,可以直接在controller根据参数查询出领域对象.
     * @param user  人员
     * @return  人员数据
     */
    @GetMapping("/users/{id}")
    public User getUser(@PathVariable("id") User user) {
        return user;
    }

    @PostMapping("/users")
    @ResponseStatus(code= HttpStatus.CREATED)
    public User addUser(User user) {
        bService.addUser(user);
        return user;
    }
}
