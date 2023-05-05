package com.example.mapper;

import com.example.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @BelongsProject: SpringCloundStudy
 * @BelongsPackage: com.example.mapper
 * @Author: SXF
 * @CreateTime: 2023-05-04  19:32
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface BorrowMapper {
    @Select("select * from db_Borrow where id = #{id}")
    Borrow getBorrowById(int id);

    @Select("select * from db_Borrow where uid = #{uid}")
    List<Borrow> getBorrowByUid(int uid);

    @Select("select * from db_Borrow where bid = #{bid}")
    List<Borrow> getBorrowByBid(int bid);

    @Select("select * from db_Borrow where uid = #{uid} and bid = #{bid}")
    Borrow getBorrow(int uid, int bid);
}
