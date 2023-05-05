package com.example.service;

import com.example.entity.Borrow;
import com.example.entity.BorrowDetail;

public interface BorrowService {
    Borrow getBorrowById(int id);

    BorrowDetail getUserBorrow(int uid);
}
