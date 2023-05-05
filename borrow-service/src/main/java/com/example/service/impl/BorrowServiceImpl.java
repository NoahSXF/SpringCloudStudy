package com.example.service.impl;

import com.example.entity.Book;
import com.example.entity.Borrow;
import com.example.entity.BorrowDetail;
import com.example.entity.User;
import com.example.mapper.BorrowMapper;
import com.example.service.BorrowService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @BelongsProject: SpringCloundStudy
 * @BelongsPackage: com.example.service.impl
 * @Author: SXF
 * @CreateTime: 2023-05-04  20:35
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class BorrowServiceImpl implements BorrowService {
    @Resource
    BorrowMapper mapper;

    @Resource
    RestTemplate restTemplate;

    @Override
    public Borrow getBorrowById(int id) {
        return mapper.getBorrowById(id);
    }

    @Override
    public BorrowDetail getUserBorrow(int uid) {
        List<Borrow> borrows = mapper.getBorrowByUid(uid);

//        调用远程服务
//        RestTemplate restTemplate = new RestTemplate();
//        User user = restTemplate.getForObject("http://localhost:8101/user/" + uid, User.class);
//        List<Book> bookList = borrows.stream().map(b -> restTemplate.getForObject("http://localhost:8201/book/" + b.getBid(), Book.class)).collect(Collectors.toList());
//        return new BorrowDetail(user, bookList);

//        使用注册中心调用外部系统
        User user = restTemplate.getForObject("http://userService/user/" + uid, User.class);
        List<Book> bookList = borrows.stream().map(b -> restTemplate.getForObject("http://bookService/book/" + b.getBid(), Book.class)).collect(Collectors.toList());
        return new BorrowDetail(user, bookList);
    }
}
