package com.example.mapper;

import com.example.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @BelongsProject: SpringCloundStudy
 * @BelongsPackage: com.example.mapper
 * @Author: SXF
 * @CreateTime: 2023-05-04  19:32
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface BookMapper {
    @Select("select * from db_book where bid = #{bid}")
    Book getBookById(int bid);
}
