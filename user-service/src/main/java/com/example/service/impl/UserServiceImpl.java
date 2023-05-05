package com.example.service.impl;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @BelongsProject: SpringCloundStudy
 * @BelongsPackage: com.example.service.impl
 * @Author: SXF
 * @CreateTime: 2023-05-04  19:24
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper mapper;

    @Override
    public User getUserById(int id) {
        return mapper.getUserById(id);
    }
}
