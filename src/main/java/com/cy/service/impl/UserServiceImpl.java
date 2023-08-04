package com.cy.service.impl;

import com.cy.entity.User;
import com.cy.mapper.UserMapper;
import com.cy.service.IUserService;
import com.cy.service.ex.InsertException;
import com.cy.service.ex.UsernameDuplicatedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.UUID;

/*用户模块业务层的实现类*/
// @Service: 将当前类的对象交给Spring来管理，自动创建对象以及对象的维护
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void reg(User user) {
//        调用findByUsername(username) 判断用户是否被注册过
        String username = user.getUsername();
        User result = userMapper.findByUsername(username);
//        判断结果集是否不为null, 若不为null代表已被注册
        if(result != null){
            throw new UsernameDuplicatedException("用户名被占用！");
        }
//    用户密码加密
        String oldPassword = user.getPassword();
//        获取盐值（随机生成一个盐值）
        String salt = UUID.randomUUID().toString().toUpperCase();
//        将密码和盐值作为一个整体进行加密处理

//        补全默认值
        user.setIsDelete(0);
        user.setCreatedUser(user.getUsername());
        user.setModifiedUser(user.getUsername());
        Date date = new Date();
        user.setCreatedTime(date);
        user.setModifiedTime(date);
//        执行注册业务功能
        Integer rows = userMapper.insert(user);
        if(rows != 1){
            throw new InsertException("在用户注册过程中产生了未知的异常！");
        }
    }

    /*md5加密算算法*/
    private String getMD5Password(String password, String salt){
//        三次md5加密
        for(int i=0; i<3; i++){
            password = DigestUtils.md5DigestAsHex((salt+password+salt).getBytes()).toUpperCase();
        }
        return password;
    }
}
