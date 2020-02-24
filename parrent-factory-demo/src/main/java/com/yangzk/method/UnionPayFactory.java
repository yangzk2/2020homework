package com.yangzk.method;


import com.yangzk.UnionPay;


public class UnionPayFactory implements IPayFactory{

    public UnionPay createPay(){
        return new UnionPay();
    }
}
