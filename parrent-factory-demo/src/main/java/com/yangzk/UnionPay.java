package com.yangzk;

public class UnionPay implements IChinaPay {
    @Override
    public void pay() {
        System.out.println("调用银联支付");
    }
}
