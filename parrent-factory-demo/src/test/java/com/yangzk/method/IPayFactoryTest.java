package com.yangzk.method;

import org.junit.Test;

public class IPayFactoryTest {

    @Test
    public void test1(){
//        IPayFactory payFactory = new AliPayFactory();
        IPayFactory payFactory = new WechatPayFactory();
        payFactory.createPay().pay();

    }
}
