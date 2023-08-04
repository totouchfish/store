package com.cy.mapper;

import com.cy.entity.User;
import org.springframework.stereotype.Repository;

@Repository(value ="userMapper")
public interface UserMapper {
    /**
     * 插入用户的数据
     * @param user 用户的数据
     * @return 受影响的行数（c、u、d都受影响的行数作为返回值，可以根据返回值来判断是否执行成功
     * */
    Integer insert(User user);

    /**
     * 根据用户名来查询用户数据
     * @param username
     * @return 用户数据或者null
     */
    User findByUsername(String username);


}
