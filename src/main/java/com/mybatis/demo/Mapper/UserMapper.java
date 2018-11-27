package com.mybatis.demo.Mapper;

import com.mybatis.demo.Entity.User;

import java.util.List;

/**
 * @author lvixn
 * @date 2018/11/27 19:32
 */
//UserDao
public interface UserMapper {

    List<User> getAll();

    User getOne(Long id);

    void addOne(User user);

    void deleteOne(Long id);

    void updateOne(User id);
}
