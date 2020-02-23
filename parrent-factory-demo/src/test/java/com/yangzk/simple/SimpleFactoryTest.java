package com.yangzk.simple;

import com.yangzk.AliPay;
import com.yangzk.IChinaPay;

import org.junit.Test;

public class SimpleFactoryTest {

    /**
     * 根据名称选择支付方式
     */
    @Test
    public void test1(){
        //创建简单支付工厂
        SimplePaymentFactory factory = new SimplePaymentFactory();
        IChinaPay wechatPay = factory.creatPay("Wechat");
        wechatPay.pay();
    }

    /**
     * 根据Class选择支付方式
     */
    @Test
    public void test2(){
        //创建简单支付工厂
        SimplePaymentFactory factory = new SimplePaymentFactory();
        IChinaPay pay = factory.createPay(AliPay.class);
        pay.pay();
    }
}
