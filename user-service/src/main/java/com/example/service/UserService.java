package com.example.service;

import com.example.entity.User;

/**
 * @BelongsProject: SpringCloundStudy
 * @BelongsPackage: com.example.service
 * @Author: SXF
 * @CreateTime: 2023-05-04  19:21
 * @Description: TODO
 * @Version: 1.0
 */

public interface UserService {
    User getUserById(int id);
}
