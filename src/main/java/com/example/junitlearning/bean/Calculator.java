package com.example.junitlearning.bean;

/**
 * @ClassName Calculator
 * @Description
 * @Author 袁志鑫
 * @Date 2019/8/25 21:11
 */
public class Calculator {

    public int evaluate(String expression) {
        int sum = 0;
        for (String summand: expression.split("\\+")) {
            sum += Integer.valueOf(summand);
        }
        return sum;
    }
}
