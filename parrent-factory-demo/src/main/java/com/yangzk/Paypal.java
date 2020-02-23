package com.yangzk;

public class Paypal implements IAbroadPay {
    @Override
    public void pay() {
        System.out.println("贝宝支付");
    }
}
