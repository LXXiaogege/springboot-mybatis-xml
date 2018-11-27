package com.mybatis.demo.Controller;

import com.mybatis.demo.Entity.User;
import com.mybatis.demo.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lvixn
 * @date 2018/11/27 19:31
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> getUsers(){
        List<User> users=userMapper.getAll();
        return users;
    }

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getUser(Long id){
        User user=userMapper.getOne(id);
        return user;
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public void addUser(User user){
        userMapper.addOne(user);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable Long id){
        userMapper.deleteOne(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public void updateUser(User user){
        userMapper.updateOne(user);
    }


}
