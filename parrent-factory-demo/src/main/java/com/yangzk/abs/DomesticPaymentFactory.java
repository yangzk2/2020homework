package com.yangzk.abs;


import com.yangzk.method.AliPayFactory;
import com.yangzk.method.WechatPayFactory;

public class DomesticPaymentFactory implements IDomesticPayment {


    @Override
    public AliPayFactory createAliPay() {
        return new AliPayFactory();
    }

    @Override
    public WechatPayFactory createWechatPay() {
        return new WechatPayFactory();
    }
}
