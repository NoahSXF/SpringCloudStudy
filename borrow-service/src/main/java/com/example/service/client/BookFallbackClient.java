package com.example.service.client;

import com.example.entity.Book;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: SpringCloudStudy
 * @BelongsPackage: com.example.service.client
 * @Author: SXF
 * @CreateTime: 2023-05-07  12:26
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class BookFallbackClient implements BookClient {
    @Override
    public Book findUserById(int bid) {
        return new Book();
    }
}
