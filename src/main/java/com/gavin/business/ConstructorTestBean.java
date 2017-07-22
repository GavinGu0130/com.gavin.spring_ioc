package com.gavin.business;

/**
 * 构造器注入 Created by zhkj on 2017/7/6.
 */
public class ConstructorTestBean {

    private ITestBean testBeanThree;

    private String testString;

    public ConstructorTestBean(ITestBean testBeanThree, String testString) {
        this.testBeanThree = testBeanThree;
        this.testString = testString;
    }

    public void getPrintMethod(int a) {
        if (a == 3) {
            testBeanThree.print();
        }
        if (a == 4) {
            System.out.println(testString);
        }
    }
}
