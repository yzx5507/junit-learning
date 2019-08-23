package com.example.junitlearning.service;

import com.example.junitlearning.bean.User;
import org.springframework.stereotype.Service;

/**
 * @author 袁志鑫
 * @description 用户service
 * @date 2019-08-23 17:19
 */
@Service
public class UserService {

    public User getUser() {
        return new User("1", "测试", "123");
    };
}
