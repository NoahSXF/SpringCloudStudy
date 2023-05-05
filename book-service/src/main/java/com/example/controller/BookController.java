package com.example.controller;

import com.example.entity.Book;
import com.example.service.BookService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @BelongsProject: SpringCloundStudy
 * @BelongsPackage: com.example.controller
 * @Author: SXF
 * @CreateTime: 2023-05-04  20:37
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class BookController {
    @Resource
    BookService bookService;

    @RequestMapping("/book/{bid}")
    public Book findUserById(@PathVariable("bid") int bid) {
        return bookService.getBookById(bid);
    }
}
