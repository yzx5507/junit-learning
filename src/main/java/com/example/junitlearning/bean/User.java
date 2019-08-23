package com.example.junitlearning.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 袁志鑫
 * @description
 * @date 2019-08-23 17:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    private String id;

    private String username;

    private String password;
}
