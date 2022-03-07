package org.example;

import org.example.di01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testdi {

    @Test
    public void test01() {
        String configLocation = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(configLocation);

        Student student = (Student) ac.getBean("myStudentdi");
        System.out.println("student:"+student);
    }
}
