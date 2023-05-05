package com.example.controller;

import com.example.entity.BorrowDetail;
import com.example.service.BorrowService;
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
public class BorrowController {
    @Resource
    BorrowService borrowService;
//    @RequestMapping("/borrow/{id}")
//    public Borrow findUserById(@PathVariable("id") int id){
//        return borrowService.getBorrowById(id);
//    }

    @RequestMapping("/borrow/{uid}")
    public BorrowDetail findUserByUid(@PathVariable("uid") int uid) {
        return borrowService.getUserBorrow(uid);
    }

}
