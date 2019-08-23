package com.example.junitlearning.web;

import com.example.junitlearning.bean.User;
import com.example.junitlearning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 袁志鑫
 * @description
 * @date 2019-08-23 17:18
 */
@RestController
@RequestMapping("/junit/user")
public class UserController {

    @Autowired
    private UserService userService;

    public User getUser() {
        return userService.getUser();
    }
}
