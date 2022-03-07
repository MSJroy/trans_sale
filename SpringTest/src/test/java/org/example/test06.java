package org.example;

import org.example.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test06 {

    @Test
    public void MyTest() {
        //指定Sping配置文件
        String resource = "total.xml";
        //创建Spirng容器对象，获取容器：此时容器中的所有对象均已装配完毕
        ApplicationContext ac = new ClassPathXmlApplicationContext(resource);

        Student student = (Student) ac.getBean("myStudent");
        System.out.println("student:"+student);
    }
}
