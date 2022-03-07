package org.example;

import org.example.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void test01() {
        //指定Sping配置文件
        String resource = "applicationContext.xml";
        //创建Spirng容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        //从Spring容器中获取对象，使用id
        SomeService service = (SomeService) ac.getBean("someService");
        //执行对象的业务方法
        service.doSome();
    }
}
