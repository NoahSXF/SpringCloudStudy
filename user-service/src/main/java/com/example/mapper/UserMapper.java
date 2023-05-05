package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @BelongsProject: SpringCloundStudy
 * @BelongsPackage: com.example.mapper
 * @Author: SXF
 * @CreateTime: 2023-05-04  19:22
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from db_user where uid = #{uid}")
    User getUserById(int id);

}
