package com.yangzk.method;

import com.yangzk.IAbroadPay;
import com.yangzk.Paypal;

public interface IAbroadPayFactory {
    public IAbroadPay createPay();
}
