package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @BelongsProject: SpringCloundStudy
 * @BelongsPackage: com.example.controller
 * @Author: SXF
 * @CreateTime: 2023-05-04  19:25
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class UserController {
    @Resource
    UserService userService;

    static int i = 0;

    @RequestMapping("/user/{uid}")
    public User findUserById(@PathVariable("uid") int uid) {
        System.out.println("我被调用了" + ++i);
        return userService.getUserById(uid);
    }
}
