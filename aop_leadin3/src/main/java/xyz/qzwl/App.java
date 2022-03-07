package xyz.qzwl;

import xyz.qzwl.impl.SomeServiceImpl;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        // 创建代理对象
        SomeService target = new SomeServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(target);

        SomeService proxy = (SomeService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        // 通过代理对象执行业务方法，实现日志，事务的增强
        proxy.doSome();
        proxy.doOther();
    }
}
