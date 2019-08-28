package com.example.junitlearning.example;

import org.junit.Test;

/**
 * @ClassName TestTimeout
 * @Description
 * @Author 袁志鑫
 * @Date 2019/8/28 21:09
 */
public class TestTimeout {


    /**
     * 单位是毫秒哦，1s = 1000ms
     */
    @Test(timeout = 1000)
    public void test() {
        System.out.println("如果不超过1s， 我就出现了");
    }

    /**
     * 单位是毫秒哦，1s = 1000ms
     */
    @Test(timeout = 1000)
    public void test1() throws InterruptedException {
        // 这里休眠2s， 让异常信息出现
        Thread.sleep(2000);

        System.out.println("如果超过了1s， 我就莫得了");
    }
}
