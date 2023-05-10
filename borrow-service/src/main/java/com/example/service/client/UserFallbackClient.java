package com.example.service.client;

import com.example.entity.User;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: SpringCloudStudy
 * @BelongsPackage: com.example.service.client
 * @Author: SXF
 * @CreateTime: 2023-05-07  09:49
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class UserFallbackClient implements UserClient {
    @Override
    public User findUserById(int uid) {
        return new User();
    }
}
