package org.example.service.impl;

import org.example.service.SomeService;

public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl() {
        super();
        System.out.println("SomeServicImpl无参数构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("业务方法doSome()");
    }
}
