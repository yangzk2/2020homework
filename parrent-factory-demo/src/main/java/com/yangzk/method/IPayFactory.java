package com.yangzk.method;

import com.yangzk.IChinaPay;

/**
 * 方法工厂模式
 * 国内支付工厂
 */
public interface IPayFactory {
    public IChinaPay createPay();
}
