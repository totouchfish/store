package com.cy.mapper;

import com.cy.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
 * @SpringBootTest:表示当前的类是一个测试类，不会参与打包
 * @RunWith(SpringRunner.class): 启动单元测试类（不写不运行）
 * */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert(){
        User user = new User();
        user.setUsername("cat");
        user.setPassword("12345");
        user.setModifiedUser("aa");
        Integer rows = userMapper.insert(user);
        System.out.println(rows);
    }

    @Test
    public void findByUsername(){
        User user = userMapper.findByUsername("cat");
        System.out.println(user);
    }
}
