package com.example.junitlearning.example;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @ClassName TestIgnore 忽略测试
 * @Description
 * @Author 袁志鑫
 * @Date 2019/8/28 20:58
 */
@FixMethodOrder(MethodSorters.JVM)
public class TestIgnore {

    @Test
    public void test() {
        System.out.println("이게 꿈인가");
    }


    @Test
    public void test1() {
        System.out.println("大碗宽面");
    }

    @Test
    public void test2() {
        System.out.println("skr skr skr");
    }

    /**
     * 这个是不会执行的单元测试，就是因为加了@Ignore
     */
    @Test
    @Ignore
    public void test3() {
        System.out.println("律师函警告");
    }

    /**
     * 竟然还可以写原因，这也太好用了吧
     */
    @Ignore("没来由的就忽略了，哼，男人")
    @Test
    public void test4() {
        System.out.println("（〃｀ 3′〃）");
    }


    /**
     * 竟然还可以写原因，这也太好用了吧
     */
    @Ignore("没来由的就忽略了，哼，男人111")
    @Test
    public void test5() {
        System.out.println("嘤嘤嘤");
    }
}
