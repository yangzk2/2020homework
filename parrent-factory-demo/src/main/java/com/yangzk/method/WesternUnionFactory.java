package com.yangzk.method;


import com.yangzk.WesternUnion;

public class WesternUnionFactory implements IAbroadPayFactory{

    public WesternUnion createPay(){
        return new WesternUnion();
    }
}
