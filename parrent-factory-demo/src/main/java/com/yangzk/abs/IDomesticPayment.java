package com.yangzk.abs;

import com.yangzk.method.AliPayFactory;
<<<<<<< HEAD
import com.yangzk.method.UnionPayFactory;
=======
>>>>>>> cad988553f3eda802af725cf2c933db74f7dd707
import com.yangzk.method.WechatPayFactory;

public interface IDomesticPayment {

    public AliPayFactory createAliPay();

    public WechatPayFactory createWechatPay();
<<<<<<< HEAD

    public UnionPayFactory createUnionPay();
=======
>>>>>>> cad988553f3eda802af725cf2c933db74f7dd707
}
