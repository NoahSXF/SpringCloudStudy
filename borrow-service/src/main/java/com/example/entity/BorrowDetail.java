package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

/**
 * @BelongsProject: SpringCloundStudy
 * @BelongsPackage: com.example.entity
 * @Author: SXF
 * @CreateTime: 2023-05-04  21:01
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class BorrowDetail {
    User user;
    List<Book> bookList;
}
