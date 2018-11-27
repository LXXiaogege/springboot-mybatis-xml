package com.mybatis.demo.User;

import com.mybatis.demo.Entity.User;
import com.mybatis.demo.Mapper.UserMapper;
import com.mybatis.demo.enums.UserSex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author lvixn
 * @date 2018/11/27 20:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoImplTest {

    private final static Logger logger=LoggerFactory.getLogger(UserDaoImplTest.class);

    @Autowired
    UserMapper userMapper;

    @Test
    public void addTest(){
        User user=new User((long)1,"root","123456",UserSex.MAN,"niceroot");
        userMapper.addOne(user);
        logger.info("add success");
    }

}
