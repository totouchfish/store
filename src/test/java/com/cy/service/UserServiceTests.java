package com.cy.service;

import com.cy.entity.User;
import com.cy.service.ex.ServiceException;
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
public class UserServiceTests {
    @Autowired
    private IUserService userService;

    @Test
    public void reg(){
        try {
            User user = new User();
            user.setUsername("bird");
            user.setPassword("12345");
            userService.reg(user);
            System.out.println("ok!");
        } catch (ServiceException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
