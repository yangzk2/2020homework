package com.yangzk;

public class AliPay implements IChinaPay {
    @Override
    public void pay() {
        System.out.println("调用支付宝支付");
    }
}
