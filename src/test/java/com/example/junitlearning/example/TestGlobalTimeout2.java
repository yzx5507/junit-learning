package com.example.junitlearning.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName TestGlobalTimeout2 一个测试类中所有的测试方法共用一个超时时间续集
 * @Description
 * @Author 袁志鑫
 * @Date 2019/8/28 21:20
 */
public class TestGlobalTimeout2 {

    /**
     * 全局超时时间为10s
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    /**
     * 这个方法的执行到失败的时间是5秒,也就是说timeout参数比rule的时
     间要小的话覆盖rule的时间
     */
    @Test(timeout = 1000 * 5)
    public void testSleepForTooLong() throws Exception {
        for (int i = 0; i >= 0; i++) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }


    /**
     * 这个方法的执行到失败的时间是10秒,也就是说timeout参数比rule的
     时间要大的话没法覆盖rule
     */
    @Test(timeout = 1000 * 20)
    public void testSleepForTooLong2() throws Exception {
        for (int i = 0; i >= 0; i++) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
