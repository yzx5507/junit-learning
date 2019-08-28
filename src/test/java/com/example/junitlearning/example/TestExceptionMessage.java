package com.example.junitlearning.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestExceptionMessage 测试异常
 * @Description
 * @Author 袁志鑫
 * @Date 2019/8/28 20:46
 */
public class TestExceptionMessage {


    /**
     * 这个规则是表示你不仅关心有异常抛出,
     * 而且也关心异常信息
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
        List<Object> list = new ArrayList<>();
        thrown.expect(IndexOutOfBoundsException.class);
        // 当异常信息中出现下述字段时，就不会抛出异常，否则抛出IndexOutOfBoundsException异常
        // 这个是正常的
        thrown.expectMessage("Index: 0, Size: 0");

        // 这个是有问题的
        // thrown.expectMessage("1Index: 0, Size: 0");
        list.get(0);
    }
}
