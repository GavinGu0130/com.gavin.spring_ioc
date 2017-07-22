import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gavin.business.ConstructorTestBean;
import com.gavin.business.SpringContextUtil;
import com.gavin.business.TestBeanOne;

/**
 * 单元测试 Created by zhkj on 2017/7/6.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/application-context.xml")
public class SpringIOCTest {
    @Autowired
    private ConstructorTestBean constructorTestBean;
    @Test
    public void test() {
        TestBeanOne testBeanOne=SpringContextUtil.getBean("testBeanOne");
        testBeanOne.print();
        constructorTestBean.getPrintMethod(4);
    }
}
