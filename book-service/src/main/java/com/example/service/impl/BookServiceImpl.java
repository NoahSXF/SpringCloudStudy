package com.example.service.impl;

import com.example.entity.Book;
import com.example.mapper.BookMapper;
import com.example.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @BelongsProject: SpringCloundStudy
 * @BelongsPackage: com.example.service.impl
 * @Author: SXF
 * @CreateTime: 2023-05-04  20:35
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class BookServiceImpl implements BookService {
    @Resource
    BookMapper mapper;

    @Override
    public Book getBookById(int bid) {
        return mapper.getBookById(bid);
    }
}
