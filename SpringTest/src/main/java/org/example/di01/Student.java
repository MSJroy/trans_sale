package org.example.di01;

import org.springframework.stereotype.Component;

// 注解参数中忽略了value属性，该属性用于指定Bean的id

/**
 * 另外，Spring 还提供了 3 个创建对象的注解：
 * ➢ @Repository 用于对 DAO 实现类进行注解
 * ➢ @Service 用于对 Service 实现类进行注解
 * ➢ @Controller 用于对 Controller 实现类进行注解
 * 这三个注解与@Component 都可以创建对象，但这三个注解还有其他的含义，@Service
 * 创建业务层对象，业务层对象可以加入事务功能，@Controller 注解创建的对象可以作为处
 * 理器接收用户的请求。
 * @Repository，@Service，@Controller 是对@Component 注解的细化，标注不同层的对
 * 象。即持久层对象，业务层对象，控制层对象。
 */
@Component(value = "myStudentdi")
public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
