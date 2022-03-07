package org.example;

import org.example.ba04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test04 {
    @Test
    public void test01(){
        String configLocation = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);

        Student student = (Student) ctx.getBean("myStudent04");
        System.out.println("student: "+student);
    }
}
