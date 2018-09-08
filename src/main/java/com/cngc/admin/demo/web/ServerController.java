package com.cngc.admin.demo.web;

import com.cngc.admin.demo.entity.User;
import com.cngc.admin.demo.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("b")
public class ServerController {

    @Autowired
    private ServerService bService;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        return bService.getUser(id);
    }

    @PostMapping("/users")
    @ResponseStatus(code= HttpStatus.CREATED)
    public User addUser(User user) {
        bService.addUser(user);
        return user;
    }
}
