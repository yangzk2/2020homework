package com.yangzk.method;

import com.yangzk.AliPay;

public class AliPayFactory implements IPayFactory{
    public AliPay createPay(){
        return new AliPay();
    }
}
