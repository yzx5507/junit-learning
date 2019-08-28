package com.example.junitlearning.example;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assume.assumeThat;

/**
 * @ClassName AssumeTest 假设测试
 * @Description
 * @Author 袁志鑫
 * @Date 2019/8/28 21:23
 */
public class AssumeTest {


    /**
     * 这里是假设， 实际上：测试小姐姐是王者， 期望：测试小姐姐是王者
     */
    @Test
    public void filename(){
        assumeThat("测试小姐姐是王者", is("测试小姐姐是王者"));
    }

    /**
     * 这里是假设， 实际上：我不是王者， 期望：我是王者
     */
    @Test
    public void filenameFail(){
        assumeThat("我不是王者", is("我是王者"));
    }



}
