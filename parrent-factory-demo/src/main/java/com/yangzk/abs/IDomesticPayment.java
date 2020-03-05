package com.yangzk.abs;

import com.yangzk.method.AliPayFactory;
import com.yangzk.method.UnionPayFactory;
import com.yangzk.method.WechatPayFactory;

public interface IDomesticPayment {

    public AliPayFactory createAliPay();

    public WechatPayFactory createWechatPay();

    public UnionPayFactory createUnionPay();
}
