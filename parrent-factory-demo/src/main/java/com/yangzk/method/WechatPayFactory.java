package com.yangzk.method;


import com.yangzk.WechatPay;


public class WechatPayFactory implements IPayFactory{

    public WechatPay createPay(){
        return new WechatPay();
    }
}
