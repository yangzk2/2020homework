package com.yangzk.abs;

import com.yangzk.method.PaypalFactory;
import com.yangzk.method.WesternUnionFactory;

public interface IAbroadPayment {
    public PaypalFactory createPaypal();

    public WesternUnionFactory createWesternUnion();
}
