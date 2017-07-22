package com.gavin.business;

/**
 * GETSET注入 Created by zhkj on 2017/7/6.
 */
public class NoConstructorTestBean {

    private ITestBean testBeanOne;

    private ITestBean testBeanTwo;


    public void getPrintMethod(int a) {
        if (a == 1) {
            testBeanOne.print();
        }
        if (a == 2) {
            testBeanTwo.print();
        }
    }





    public ITestBean getTestBeanOne() {
        return testBeanOne;
    }

    public void setTestBeanOne(ITestBean testBeanOne) {
        this.testBeanOne = testBeanOne;
    }

    public ITestBean getTestBeanTwo() {
        return testBeanTwo;
    }

    public void setTestBeanTwo(ITestBean testBeanTwo) {
        this.testBeanTwo = testBeanTwo;
    }

}
