package com.example.junitlearning.example;

import com.example.junitlearning.bean.CalculatorTest;
import com.example.junitlearning.bean.CalculatorTest1;
import com.example.junitlearning.bean.CalculatorTest2;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @ClassName TestSuites 套件测试, 按照顺序执行每个测试类中的单元测试
 * @Description
 *
 * Suite注解,告诉Suite runner该套件包含哪些测试类及顺序。
 * 这里的顺序就是CalculatorTest -> CalculatorTest1 -> CalculatorTest2
 *
 * @Author 袁志鑫
 * @Date 2019/8/25 21:59
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        CalculatorTest1.class,
        CalculatorTest2.class
})
public class TestSuite {

}
