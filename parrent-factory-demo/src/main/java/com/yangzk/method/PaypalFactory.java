package com.yangzk.method;


import com.yangzk.Paypal;

public class PaypalFactory implements IAbroadPayFactory{

    public Paypal createPay(){
        return new Paypal();
    }
}
