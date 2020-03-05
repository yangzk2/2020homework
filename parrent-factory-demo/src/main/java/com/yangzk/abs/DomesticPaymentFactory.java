package com.yangzk.abs;


import com.yangzk.method.AliPayFactory;
<<<<<<< HEAD
import com.yangzk.method.UnionPayFactory;
=======
>>>>>>> cad988553f3eda802af725cf2c933db74f7dd707
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
<<<<<<< HEAD

    @Override
    public UnionPayFactory createUnionPay() {
        return new UnionPayFactory();
    }
=======
>>>>>>> cad988553f3eda802af725cf2c933db74f7dd707
}
