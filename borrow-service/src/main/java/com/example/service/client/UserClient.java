package com.example.service.client;

import com.example.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Noah
 */
@FeignClient(value = "userService", fallback = UserFallbackClient.class)
public interface UserClient {
    @RequestMapping("/user/{uid}")
    public User findUserById(@PathVariable("uid") int uid);
}
