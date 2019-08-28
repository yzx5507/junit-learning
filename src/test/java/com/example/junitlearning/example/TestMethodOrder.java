package com.example.junitlearning.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @ClassName TestMethodOrder 测试方法的执行顺序
 * @Description 默认是MethodSorters.DEFAULT
 * @Author 袁志鑫
 * @Date 2019/8/28 20:43
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING) // 晚 安 喵 sing a song
//@FixMethodOrder(MethodSorters.DEFAULT) // sing a song 晚 安 喵
//@FixMethodOrder(MethodSorters.JVM) // 随机的顺序
public class TestMethodOrder {

    @Test
    public void wakaka() {
        System.out.println("sing a song");
    }

    @Test
    public void testA() {
        System.out.println("晚");
    }

    @Test
    public void testB() {
        System.out.println("安");
    }

    @Test
    public void testC() {
        System.out.println("喵");
    }
}
