package org.example;

import org.example.impl.SomeServiceImpl;

/**
 * 定义好接口与一个实现类，该实现类中除了要实现接口中的方法外，还要再写两个非
 * 业务方法。非业务方法也称为交叉业务逻辑：
 * ➢ doTransaction()：用于事务处理
 * ➢ doLog()：用于日志处理
 */
public class aop {
    public static void main(String[] args) {
        SomeServiceImpl service = new SomeServiceImpl();
        service.doOther();
        service.doTrans();
        service.doLog();
    }
}
