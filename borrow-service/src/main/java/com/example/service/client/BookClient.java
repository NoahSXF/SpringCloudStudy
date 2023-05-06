package com.example.service.client;

import com.example.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @BelongsProject: SpringCloudStudy
 * @BelongsPackage: com.example.service.client
 * @Author: SXF
 * @CreateTime: 2023-05-06  21:51
 * @Description: TODO
 * @Version: 1.0
 */
@FeignClient("bookService")
public interface BookClient {
    @RequestMapping("/book/{bid}")
    public Book findUserById(@PathVariable("bid") int bid);
}
