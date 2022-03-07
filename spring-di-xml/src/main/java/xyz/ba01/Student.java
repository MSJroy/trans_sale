package xyz.ba01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {

    /**
     * 需要在属性上使用注解@Value，该注解的 value 属性用于指定要注入的值。
     * 使用该注解完成属性注入时，类中无需 setter。当然，若属性有 setter，则也可将其加
     * 到 setter 上。
     */
    @Value("吴子木")
    private String name;
    @Value("22")
    private int age;
    @Autowired(required = false)             //该注解默认使用按类型自动装配 Bean 的方式,@Autowired 还有一个属性 required，默认值为 true，表示当匹配失败后，会终止程序运行。若将其值设置为 false，则匹配失败，将被忽略，未匹配的属性值为 null。
    @Qualifier("mySchool")                   //@Qualifier 的 value 属性用于指定要匹配的 Bean 的 id 值。类中无需 set 方法，也可加到 set 方法上。
    private School school;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
