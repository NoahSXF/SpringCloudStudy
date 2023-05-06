package com.example.controller;

import com.example.entity.BorrowDetail;
import com.example.service.BorrowService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;

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

    @HystrixCommand(fallbackMethod = "onError")
    @RequestMapping("/borrow/{uid}")
    public BorrowDetail findUserByUid(@PathVariable("uid") int uid) {
        return borrowService.getUserBorrow(uid);
    }


    /**
     * 发生错误时的备选方案
     *
     * @param uid userId
     * @date 2023/5/6 22:18
     * @return: com.example.entity.BorrowDetail
     */
    public BorrowDetail onError(int uid) {
        return new BorrowDetail(null, Collections.emptyList());
    }
}
