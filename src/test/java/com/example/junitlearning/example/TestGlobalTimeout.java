package com.example.junitlearning.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestGlobalTimeout 一个测试类中所有的测试方法共用一个超时时间
 * @Description
 * @Author 袁志鑫
 * @Date 2019/8/28 21:15
 */
public class TestGlobalTimeout {


    /**
     * 定义一个全局的超时时间，3s
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(3);

    @Test
    public void testSleepForTooLong() throws InterruptedException {
        // 休眠100s
        TimeUnit.SECONDS.sleep(100);
    }

    @Test
    public void testBlockForever() {
        System.out.println("我是袁小鑫");
    }
}
