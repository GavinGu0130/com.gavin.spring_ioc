package com.gavin.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * main方法加载spring容器 Created by zhkj on 2017/7/6.
 */
public class StartBean {
    /**
     * main方法加载spring容器
     * 
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "classpath:/spring/application-context.xml" });
        NoConstructorTestBean noConstructorTestBean = (NoConstructorTestBean) applicationContext.getBean("noConstructorTestBean");
        ConstructorTestBean constructorTestBean = (ConstructorTestBean) applicationContext.getBean("constructorTestBean");
        noConstructorTestBean.getPrintMethod(1);
        noConstructorTestBean.getPrintMethod(2);
        constructorTestBean.getPrintMethod(3);
        constructorTestBean.getPrintMethod(4);
    }
}
