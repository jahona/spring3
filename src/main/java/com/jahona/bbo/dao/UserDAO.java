package com.jahona.bbo.dao;

import com.jahona.bbo.dto.user.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDAO")
public interface UserDAO {
    @Select(value = "SELECT * FROM User")
    List<User> getList();

    @Insert("INSERT INTO User (account, password, nick_name, phone, sex, expired)" +
            "VALUES (#{account}, #{password}, #{nickName}, #{phone}, #{sex}, #{expired})")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = int.class)
    void create(User user);

    @Select("SELECT * FROM User WHERE ID = #{id}")
    User get(@Param("id") int id);

    @Select("SELECT * FROM User WHERE account = #{account}")
    User getByAccount(@Param("account") String account);

    @Update("UPDATE User SET password = #{password}, nick_name = #{nickName}")
    void update(User user);

    @Delete("DELETE FROM User WHERE id = #{id}")
    void delete(@Param("id") int id);
}