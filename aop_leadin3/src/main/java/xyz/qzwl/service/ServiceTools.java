package xyz.qzwl.service;

public class ServiceTools {

    public static void doLog() {
        System.out.println("非业务功能，日志功能，在方法开始时输出日志");
    }

    public static void doTrans() {
        System.out.println("非业务事务功能，在方法执行之后，加入事务");
    }

}