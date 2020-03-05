package com.yangzk;

public class WechatPay implements IChinaPay{

    @Override
    public void pay() {
        System.out.println("调用微信支付");
    }
}
