package com.yangzk.abs;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void test1(){
        PaymentFactory paymentFactory = new PaymentFactory();
        //国外支付
        paymentFactory.abroadPay().createPaypal().createPay().pay();
        //国内支付
        paymentFactory.domesticPay().createWechatPay().createPay().pay();
    }
}
