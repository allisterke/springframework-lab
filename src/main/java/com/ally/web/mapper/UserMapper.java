package com.ally.web.mapper;

import com.ally.web.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ally on 7/5/17.
 */
@Mapper
public interface UserMapper {
    @Select("select * from users")
    List<User> getAllUsers();

    @Select("select * from users limit 1")
    User getUser();
}
