package org.example;

import org.example.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void MyTest() {
        //指定Sping配置文件
        String resource = "applicationContext.xml";
        //创建Spirng容器对象，获取容器：此时容器中的所有对象均已装配完毕
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);
        //从Spring容器中获取对象，使用id
        System.out.println(ac.getBean("myDate"));
    }
}
