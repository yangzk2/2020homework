package com.yangzk.abs;


import com.yangzk.method.PaypalFactory;
import com.yangzk.method.WesternUnionFactory;

public class AbroadPaymentFactory implements IAbroadPayment {
    @Override
    public PaypalFactory createPaypal() {
        return new PaypalFactory();
    }

    @Override
    public WesternUnionFactory createWesternUnion() {
        return new WesternUnionFactory();
    }
}
