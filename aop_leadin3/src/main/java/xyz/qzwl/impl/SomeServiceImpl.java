package xyz.qzwl.impl;

import xyz.qzwl.SomeService;
import xyz.qzwl.service.ServiceTools;

public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        ServiceTools.doLog();
        System.out.println("执行了业务方法doSome");
        ServiceTools.doTrans();
    }

    @Override
    public void doOther() {
        ServiceTools.doLog();
        System.out.println("执行了业务方法doOther");
        ServiceTools.doTrans();
    }
}
