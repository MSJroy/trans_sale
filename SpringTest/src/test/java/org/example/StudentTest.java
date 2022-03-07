package org.example;


import org.example.ba03.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class StudentTest {

    @Test
    public void test01() {
        String configLocation = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);

        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("student:"+student);

    }

    @Test
    public void test02() {
        String configLocation = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);

        Date date = (Date) ctx.getBean("myDate01");
        System.out.println(date);
    }

    @Test
    public void test03() {
        String configLocation = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);

        Student student = (Student) ctx.getBean("myStudent");
        System.out.println("student:"+student);
    }

    @Test
    public void test04() {
        String configLocation = "applicationContext.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configLocation);

        Student student = (Student) ctx.getBean("myStudent01");
        System.out.println("student:"+student);
    }
}
